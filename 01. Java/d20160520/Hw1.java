package d20160520;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Hw1 extends Frame{
	
	Button[] btn;								// 멤버변수
	
	Hw1(){										// 생성자
		
		//setSize(400, 300);					// 프레임 size
		//setLocation(400, 300);				// 프레임 위치
		setBounds(400,300,400,300);				// x, y, 너비, 높이
		
		FlowLayout f = new FlowLayout();		// FlowLayout
		setLayout(f);							// 레이아웃 설정
		setTitle("버튼 배치");						// 타이틀 설정
		
		btn = new Button[50];					// 버튼 넣을 공간 50개 생성
		for(int i=0;i<50;i++){
			btn[i] = new Button("라벨"+(i+1));	// 버튼 생성
		}
		
		for(int i=0;i<btn.length;i++)
			add(btn[i]);						// 버튼 추가
		
		setVisible(true);						// 보여주기
	}
	public static void main(String[] args) {
		Hw1 h = new Hw1();

	}
}
