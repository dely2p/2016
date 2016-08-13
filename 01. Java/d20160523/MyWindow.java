package d20160523;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindow extends Frame implements WindowListener{
	public MyWindow(String title) {
		super(title);	// 부모 매개변수 중 String을 매개변수로 같는 생성자를 호출
		setBounds(50, 50, 800, 600);
		this.addWindowListener(this);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyWindow("종료창만들기");
	}
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("창이 처음 열렸을 때 호출");
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료중일때 호출된다.");
		System.exit(0);	// 정상 종료
		// 0번 이외에 다른 값을 넣으면 비정상 종료
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("현재창이 닫힌 후에 호출된다.");
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("최소화 버튼을 누르면 호출");
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("창이 아이콘상태에서 되돌아 올때 호출");
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("창이 활성화 되었을 때");
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("창이 비활성화 되었을 때");
		
	}
}
