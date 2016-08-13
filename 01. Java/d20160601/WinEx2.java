package d20160601;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinEx2 extends Frame{
	public WinEx2() {
		setBounds(100, 100, 600, 400);
		
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
		
		g.drawArc(200, 100, 200, 200, 0, 360);
		g.drawArc(240, 150, 50, 50, 40, 100);
		g.drawArc(310, 150, 50, 50, 40, 100);
		g.drawArc(245, 160, 40, 40, 0, 360);
		g.drawArc(315, 160, 40, 40, 0, 360);
		g.fillArc(260, 180, 10, 10, 0, 360);
		g.fillArc(330, 180, 10, 10, 0, 360);
		g.fillRect(295, 210, 8, 15);
		g.drawArc(270, 210, 60, 60, 180, 180);
		
	}
	public static void main(String[] args) {
		new WinEx2();
	}
	
}
