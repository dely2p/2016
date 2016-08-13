package d20160523;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends Frame implements ActionListener{
	Button btnlog,btnrs;
	Label lid,lpw;
	TextField tid,tpw;
	
	Login(){
		// 컴포넌트 생성
		btnlog = new Button("로그인");
		btnrs = new Button("Reset");
		lid = new Label("ID");
		lpw = new Label("PW");
		tid = new TextField();
		tpw = new TextField();
		tpw.setEchoChar('*');
		// 프레임 위치, 사이즈
		setBounds(550,250,500,300);
		setLayout(null); // 보더 레이아웃 없앰
		setTitle("로그인");
		// 컴포넌트 위치, 사이즈
		lid.setBounds(120, 50, 50, 50);				// 라벨 설정
		lpw.setBounds(120, 100, 50, 50);
		tid.setBounds(170, 50, 200, 45);			// 텍스트필드 설정
		tpw.setBounds(170, 100, 200, 45);
		btnlog.setBounds(120, 200, 100, 50);		// 버튼 설정
		btnrs.setBounds(270, 200, 100, 50);
		Color c = new Color(103,205,103);
		btnlog.setBackground(c);					// 버튼 색깔 설정
		Color c1 = new Color(200,205,77);
		btnrs.setBackground(c1);					// 버튼2 색깔 설정
		// 각 컴포넌트 추가
		add(btnlog);
		add(btnrs);
		add(lid);
		add(lpw);
		add(tid);
		add(tpw);
		// 버튼 리스너 부착
		btnlog.addActionListener(this);
		btnrs.addActionListener(this);
		// 보여주기
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getActionCommand() : 라벨 글자
		// e.getSource() : 참조객체
		
		Object obj = e.getSource();				// 참조객체 뽑아오기
		System.out.println(obj);
		System.out.println("id : "+tid.getText()+", pw : "+tpw.getText());
		if(obj == btnlog){			// 로그인버튼이면
			if(tid.getText().equals("aaa") && tpw.getText().equals("bbb")){	// id, pw가 각각 같으면
				System.out.println("로그인되었습니다.");							// 로그인
				new GuGuWin();
			}
			else															// 아니면
				System.out.println("아이디 또는 패스워드가 다릅니다.");					// 다름 메시지 띄움
		}else if(obj == btnrs){												// reset 버튼
			System.out.println("다시입력하세요.");
			tid.getText();
			tid.setText("");
			tpw.getText();                                                                      
			tpw.setText("");
		}
	}
}
