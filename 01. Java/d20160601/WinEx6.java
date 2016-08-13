package d20160601;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinEx6 extends Frame{

	
	Image img;
	public WinEx6() {
	
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		img = tool.getImage("src/image2/1.jpg");
		tool.getScreenSize(); // 현재 화면의 크기
		Dimension d = tool.getScreenSize(); // x,y좌표를 하나의 객체로 받음
		// 화면의 너비
		int w = (int)d.getWidth();
		// 화면의 높이
		int h = (int)d.getHeight();
		
		int x = w/2-800/2;
		int y = h/2-600/2;
		
		setBounds(x, y, 800, 600);
		
		
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
		g.drawImage(img, 10, 10, 800,600,this);
	}
	
	public static void main(String[] args) {
		new WinEx6();
	}
}
