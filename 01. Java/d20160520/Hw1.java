package d20160520;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Hw1 extends Frame{
	
	Button[] btn;								// �������
	
	Hw1(){										// ������
		
		//setSize(400, 300);					// ������ size
		//setLocation(400, 300);				// ������ ��ġ
		setBounds(400,300,400,300);				// x, y, �ʺ�, ����
		
		FlowLayout f = new FlowLayout();		// FlowLayout
		setLayout(f);							// ���̾ƿ� ����
		setTitle("��ư ��ġ");						// Ÿ��Ʋ ����
		
		btn = new Button[50];					// ��ư ���� ���� 50�� ����
		for(int i=0;i<50;i++){
			btn[i] = new Button("��"+(i+1));	// ��ư ����
		}
		
		for(int i=0;i<btn.length;i++)
			add(btn[i]);						// ��ư �߰�
		
		setVisible(true);						// �����ֱ�
	}
	public static void main(String[] args) {
		Hw1 h = new Hw1();

	}
}
