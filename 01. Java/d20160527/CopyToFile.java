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
		super("파일복사기");
		setBounds(100, 100, 600, 400);
		setLayout(null);
		
		inputtf = new JTextField();
		outputtf = new JTextField();			// jtextfield생성

		sourcebtn = new JButton("Source");
		destbtn = new JButton("Dest");
		copy = new JButton("복사");
		close = new JButton("종료");				// jbutton 생성
		
		inputtf.setBounds(200, 100, 300, 30);
		outputtf.setBounds(200, 200, 300, 30);
		sourcebtn.setBounds(50, 100, 100, 30);
		destbtn.setBounds(50, 200, 100, 30);
		copy.setBounds(150, 300, 100, 50);
		close.setBounds(300, 300, 100, 50);		// UI배치
		add(inputtf);
		add(outputtf);
		add(sourcebtn);
		add(destbtn);
		add(copy);
		add(close);								// UI에 추가
		
		inputtf.addActionListener(this);
		outputtf.addActionListener(this);
		sourcebtn.addActionListener(this);
		destbtn.addActionListener(this);
		copy.addActionListener(this);
		close.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		// 창종료
		
	}
	public static void main(String[] args){
		new CopyToFile();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==copy){
			String srcuri =	inputtf.getText();			// 가져올 파일 uri 저장
			String desturi = outputtf.getText();		// 복사할 파일 uri 저장
			
			File f1 = new File(srcuri);					// 파일 생성
			File f2 = new File(desturi);
			try{										// 예외처리
				FileInputStream fi = new FileInputStream(f1);	// 파일 스트림 생성
				FileOutputStream fo = new FileOutputStream(f2);
				int val = 0;
				while((val=fi.read())!=-1){						// 파일을 1byte씩 읽어와서 끝이 될 때까지
					fo.write(val);								// 복사할 파일에 입력한다.
				}
			}catch(IOException e1){
				System.out.println("에러");
			}
			
		}else if(obj==close){								// 종료버튼을 누르면 종료
			System.exit(0);
		}else if(obj==sourcebtn){							// 가져올 파일 탐색기를 띄우는 버튼을 누르면
			JFileChooser jfc = new JFileChooser("c:\\");	// JFileChooser를 생성하고
			int c = jfc.showOpenDialog(this);				// 탐색기를 띄워서 
			if(c==0){										// 무언가를 열면
				String in = jfc.getSelectedFile().getAbsolutePath();	// 그 절대 주소를 가져와서
				inputtf.setText(in);									// 입력창에 넣어준다.
				
			}
		}else if(obj==destbtn){								// 저장할 파일 탐색기를 띄우는 버튼을 누르면
			JFileChooser jfc = new JFileChooser("c:\\");	// JFileChooser를 생성하고
			int c = jfc.showOpenDialog(this);				// 탐색기를 띄워서
			if(c==0){										// 무언가를 열면
				String out = jfc.getSelectedFile().getAbsolutePath();	// 그 절대주소를 가져와서
				outputtf.setText(out);									// 저장할 값 입력창에 넣어준다.
			}
		}
	}
}
