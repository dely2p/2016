package d20160601;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class TCanvas extends JPanel{

	Image img;
	Canvas c;
	
	public TCanvas(Image img) {
		this.img = img;	// img의 주소를 가져와서
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 10, 10, 800, 600, this);	// 해당 위치에 그려줌
	}
}
