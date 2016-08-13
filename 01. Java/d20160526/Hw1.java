package d20160526;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Hw1 extends JFrame implements ActionListener{
	JButton imgbtn,rndbtn;
	ImageIcon[] img;
	public Hw1(){
		setBounds(100, 100, 800, 600);		// UI 설정
		setLayout(null);
		setTitle("Hw1");
		
		img = new ImageIcon[4];
		rndbtn = new JButton("랜덤");
		for(int i=0;i<img.length;i++){			
			img[i] = new ImageIcon("src/image2/"+i+".jpg");		// 연예인 사진이 있는 주소를 넣어준다.
			imgbtn = new JButton(img[i]);						// 버튼 생성
			//imgbtn.setVisible(false);
		}
		
		imgbtn.setBounds(100, 50, 600, 400);
		rndbtn.setBounds(200, 500, 400, 30);
		add(imgbtn);
		add(rndbtn);		
		
		rndbtn.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// close 누르면 종료
	}
	public static void main(String[] args) {
		new Hw1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int choice=0;
		for(int i=0;i<img.length;i++){
			choice=(int)(Math.random()*img.length);		// 랜덤값을 주며
		}
		imgbtn.setIcon(img[choice]);					// 이미지를 랜덤으로 보여준다.
		
		
		
	}
}
