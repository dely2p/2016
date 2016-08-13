package d20160523;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindow extends Frame implements WindowListener{
	public MyWindow(String title) {
		super(title);	// �θ� �Ű����� �� String�� �Ű������� ���� �����ڸ� ȣ��
		setBounds(50, 50, 800, 600);
		this.addWindowListener(this);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyWindow("����â�����");
	}
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("â�� ó�� ������ �� ȣ��");
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("�������϶� ȣ��ȴ�.");
		System.exit(0);	// ���� ����
		// 0�� �̿ܿ� �ٸ� ���� ������ ������ ����
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("����â�� ���� �Ŀ� ȣ��ȴ�.");
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("�ּ�ȭ ��ư�� ������ ȣ��");
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("â�� �����ܻ��¿��� �ǵ��� �ö� ȣ��");
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("â�� Ȱ��ȭ �Ǿ��� ��");
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("â�� ��Ȱ��ȭ �Ǿ��� ��");
		
	}
}
