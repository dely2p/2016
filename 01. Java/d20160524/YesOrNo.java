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
		lb = new Label("당신은 잘생겼다고 생각하십니까?",Label.CENTER);	// 라벨 가운데 정렬로 생성
		btny = new Button("Yes");					// Yes 버튼 생성
		btnn = new Button("No");					// No 버튼 생성
		
		setBounds(350, 200, 800, 600);				// 윈도우 창 위치, 크기 설정
		setTitle("Yes Or No");						// 윈도우 타이틀 설정
		setLayout(null);							// 레이아웃 초기화
		
		lb.setBounds(150, 200, 500, 100);			// 라벨 위치, 크기 설정
		lb.setBackground(Color.yellow);				// 라벨 색깔 설정
		btny.setBounds(150, 400, 200, 50);			// Yes 버튼 위치, 크기 설정
		btnn.setBounds(450, 400, 200, 50);			// No 버튼 위치, 크기 설정
		
		add(lb);									// 라벨 추가
		add(btny);									// Yes 버튼 추가
		add(btnn);									// No 버튼 추가
		
		this.addWindowListener(this);				// 윈도우리스너 부착
		this.addMouseMotionListener(this);
		setVisible(true);							// 보여주기
		
	}

	public static void main(String[] args) {
		new YesOrNo();								// 클래스 생성
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
		// Yes 버튼의 중앙좌표
		int bx = btny.getX()+100;		// 마우스 좌표
		int by = btny.getY()+25;
		
		// 현재 마우스의 좌표
		int x = e.getX();
		int y = e.getY();
		
	
		btny.setLocation(x, y);
		
		
	}
}
