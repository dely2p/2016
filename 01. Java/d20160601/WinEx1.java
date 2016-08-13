package d20160601;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinEx1 extends Frame{
	public WinEx1(){
		setBounds(100,100,800,600);
		
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
		super.paint(g); // 부모가 가지고 있는 paint메소드를 호출하시오
		// 직선 그리기
		g.drawLine(100, 100, 200, 200);
		// 사각형 그리기
		g.drawRect(200, 200, 150, 150);
		// 원 그리기
		g.drawOval(200, 200, 150, 150); // 좌표, 크기
		// 타원 그리기
		g.drawArc(100, 100, 100, 100, 0, 100); // 해당 위치에 0도에서 100도까지 곡선 그리기
		// 사각형 채우기
		g.fillRect(300, 300, 50, 50);

		g.setColor(Color.red); // 채우기 색깔 바꿈
		
		g.fillOval(400, 300, 50, 50);
		
		g.drawString("아영씨와 오빠들", 200, 200);
	}
	public static void main(String[] args) {
		new WinEx1();
	}

}
