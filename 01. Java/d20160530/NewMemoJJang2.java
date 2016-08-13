package d20160530;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
// char �޸���(�ѱ� ����)
public class NewMemoJJang2 extends JFrame implements ActionListener{
	
	JTextArea jta;
	JScrollPane jsp;
	JMenuBar jmb;
	JMenu jFile, jHelp;
	JMenuItem jmiNew, jmiOpen, jmiSave, jmiExit, jmiHelp;
	public NewMemoJJang2() {
		
		super("������� - �޸���");
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
		new NewMemoJJang2();
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
			int dig = jfc.showOpenDialog(this);	// Ž���� ����
			if(dig==0){ // ���� true
				File f = jfc.getSelectedFile();	// ���� �޾ƿ�
				FileReader fr = null;		// fileinputstream �ʱ�ȭ
				BufferedReader br = null;		// bufferinputstream ����
				StringBuffer sb = new StringBuffer();	// stringbuffer ����
				String data = null;
				try {
					fr = new FileReader(f);	// fileinputstream ����
					br = new BufferedReader(fr);	// bufferinputstream ����
					while((data=br.readLine())!=null){		// ���� ���� ������
						sb.append(data+"\n");			// stringbuffer�� ��´�.
					}
				} catch (FileNotFoundException e1) {	// ����ó��
					e1.printStackTrace();
				} catch (IOException ie) {		// ����ó��
					ie.printStackTrace();
				}
				jta.setText(sb.toString());		
				
			}
			System.out.println(dig);
			System.out.println("���� �޴������� Ŭ������ ��");
		}else if(obj==jmiSave){ // ����
			JFileChooser jfc = new JFileChooser("c:\\"); // c����̹� ����
			int dig = jfc.showSaveDialog(this);		// ������ Ž���� ����
			if(dig==0){ // ����
				File f = jfc.getSelectedFile();		// �ش� uri �����ͼ�
				FileWriter fw = null;
				BufferedWriter bw = null;
				//byte[] b = jta.getText().getBytes(); // method chain���� ���� ������
				String data = jta.getText();				
				
				try {
					fw = new FileWriter(f);	// fileoutputstream ����
					bw = new BufferedWriter(fw); // bufferOutputstream ����
					bw.write(data+"\n");	// ���� �ֱ�
					bw.flush();	// ���� ��� ����
				
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException ie) {
					ie.printStackTrace();
				}
				// a.txt
				String name = f.getName();
				String n = name.substring(0, name.indexOf("."));
				setTitle(n+" - �޸���");
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
