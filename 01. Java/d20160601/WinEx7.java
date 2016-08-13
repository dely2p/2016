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
	
		Toolkit tool = Toolkit.getDefaultToolkit();	// Toolkit �޾ƿ�
		img = tool.getImage("src/image2/0.jpg");	// �̹��� ���

		Dimension d = tool.getScreenSize();	// ȭ��ũ�� �޾ƿ�
		int w = (int)d.getWidth();	// ȭ�鰡��
		int h = (int)d.getHeight();	// ȭ�鼼��
		
		int x = w/2-800/2;	// ȭ���߾� x��ġ
		int y = h/2-600/2;	// ȭ���߾� y��ġ
		setBounds(x, y, 800, 600);	// ��ġ ����
		
		can = new TCanvas(img);		// Ŭ������ ������
		panel = getContentPane();	// �г��� ������
		panel.add(can);	// �гο� ������ Ŭ������ ����
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// â ����
		setVisible(true);	// �����ֱ�
	}
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.drawImage(img, 10, 10, 800,600,this);	// �׸� �Ѹ���
	}

	public static void main(String[] args) {
		new WinEx7();
	}
}
