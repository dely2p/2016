package d20160601;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinEx1 extends Frame{
	public WinEx1(){
		setBounds(100,100,800,600);
		
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
		super.paint(g); // �θ� ������ �ִ� paint�޼ҵ带 ȣ���Ͻÿ�
		// ���� �׸���
		g.drawLine(100, 100, 200, 200);
		// �簢�� �׸���
		g.drawRect(200, 200, 150, 150);
		// �� �׸���
		g.drawOval(200, 200, 150, 150); // ��ǥ, ũ��
		// Ÿ�� �׸���
		g.drawArc(100, 100, 100, 100, 0, 100); // �ش� ��ġ�� 0������ 100������ � �׸���
		// �簢�� ä���
		g.fillRect(300, 300, 50, 50);

		g.setColor(Color.red); // ä��� ���� �ٲ�
		
		g.fillOval(400, 300, 50, 50);
		
		g.drawString("�ƿ����� ������", 200, 200);
	}
	public static void main(String[] args) {
		new WinEx1();
	}

}
