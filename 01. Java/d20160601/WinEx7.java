package d20160601;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class WinEx7 extends JFrame{
	
	Image img;
	TCanvas can;
	Container panel;
	
	public WinEx7() {
	
		Toolkit tool = Toolkit.getDefaultToolkit();	// Toolkit 받아옴
		img = tool.getImage("src/image2/0.jpg");	// 이미지 경로

		Dimension d = tool.getScreenSize();	// 화면크기 받아옴
		int w = (int)d.getWidth();	// 화면가로
		int h = (int)d.getHeight();	// 화면세로
		
		int x = w/2-800/2;	// 화면중앙 x위치
		int y = h/2-600/2;	// 화면중앙 y위치
		setBounds(x, y, 800, 600);	// 위치 설정
		
		can = new TCanvas(img);		// 클래스를 생성함
		panel = getContentPane();	// 패널을 가져옴
		panel.add(can);	// 패널에 생성한 클래스를 부착
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// 창 종료
		setVisible(true);	// 보여주기
	}
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.drawImage(img, 10, 10, 800,600,this);	// 그림 뿌리기
	}

	public static void main(String[] args) {
		new WinEx7();
	}
}
