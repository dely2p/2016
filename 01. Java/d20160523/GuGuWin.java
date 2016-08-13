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
		setBounds(150,150,500,400);			// â ��ġ, ũ�� ����
		setLayout(null);					// ��ġ������ �Ⱦ�
		setTitle("������");
		
		// ������Ʈ �ʱ�ȭ
		btn = new Button("���");
		tf = new TextField();
		lb = new Label("��",Label.CENTER);
		//lb.setBackground(Color.red);
				
		tf.setBounds(150, 100, 150, 50);	// textfield ��ġ, ũ�� ����
		lb.setBounds(350, 100, 50, 50);		// label ��ġ, ũ�� ����
		btn.setBounds(150, 200, 200, 50);	// button ��ġ, ũ�� ����
		
		btn.addActionListener(this);		// button ���Ǹ����� 
		
		add(btn);							// ��ư�߰�
		add(tf);							// �ؽ�Ʈ �ʵ� �߰�
		add(lb);							// �� �߰�
		setVisible(true);					// �����ֱ�
	}

	public static void main(String[] args) {
		new GuGuWin();						// GuGuWin Ŭ���� ����
	}
	@Override
	public void actionPerformed(ActionEvent e) {		
		String data = tf.getText();			// �ؽ�Ʈ�ʵ� ���� �޾ƿ�
		dan = Integer.parseInt(data);		// integer�� ����ȯ
		System.out.println("�� : "+dan);
		if(dan>1 && dan<10){				// 2��~9�� ���̸� 
			for(int i=1;i<=9;i++)			// ������ ���
				System.out.println(dan+" * "+i+" = "+dan*i);
		}
		tf.setText("");						// �ؽ�Ʈ�ʵ� ���� �����
	}
}
