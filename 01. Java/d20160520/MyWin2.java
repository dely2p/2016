package d20160520;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.xml.sax.HandlerBase;

public class MyWin2 extends Frame{
	
	Button btn;
	
	MyWin2(){
		super();					// Frame���κ��� ��ӹ���
		// ������Ʈ �ʱ�ȭ
		btn = new Button("�� Ŭ���غ�!! ");		
		
		setLocation(400, 200);		// â�� ��ġ�� ����������κ��� (400,200)
		setSize(500, 300);			// ������� (500,300)
		setTitle("MyWin2.java");	// â�� Ÿ��Ʋ ����
		// event ó��
		// 1. event source ����
		// 2. ������ ����
		// Handler�� ActionListener �������̽��� ������ Ŭ����
		Handler hd = new Handler();
		btn.addActionListener(hd);	// �������̽��� ������ ��ü�� ��
		// add();
		add(btn);
		
		setVisible(true);			// â�� ���̰� ��(���� ���� �������� ��)		
	}
} // MyWin2 class end

class Handler implements ActionListener{ //�ڹ����ϸ�� ���� Ŭ������ public ����

	@Override
	public void actionPerformed(ActionEvent e) {
		// ���� �ϰ��� �ϴ� �۾�..
		System.out.println("�� �� Ŭ���� ����~~ ");
		System.out.println("�����մϴ�..");
		System.exit(0); // 0 : ���� ����(�ٸ� ���� ������ ����)
	} 	
}
