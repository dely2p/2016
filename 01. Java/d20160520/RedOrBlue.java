package d20160520;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class RedOrBlue extends Frame{

	Button rbtn,bbtn;					// ��ư �ΰ� ����
	
	RedOrBlue(){
		super();
		
		rbtn = new Button("Red");		// ���� ��ư
		bbtn = new Button("Blue");		// �Ķ���ư
		
		setTitle("Red Or Blue");		// Ÿ��Ʋ
		setLocation(400, 300);			// ������ ��ġ
		setSize(400, 300);				// ������ ũ��
		

		
		setVisible(true);				// �����ֱ�
	}
}
