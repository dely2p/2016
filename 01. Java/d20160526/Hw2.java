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
		setBounds(100, 100, 800, 600);				// UI����
		setLayout(null);
		setTitle("Hw2");
		
		
		img = new ImageIcon[45]; // �ζ� �̹��� ���ε�
		for(int i=0;i<img.length;i++){
			img[i] = new ImageIcon("src/lottoImage/ball"+(i+1)+".png");			
		}
		fimg = new ImageIcon("src/lottoImage/ball46.png");
		
		num = new JButton[6];
		for(int i=0;i<num.length;i++){ // ����� �̹���(��ư)
			for(int j=0;j<img.length;j++){
				//num[i] = new JButton(img[j]);
				num[i] = new JButton(fimg); 
				num[i].setBounds(120+(i*100), 200, 50, 50); // UI
				//num[i].setBackground(Color.yellow);
				add(num[i]);
			}
		}
		btn = new JButton("�ζ� �귿!");
		btn.setBounds(100, 400, 600, 80);
		btn.addActionListener(this);
		add(btn);	
		for(int i=0;i<6;i++)
			num[i].setIcon(fimg);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// close ������ ����
	}
	public static void main(String[] args) {
		new Hw2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int[] choice = new int[6];
			HashSet<Integer> hs = new HashSet<Integer>();	// HashSet�� �����Ͽ� �ߺ������� �� ����Ѵ�.
			while(hs.size()<6){								// size�� 6�� �� ������	
			int c = (int)(Math.random()*45);				// ���� ���� �̾Ƴ���.
			hs.add(c);										// �� ���� HashSet�� �߰��Ѵ�.
		}
		
		
		Iterator<Integer> it = hs.iterator();				// iterator�� HashSet�� �� ���� �ϳ��� �и��ؼ�
		for(int i=0;i<choice.length;i++){
			choice[i] = it.next();							// �迭�� �ִ´�.
		}
		bubblesort(choice);									// bubblesort �� �ϰ�
		//Arrays.sort(choice);
		
		for(int i=0;i<choice.length;i++){			
			num[i].setIcon(img[choice[i]]);					// �� ��ư�� �̹����� �־� ����Ѵ�.
			
		}
	}
}
