package d20160523;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class GuGuWin extends Frame implements ActionListener{
	TextField tf;
	Label lb;
	Button btn;
	int dan;
	char[] arr;
	GuGuWin(){
		setBounds(150,150,500,400);			// 창 위치, 크기 설정
		setLayout(null);					// 배치관리자 안씀
		setTitle("구구단");
		
		// 컴포넌트 초기화
		btn = new Button("출력");
		tf = new TextField();
		lb = new Label("단",Label.CENTER);
		//lb.setBackground(Color.red);
				
		tf.setBounds(150, 100, 150, 50);	// textfield 위치, 크기 설정
		lb.setBounds(350, 100, 50, 50);		// label 위치, 크기 설정
		btn.setBounds(150, 200, 200, 50);	// button 위치, 크기 설정
		
		btn.addActionListener(this);		// button 엑션리스너 
		
		add(btn);							// 버튼추가
		add(tf);							// 텍스트 필드 추가
		add(lb);							// 라벨 추가
		setVisible(true);					// 보여주기
	}

	public static void main(String[] args) {
		new GuGuWin();						// GuGuWin 클래스 생성
	}
	@Override
	public void actionPerformed(ActionEvent e) {		
		String data = tf.getText();			// 텍스트필드 값을 받아옴
		dan = Integer.parseInt(data);		// integer로 형변환
		System.out.println("단 : "+dan);
		if(dan>1 && dan<10){				// 2단~9단 사이만 
			for(int i=1;i<=9;i++)			// 구구단 출력
				System.out.println(dan+" * "+i+" = "+dan*i);
		}
		tf.setText("");						// 텍스트필드 내용 지우기
	}
}
