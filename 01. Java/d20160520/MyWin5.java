package d20160520;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin5 extends Frame implements ActionListener{
	
	Button redBtn, blueBtn;						// �������
	
	MyWin5(){									// ������
		redBtn = new Button("red");				// red ��ư ����
		blueBtn = new Button("blue");			// blue ��ư ����	
		setBounds(300, 300, 300, 300);			// ������ ������ ����
		
		// Frame ��ġ������: BorderLayout
		setLayout(null); // ��ġ�����ڸ� �Ⱦ�
		
		// �̺�Ʈ �ҽ� : redBtn,blueBtn
		redBtn.addActionListener(this);			// red��ư ���Ǹ����� ����
		blueBtn.addActionListener(this);		// blue��ư ���Ǹ����� ����
		
		// ������Ʈ ũ��� ��ġ�� �����ؾ� ��밡��
		/*redBtn.setSize(150, 150);
		redBtn.setLocation(0, 150);*/
		redBtn.setBounds(0, 150, 150, 150);		// red��ư ������ ,��ġ ����
		add(redBtn);							// ��ư �߰�
		/*blueBtn.setSize(150, 150);
		blueBtn.setLocation(150, 150);*/
		blueBtn.setBounds(150, 150, 150, 150);	// blue��ư ������, ��ġ ����
		add(blueBtn);							// ��ư �߰�
		setVisible(true);						// �����ֱ�
		
	}
	public static void main(String[] args) {
		new MyWin5();							// MyWin5 Ŭ���� ����
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("e : "+e);
		//System.out.println(e.getActionCommand());
		String cmd = e.getActionCommand();
		Object obj  = e.getSource();
		if(obj == redBtn){					// ��ư Ŀ�ǵ尡 red��
			Color c = new Color(100,200,150);
			this.setBackground(c);
			System.out.println("������ư ����");
			//setBackground(Color.red);			// ����� ����������
		}
		else if(cmd.equals("blue")){			// �ƴϸ�
			System.out.println("�Ķ���ư ����");
			setBackground(Color.blue);			// ����� �Ķ�������
		}
	}
}

