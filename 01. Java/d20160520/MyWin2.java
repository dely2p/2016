package d20160520;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.xml.sax.HandlerBase;

public class MyWin2 extends Frame{
	
	Button btn;
	
	MyWin2(){
		super();					// Frame으로부터 상속받음
		// 컴포넌트 초기화
		btn = new Button("날 클릭해봐!! ");		
		
		setLocation(400, 200);		// 창의 위치는 좌측상단으로부터 (400,200)
		setSize(500, 300);			// 사이즈는 (500,300)
		setTitle("MyWin2.java");	// 창의 타이틀 설정
		// event 처리
		// 1. event source 결정
		// 2. 감지기 부착
		// Handler는 ActionListener 인터페이스를 구현한 클래스
		Handler hd = new Handler();
		btn.addActionListener(hd);	// 인터페이스를 구현한 객체가 들어감
		// add();
		add(btn);
		
		setVisible(true);			// 창이 보이게 함(보통 제일 마지막에 둠)		
	}
} // MyWin2 class end

class Handler implements ActionListener{ //자바파일명과 같은 클래스만 public 가능

	@Override
	public void actionPerformed(ActionEvent e) {
		// 내가 하고자 하는 작업..
		System.out.println("왜 날 클릭해 버럭~~ ");
		System.out.println("종료합니다..");
		System.exit(0); // 0 : 정상 종료(다른 값은 비정상 종료)
	} 	
}
