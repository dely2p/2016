package d20160524;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ControlButton extends Frame implements KeyListener{
	Button btn;
	int key;
	int x;
	int y;
	
	ControlButton(){
		btn = new Button("^.^");
		setBounds(200, 50, 1000, 800);
		setLayout(null);
		setTitle("Contol");
		btn.setBounds(100, 100, 100, 100);
		btn.setBackground(Color.yellow);
		btn.addKeyListener(this);
		add(btn);
		setVisible(true);
		
		// â ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new ControlButton();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) { // Ű���� ���� ��
		key = e.getKeyCode();
		System.out.println("key : "+key);
		int x = btn.getX();
		int y = btn.getY();
		
		if(key==37)				// ����
			x-=3;
		else if(key==38)		// ����
			y-=3;
		else if(key==39)		// ������
			x+=3;	
		else if(key==40)		// �Ʒ�
			y+=3;
		else if(key==32){ // �����̽� ������ ����
			for(int i=0;i<50;i++){	// �ö�
				y-=1;
				btn.setLocation(x, y);			
				try {
					Thread.sleep(10);	// ������
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			for(int i=0;i<50;i++){ // ������
				y+=1;
				btn.setLocation(x, y);			
				try {
					Thread.sleep(10);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		btn.setLocation(x, y);	// ��ġ ����
		
	}
	@Override
	public void keyReleased(KeyEvent e) { // Ű���� ������ ����

		
	}
}
