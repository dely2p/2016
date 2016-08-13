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
		// ������Ʈ ����
		btnlog = new Button("�α���");
		btnrs = new Button("Reset");
		lid = new Label("ID");
		lpw = new Label("PW");
		tid = new TextField();
		tpw = new TextField();
		tpw.setEchoChar('*');
		// ������ ��ġ, ������
		setBounds(550,250,500,300);
		setLayout(null); // ���� ���̾ƿ� ����
		setTitle("�α���");
		// ������Ʈ ��ġ, ������
		lid.setBounds(120, 50, 50, 50);				// �� ����
		lpw.setBounds(120, 100, 50, 50);
		tid.setBounds(170, 50, 200, 45);			// �ؽ�Ʈ�ʵ� ����
		tpw.setBounds(170, 100, 200, 45);
		btnlog.setBounds(120, 200, 100, 50);		// ��ư ����
		btnrs.setBounds(270, 200, 100, 50);
		Color c = new Color(103,205,103);
		btnlog.setBackground(c);					// ��ư ���� ����
		Color c1 = new Color(200,205,77);
		btnrs.setBackground(c1);					// ��ư2 ���� ����
		// �� ������Ʈ �߰�
		add(btnlog);
		add(btnrs);
		add(lid);
		add(lpw);
		add(tid);
		add(tpw);
		// ��ư ������ ����
		btnlog.addActionListener(this);
		btnrs.addActionListener(this);
		// �����ֱ�
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getActionCommand() : �� ����
		// e.getSource() : ������ü
		
		Object obj = e.getSource();				// ������ü �̾ƿ���
		System.out.println(obj);
		System.out.println("id : "+tid.getText()+", pw : "+tpw.getText());
		if(obj == btnlog){			// �α��ι�ư�̸�
			if(tid.getText().equals("aaa") && tpw.getText().equals("bbb")){	// id, pw�� ���� ������
				System.out.println("�α��εǾ����ϴ�.");							// �α���
				new GuGuWin();
			}
			else															// �ƴϸ�
				System.out.println("���̵� �Ǵ� �н����尡 �ٸ��ϴ�.");					// �ٸ� �޽��� ���
		}else if(obj == btnrs){												// reset ��ư
			System.out.println("�ٽ��Է��ϼ���.");
			tid.getText();
			tid.setText("");
			tpw.getText();                                                                      
			tpw.setText("");
		}
	}
}
