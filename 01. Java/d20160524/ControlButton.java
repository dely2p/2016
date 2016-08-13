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
		
		// 창 종료
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
	public void keyPressed(KeyEvent e) { // 키보드 누를 때
		key = e.getKeyCode();
		System.out.println("key : "+key);
		int x = btn.getX();
		int y = btn.getY();
		
		if(key==37)				// 왼쪽
			x-=3;
		else if(key==38)		// 위쪽
			y-=3;
		else if(key==39)		// 오른쪽
			x+=3;	
		else if(key==40)		// 아래
			y+=3;
		else if(key==32){ // 스페이스 누르면 점프
			for(int i=0;i<50;i++){	// 올라감
				y-=1;
				btn.setLocation(x, y);			
				try {
					Thread.sleep(10);	// 쓰레드
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			for(int i=0;i<50;i++){ // 내려감
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
		btn.setLocation(x, y);	// 위치 수정
		
	}
	@Override
	public void keyReleased(KeyEvent e) { // 키보드 눌렀다 뗄때

		
	}
}
