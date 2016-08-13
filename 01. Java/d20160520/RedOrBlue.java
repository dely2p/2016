package d20160520;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class RedOrBlue extends Frame{

	Button rbtn,bbtn;					// 버튼 두개 생성
	
	RedOrBlue(){
		super();
		
		rbtn = new Button("Red");		// 빨간 버튼
		bbtn = new Button("Blue");		// 파란버튼
		
		setTitle("Red Or Blue");		// 타이틀
		setLocation(400, 300);			// 프레임 위치
		setSize(400, 300);				// 프레임 크기
		

		
		setVisible(true);				// 보여주기
	}
}
