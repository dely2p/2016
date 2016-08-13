package d20160601;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinEx5 extends Frame implements MouseListener{
	//int x1=-100, y1=-100, x2=-100 , y2=-100;
	int x1=100, y1=100, x2=200 , y2=200;
	
	public WinEx5() {		
		
		setBounds(100, 100, 800, 600);
		
		addWindowListener(new WindowAdapter(){			// 추상메서드 부모를 익명inner클래스로 바로 씀
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		addMouseListener(this);
		
		setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawOval(x1, y1, x2-x1, y2-y1);
	}
	
	public static void main(String[] args) {
		new WinEx5();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("누를 때 호출");
		x1 = e.getX();
		y1 = e.getY();
		System.out.println("x1 : "+x1+" y1 : "+y1);
		//System.out.println("x2 : "+x2+" y2 : "+y2);
	}
	@Override
	public void update(Graphics g) {
		//super.update(g); // 자동으로 지우고 페인트 메서드 호출
		paint(g);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("뗄 때 호출");
		x2 = e.getX();
		y2 = e.getY();
		//System.out.println("x1 : "+x1+" y1 : "+y1);
		System.out.println("x2 : "+x2+" y2 : "+y2);
		// 다시 그리기
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
