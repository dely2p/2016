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
		setBounds(100, 100, 800, 600);		// UI ����
		setLayout(null);
		setTitle("Hw1");
		
		img = new ImageIcon[4];
		rndbtn = new JButton("����");
		for(int i=0;i<img.length;i++){			
			img[i] = new ImageIcon("src/image2/"+i+".jpg");		// ������ ������ �ִ� �ּҸ� �־��ش�.
			imgbtn = new JButton(img[i]);						// ��ư ����
			//imgbtn.setVisible(false);
		}
		
		imgbtn.setBounds(100, 50, 600, 400);
		rndbtn.setBounds(200, 500, 400, 30);
		add(imgbtn);
		add(rndbtn);		
		
		rndbtn.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// close ������ ����
	}
	public static void main(String[] args) {
		new Hw1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int choice=0;
		for(int i=0;i<img.length;i++){
			choice=(int)(Math.random()*img.length);		// �������� �ָ�
		}
		imgbtn.setIcon(img[choice]);					// �̹����� �������� �����ش�.
		
		
		
	}
}
