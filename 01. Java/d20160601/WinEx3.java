package d20160601;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class WinEx3 extends Frame implements ActionListener{
	Button btn;
	Random rnd = new Random();
	
	public WinEx3() {
		setBounds(100, 100, 800, 600);
		setLayout(null);
		
		btn = new Button();		
		add(btn);
		btn.setBounds(300, 500, 200, 50);
		btn.addActionListener(this);
		
		addWindowListener(new WindowAdapter(){			// 추상메서드 부모를 익명inner클래스로 바로 씀
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);

	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		for(int i=0;i<2000;i++){
		// 랜덤한 위치와 크기로 그리기
		g.setColor(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
		g.drawOval(rnd.nextInt(800), rnd.nextInt(600), rnd.nextInt(300), rnd.nextInt(300));
		//g.drawOval(150, 150, 100, 100);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
		
	public static void main(String[] args) {
		new WinEx3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("글자 나옴");
		
		
	}
}
