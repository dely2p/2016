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
		tool.getScreenSize(); // ���� ȭ���� ũ��
		Dimension d = tool.getScreenSize(); // x,y��ǥ�� �ϳ��� ��ü�� ����
		// ȭ���� �ʺ�
		int w = (int)d.getWidth();
		// ȭ���� ����
		int h = (int)d.getHeight();
		
		int x = w/2-800/2;
		int y = h/2-600/2;
		
		setBounds(x, y, 800, 600);
		
		
		addWindowListener(new WindowAdapter(){			// �߻�޼��� �θ� �͸�innerŬ������ �ٷ� ��
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
