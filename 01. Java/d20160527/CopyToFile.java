package d20160527;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CopyToFile extends JFrame implements ActionListener{
	
	JTextField inputtf, outputtf;
	JButton sourcebtn, destbtn, copy, close;
	
	
	public CopyToFile(){
		super("���Ϻ����");
		setBounds(100, 100, 600, 400);
		setLayout(null);
		
		inputtf = new JTextField();
		outputtf = new JTextField();			// jtextfield����

		sourcebtn = new JButton("Source");
		destbtn = new JButton("Dest");
		copy = new JButton("����");
		close = new JButton("����");				// jbutton ����
		
		inputtf.setBounds(200, 100, 300, 30);
		outputtf.setBounds(200, 200, 300, 30);
		sourcebtn.setBounds(50, 100, 100, 30);
		destbtn.setBounds(50, 200, 100, 30);
		copy.setBounds(150, 300, 100, 50);
		close.setBounds(300, 300, 100, 50);		// UI��ġ
		add(inputtf);
		add(outputtf);
		add(sourcebtn);
		add(destbtn);
		add(copy);
		add(close);								// UI�� �߰�
		
		inputtf.addActionListener(this);
		outputtf.addActionListener(this);
		sourcebtn.addActionListener(this);
		destbtn.addActionListener(this);
		copy.addActionListener(this);
		close.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		// â����
		
	}
	public static void main(String[] args){
		new CopyToFile();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==copy){
			String srcuri =	inputtf.getText();			// ������ ���� uri ����
			String desturi = outputtf.getText();		// ������ ���� uri ����
			
			File f1 = new File(srcuri);					// ���� ����
			File f2 = new File(desturi);
			try{										// ����ó��
				FileInputStream fi = new FileInputStream(f1);	// ���� ��Ʈ�� ����
				FileOutputStream fo = new FileOutputStream(f2);
				int val = 0;
				while((val=fi.read())!=-1){						// ������ 1byte�� �о�ͼ� ���� �� ������
					fo.write(val);								// ������ ���Ͽ� �Է��Ѵ�.
				}
			}catch(IOException e1){
				System.out.println("����");
			}
			
		}else if(obj==close){								// �����ư�� ������ ����
			System.exit(0);
		}else if(obj==sourcebtn){							// ������ ���� Ž���⸦ ���� ��ư�� ������
			JFileChooser jfc = new JFileChooser("c:\\");	// JFileChooser�� �����ϰ�
			int c = jfc.showOpenDialog(this);				// Ž���⸦ ����� 
			if(c==0){										// ���𰡸� ����
				String in = jfc.getSelectedFile().getAbsolutePath();	// �� ���� �ּҸ� �����ͼ�
				inputtf.setText(in);									// �Է�â�� �־��ش�.
				
			}
		}else if(obj==destbtn){								// ������ ���� Ž���⸦ ���� ��ư�� ������
			JFileChooser jfc = new JFileChooser("c:\\");	// JFileChooser�� �����ϰ�
			int c = jfc.showOpenDialog(this);				// Ž���⸦ �����
			if(c==0){										// ���𰡸� ����
				String out = jfc.getSelectedFile().getAbsolutePath();	// �� �����ּҸ� �����ͼ�
				outputtf.setText(out);									// ������ �� �Է�â�� �־��ش�.
			}
		}
	}
}
