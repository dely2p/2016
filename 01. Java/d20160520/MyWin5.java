package d20160520;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin5 extends Frame implements ActionListener{
	
	Button redBtn, blueBtn;						// 멤버변수
	
	MyWin5(){									// 생성자
		redBtn = new Button("red");				// red 버튼 생성
		blueBtn = new Button("blue");			// blue 버튼 생성	
		setBounds(300, 300, 300, 300);			// 프레임 사이즈 설정
		
		// Frame 배치관리자: BorderLayout
		setLayout(null); // 배치관리자를 안씀
		
		// 이벤트 소스 : redBtn,blueBtn
		redBtn.addActionListener(this);			// red버튼 엑션리스너 부착
		blueBtn.addActionListener(this);		// blue버튼 엑션리스너 부착
		
		// 컴포넌트 크기와 위치를 지정해야 사용가능
		/*redBtn.setSize(150, 150);
		redBtn.setLocation(0, 150);*/
		redBtn.setBounds(0, 150, 150, 150);		// red버튼 사이즈 ,위치 설정
		add(redBtn);							// 버튼 추가
		/*blueBtn.setSize(150, 150);
		blueBtn.setLocation(150, 150);*/
		blueBtn.setBounds(150, 150, 150, 150);	// blue버튼 사이즈, 위치 설정
		add(blueBtn);							// 버튼 추가
		setVisible(true);						// 보여주기
		
	}
	public static void main(String[] args) {
		new MyWin5();							// MyWin5 클래스 생성
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("e : "+e);
		//System.out.println(e.getActionCommand());
		String cmd = e.getActionCommand();
		Object obj  = e.getSource();
		if(obj == redBtn){					// 버튼 커맨드가 red면
			Color c = new Color(100,200,150);
			this.setBackground(c);
			System.out.println("빨강버튼 눌림");
			//setBackground(Color.red);			// 배경을 빨간색으로
		}
		else if(cmd.equals("blue")){			// 아니면
			System.out.println("파랑버튼 눌림");
			setBackground(Color.blue);			// 배경을 파란색으로
		}
	}
}

