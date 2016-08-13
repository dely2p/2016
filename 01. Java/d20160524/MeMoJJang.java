package d20160524;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class MeMoJJang extends Frame implements ActionListener{

	TextArea area;
	MenuBar mb;
	Menu muFile,muHelp;
	MenuItem miNew, miOpen, miSave, miExit, miHelp;
	
	public MeMoJJang() {
		super("�޸���");
		
		area = new TextArea();
		
		miNew = new MenuItem("���θ����");			// �޴������� ����
		miOpen = new MenuItem("����");
		miSave = new MenuItem("����");
		miExit = new MenuItem("����");
		miHelp = new MenuItem("���򸻺���");
		
		muFile = new Menu("����(F)");				// �޴� ����
		muHelp = new Menu("����");
		
		mb = new MenuBar();						// �޴� �� ����
		
		muFile.add(miNew);						// �޴��� �޴������� �߰���
		muFile.add(miOpen);
		muFile.add(miSave);
		muFile.addSeparator();
		muFile.add(miExit);
		
		muHelp.add(miHelp);						// �޴��� �޴������� �߰�
		
		mb.add(muFile);							// �޴��ٿ� �޴� �߰�
		mb.add(muHelp);
		
		setMenuBar(mb);							// �޴��� ����
		
		miNew.addActionListener(this);			// ���Ǹ����� ����
		miOpen.addActionListener(this);
		miSave.addActionListener(this);
		miExit.addActionListener(this);
		miHelp.addActionListener(this);
		
		setBounds(100, 100, 600, 400);

		add(area);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){			// �߻�޼��� �θ� �͸�innerŬ������ �ٷ� ��
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new MeMoJJang();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==miNew){						// ���θ���� �޴�������
			System.out.println("���θ����");
			area.getText();
			area.setText("");
		}
		else if(obj==miExit){				// ���� �޴�������
			System.out.println("�����մϴ�.");
			System.exit(0);
		}
		
	}
}
