package d20160520;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MyWin3 extends Frame {

	Button btn1,btn2,btn3,btn4,btn5; 
	
	public MyWin3(){	
		
		
		
		// â�� ũ��� : �ʺ� 400, ���� 400
		setSize(400, 400);
		// ��ġ : 450, 400
		setLocation(450, 400);
		// ���񿡴� ��ư ��ġ
		setTitle("��ư ��ġ");
		// ������Ʈ �ʱ�ȭ
		btn1 = new Button("��");
		btn2 = new Button("��");
		btn3 = new Button("��");
		btn4 = new Button("��");
		btn5 = new Button("�߾�");
		
		FlowLayout f1 = new FlowLayout();			// FlowLayout ��ü ����
		setLayout(f1);								// ���� Frame�� �⺻ ��ġ�����ڸ� FlowLayout���� ����
		
		add(btn1,"East");
		add(btn2,"West");
		add(btn3,"South");
		add(btn4,"North");
		add(btn5,"Center");
		// ������Ʈ�� ��ġ�ϱ� ���� �ϱ� ���� ��ġ �����ڸ� ����
		// Frame�� �⺻ ��ġ ������  : ���� ���̾ƿ�
		
		// â�� ���̰� ����
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MyWin3 mw3 = new MyWin3();				// MyWin3 Ŭ���� ����
		
	}
}