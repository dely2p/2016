package d20160520;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinGGD extends Frame{
	
	Button btn;									// ��ưŬ���� ����
	public String str;
	
	WinGGD(){
		super();
		btn = new Button("3�����");				// 3����� ��ư
		
		setLocation(400, 300);					// ��ġ
		setSize(400,300);						// ������
		setTitle("������");						// Ÿ��Ʋ
		
		Handler1 hd = new Handler1();			// �ڵ鷯 ����
		btn.addActionListener(hd);				// ��ư�� ���Ǹ����� �߰�
		add(btn);								// ��ư �߰�
		setVisible(true);						// �����ֱ�
		
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