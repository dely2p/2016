package d20160526;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Racing extends JFrame implements ActionListener{
	
	Horse h1,h2,h3;
	JButton jbtn1,jbtn2,jbtn3,jbtnStart;
	ImageIcon img1,img2,img3,img,bg;

	
	Racing(){
		setBounds(100, 100, 1300, 400);
		
		
		img1 = new ImageIcon("src/image/horse.gif");	// �̹��� ������ url ����
		img2 = new ImageIcon("src/image/horse.gif");
		img3 = new ImageIcon("src/image/horse.gif");
		img = new ImageIcon("src/image/icon.jpg");
		bg = new ImageIcon("src/image/icon.jpg");
		
		jbtnStart = new JButton("RUN");					// jbutton ����
		jbtn1 = new JButton(img1);
		jbtn2 = new JButton(img2);
		jbtn3 = new JButton(img3);		
		
		setLayout(null);
		setIconImage(img.getImage());
		//setBackground(bg.getImage());
		setTitle("Racing.java");
		
		
		jbtn1.setBounds(30, 50, 120, 60);			// ��ư ��ġ ����
		jbtn2.setBounds(30, 50+80, 120, 60);
		jbtn3.setBounds(30, 50+80+80, 120, 60);
		jbtnStart.setBounds(200, 320, 200, 30);		
		
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);	
		add(jbtnStart);	
		
		jbtnStart.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// close ������ ����
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Racing();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==jbtnStart){
			if(h1==null){
				Horse h1 = new Horse(jbtn1);		// �� horse����
				Horse h2 = new Horse(jbtn2);
				Horse h3 = new Horse(jbtn3);
				h1.start();							// thread start
				h2.start();
				h3.start();	
			}
		}
		
	}
}
