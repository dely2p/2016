package d20160520;

// API (Application Programming Interface)
import java.awt.Frame;
// 자바언어에서 많이 사용되는 클래스는
// java.lang 패키지에 있음
// 생략가능
//import java.lang.*;


public class MyWin extends Frame{
	public MyWin(){
		super("내가 만든 윈도우");					// 부모(Frame)의 기본생성자
		setVisible(true); 			// 화면에 보이게 설정
		setSize(400, 300); 			// 창의 크기를 조절(너비:400, 높이:300)
		setLocation(300, 300);		// 창의 위치 이동
		//타이틀 주기
		setTitle("내가 만든 윈도우");
		//super("내가만든 윈도우")도 동일하게 실행됨
		
		
	}
}
