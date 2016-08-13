package d20160527;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
// byte �޸���
public class NewMemoJJang extends JFrame implements ActionListener{
	
	JTextArea jta;
	JScrollPane jsp;
	JMenuBar jmb;
	JMenu jFile, jHelp;
	JMenuItem jmiNew, jmiOpen, jmiSave, jmiExit, jmiHelp;
	public NewMemoJJang() {
		
		super("¦���޸��� ver 0.01");
		setBounds(150, 150, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		// â����
		
		jta = new JTextArea();							// textarea ����
		jsp = new JScrollPane(jta,						// ��ũ�� ����(�ʿ��� ��)
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jmb = new JMenuBar();							// �޴��� ����
		jFile = new JMenu("����(F)");						// �޴� ����	
		jHelp = new JMenu("����");						
		jmiNew = new JMenuItem("���θ����");				// �޴� ������ ����
		jmiOpen = new JMenuItem("����");
		jmiSave = new JMenuItem("����");
		jmiExit = new JMenuItem("����");
		jmiHelp = new JMenuItem("���򸻺���");
		
		jFile.add(jmiNew);								// �޴��� �޴������� �ֱ�
		jFile.add(jmiOpen);
		jFile.add(jmiSave);
		jFile.addSeparator();							// ���м�
		jFile.add(jmiExit);						
		
		jHelp.add(jmiHelp);
		
		jmb.add(jFile);									// �޴��ٿ� �޴� �ֱ�
		jmb.add(jHelp);
		
		setJMenuBar(jmb);								// �޴��ٿ� ���� �޴��� ����
		
		Font f = new Font("Gothic",Font.BOLD,30);		// ����ü, ũ�� ����
		jta.setFont(f);
				
		add(jsp);	
		
		setVisible(true);
		
		jmiNew.addActionListener(this);					// ���Ǹ����� ����
		jmiOpen.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiExit.addActionListener(this);
		jmiHelp.addActionListener(this);

	
	}
	public static void main(String[] args) {
		new NewMemoJJang();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();		
		if(obj==jmiNew){ // ���θ����
			String data = jta.getText();
			if(data.length()!=0){
				// Ȯ��â
				int result = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�? ","Ȯ��",JOptionPane.YES_NO_OPTION); // ���⿡/ ����/ ��ư/ ��,�ƴϿ�,��� ��ư ����
				System.out.println("result : "+result);
				if(result==0){ // yes
					System.out.println("�����ϱ�");
				}else{ // no
					jta.setText("");
				}
			}else{
				jta.setText("");
			}
			
		}else if(obj==jmiOpen){ // ����
			// ���� �޴������� Ŭ������ ��
			JFileChooser jfc = new JFileChooser("c:\\"); // c����̹� ����
			int dig = jfc.showOpenDialog(this);
			if(dig==0){ // ����
				File f = jfc.getSelectedFile();
				//System.out.println((f.toString());
				System.out.println(f.getAbsolutePath());
			}
			System.out.println(dig);
			System.out.println("���� �޴������� Ŭ������ ��");
		}else if(obj==jmiSave){
			JFileChooser jfc = new JFileChooser("c:\\"); // c����̹� ����
			int dig = jfc.showSaveDialog(this);
			if(dig==0){ // ����
				File f = jfc.getSelectedFile();
				System.out.println(f.getAbsolutePath());
			}
			System.out.println(dig);
			System.out.println("���� �޴������� Ŭ������ ��");		
		}else if(obj==jmiHelp){
			JOptionPane.showMessageDialog(this, "�� ���α׷��� ������ ���۱��� ������ �������� ������ �� ����� ���� ������ ����, ���� ���� ���ְ� ��������", "�޷�", JOptionPane.OK_OPTION);
		}
		else if(obj==jmiExit){ // �����ϱ�
			System.exit(0);
		}
		
	}
}
