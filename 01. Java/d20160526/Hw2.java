package d20160526;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Hw2 extends JFrame implements ActionListener{
	JButton btn;
	JButton[] num;
	ImageIcon[] img;
	ImageIcon fimg;
	
	void bubblesort(int[] m){					// bubblesort
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m.length-i-1;j++){
				if(m[j]>m[j+1]){
					int tmp = m[j];
					m[j] = m[j+1];
					m[j+1] = tmp;
				}
			}
		}
	}
	
	
	public Hw2(){
		setBounds(100, 100, 800, 600);				// UI설정
		setLayout(null);
		setTitle("Hw2");
		
		
		img = new ImageIcon[45]; // 로또 이미지 업로드
		for(int i=0;i<img.length;i++){
			img[i] = new ImageIcon("src/lottoImage/ball"+(i+1)+".png");			
		}
		fimg = new ImageIcon("src/lottoImage/ball46.png");
		
		num = new JButton[6];
		for(int i=0;i<num.length;i++){ // 출력할 이미지(버튼)
			for(int j=0;j<img.length;j++){
				//num[i] = new JButton(img[j]);
				num[i] = new JButton(fimg); 
				num[i].setBounds(120+(i*100), 200, 50, 50); // UI
				//num[i].setBackground(Color.yellow);
				add(num[i]);
			}
		}
		btn = new JButton("로또 룰렛!");
		btn.setBounds(100, 400, 600, 80);
		btn.addActionListener(this);
		add(btn);	
		for(int i=0;i<6;i++)
			num[i].setIcon(fimg);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// close 누르면 종료
	}
	public static void main(String[] args) {
		new Hw2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int[] choice = new int[6];
			HashSet<Integer> hs = new HashSet<Integer>();	// HashSet를 생성하여 중복제거할 때 사용한다.
			while(hs.size()<6){								// size가 6이 될 때까지	
			int c = (int)(Math.random()*45);				// 랜덤 값을 뽑아낸다.
			hs.add(c);										// 그 값을 HashSet에 추가한다.
		}
		
		
		Iterator<Integer> it = hs.iterator();				// iterator로 HashSet에 든 값을 하나씩 분리해서
		for(int i=0;i<choice.length;i++){
			choice[i] = it.next();							// 배열에 넣는다.
		}
		bubblesort(choice);									// bubblesort 를 하고
		//Arrays.sort(choice);
		
		for(int i=0;i<choice.length;i++){			
			num[i].setIcon(img[choice[i]]);					// 각 버튼에 이미지를 넣어 출력한다.
			
		}
	}
}
