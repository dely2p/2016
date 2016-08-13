package d20160520;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinGGD extends Frame{
	
	Button btn;									// 버튼클래스 선언
	public String str;
	
	WinGGD(){
		super();
		btn = new Button("3단출력");				// 3단출력 버튼
		
		setLocation(400, 300);					// 위치
		setSize(400,300);						// 사이즈
		setTitle("구구단");						// 타이틀
		
		Handler1 hd = new Handler1();			// 핸들러 생성
		btn.addActionListener(hd);				// 버튼에 엑션리스너 추가
		add(btn);								// 버튼 추가
		setVisible(true);						// 보여주기
		
	}
}
class Handler1 implements ActionListener{		

	@Override
	public void actionPerformed(ActionEvent e) {

		for(int i=1;i<=9;i++){
			System.out.println("3 * "+i+" = "+3*i);
		}		
	}	
}