package d20160524;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class YesOrNo extends Frame implements WindowListener,MouseMotionListener {
	Label lb;
	Button btny;
	Button btnn;
	YesOrNo(){
		lb = new Label("����� �߻���ٰ� �����Ͻʴϱ�?",Label.CENTER);	// �� ��� ���ķ� ����
		btny = new Button("Yes");					// Yes ��ư ����
		btnn = new Button("No");					// No ��ư ����
		
		setBounds(350, 200, 800, 600);				// ������ â ��ġ, ũ�� ����
		setTitle("Yes Or No");						// ������ Ÿ��Ʋ ����
		setLayout(null);							// ���̾ƿ� �ʱ�ȭ
		
		lb.setBounds(150, 200, 500, 100);			// �� ��ġ, ũ�� ����
		lb.setBackground(Color.yellow);				// �� ���� ����
		btny.setBounds(150, 400, 200, 50);			// Yes ��ư ��ġ, ũ�� ����
		btnn.setBounds(450, 400, 200, 50);			// No ��ư ��ġ, ũ�� ����
		
		add(lb);									// �� �߰�
		add(btny);									// Yes ��ư �߰�
		add(btnn);									// No ��ư �߰�
		
		this.addWindowListener(this);				// �����츮���� ����
		this.addMouseMotionListener(this);
		setVisible(true);							// �����ֱ�
		
	}

	public static void main(String[] args) {
		new YesOrNo();								// Ŭ���� ����
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//System.out.println(e.getX()+" , "+e.getY());
		//btny.setBounds(150, 400, 200, 50); 251,428
		// Yes ��ư�� �߾���ǥ
		int bx = btny.getX()+100;		// ���콺 ��ǥ
		int by = btny.getY()+25;
		
		// ���� ���콺�� ��ǥ
		int x = e.getX();
		int y = e.getY();
		
	
		btny.setLocation(x, y);
		
		
	}
}
