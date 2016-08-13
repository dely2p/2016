package d20160530;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NewMemoJJang extends JFrame implements ActionListener{
	
	JTextArea jta;
	JScrollPane jsp;
	JMenuBar jmb;
	JMenu jFile, jHelp;
	JMenuItem jmiNew, jmiOpen, jmiSave, jmiExit, jmiHelp;
	public NewMemoJJang() {
		
		super("제목없음 - 메모장");
		setBounds(150, 150, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		// 창종료
		
		jta = new JTextArea();							// textarea 생성
		jsp = new JScrollPane(jta,						// 스크롤 생성(필요할 때)
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jmb = new JMenuBar();							// 메뉴바 생성
		jFile = new JMenu("파일(F)");						// 메뉴 생성	
		jHelp = new JMenu("도움말");						
		jmiNew = new JMenuItem("새로만들기");				// 메뉴 아이템 생성
		jmiOpen = new JMenuItem("열기");
		jmiSave = new JMenuItem("저장");
		jmiExit = new JMenuItem("종료");
		jmiHelp = new JMenuItem("도움말보기");
		
		jFile.add(jmiNew);								// 메뉴에 메뉴아이템 넣기
		jFile.add(jmiOpen);
		jFile.add(jmiSave);
		jFile.addSeparator();							// 구분선
		jFile.add(jmiExit);						
		
		jHelp.add(jmiHelp);
		
		jmb.add(jFile);									// 메뉴바에 메뉴 넣기
		jmb.add(jHelp);
		
		setJMenuBar(jmb);								// 메뉴바에 만든 메뉴바 설정
		
		Font f = new Font("Gothic",Font.BOLD,30);		// 글자체, 크기 변경
		jta.setFont(f);
				
		add(jsp);	
		
		setVisible(true);
		
		jmiNew.addActionListener(this);					// 엑션리스너 설정
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
		if(obj==jmiNew){ // 새로만들기
			String data = jta.getText();
			if(data.length()!=0){
				// 확인창
				int result = JOptionPane.showConfirmDialog(this, "저장하시겠습니까? ","확인",JOptionPane.YES_NO_OPTION); // 여기에/ 내용/ 버튼/ 예,아니요,취소 버튼 종류
				System.out.println("result : "+result);
				if(result==0){ // yes
					System.out.println("저장하기");
				}else{ // no
					jta.setText("");
				}
			}else{
				jta.setText("");
			}
			
		}else if(obj==jmiOpen){ // 열기
			// 열기 메뉴아이템 클릭했을 때
			JFileChooser jfc = new JFileChooser("c:\\"); // c드라이버 열기
			int dig = jfc.showOpenDialog(this);	// 탐색기 열기
			if(dig==0){ // 열기 true
				File f = jfc.getSelectedFile();	// 파일 받아옴
				FileInputStream fis = null;		// fileinputstream 초기화
				BufferedInputStream bis = null;		// bufferinputstream 선언
				StringBuffer sb = new StringBuffer();	// stringbuffer 생성
				int v =0;
				try {
					fis = new FileInputStream(f);	// fileinputstream 생성
					bis = new BufferedInputStream(fis);	// bufferinputstream 생성
					while((v=bis.read())!=-1){		// 파일 내용 끝까지
						sb.append((char)v);			// stringbuffer에 담는다.
					}
				} catch (FileNotFoundException e1) {	// 예외처리
					e1.printStackTrace();
				} catch (IOException ie) {		// 예외처리
					ie.printStackTrace();
				}
				jta.setText(sb.toString());		
				
			}
			System.out.println(dig);
			System.out.println("열기 메뉴아이템 클릭했을 때");
		}else if(obj==jmiSave){ // 저장
			JFileChooser jfc = new JFileChooser("c:\\"); // c드라이버 열기
			int dig = jfc.showSaveDialog(this);		// 저장할 탐색기 열기
			if(dig==0){ // 저장
				File f = jfc.getSelectedFile();		// 해당 uri 가져와서
				FileOutputStream fos = null;
				BufferedOutputStream bos = null;
				byte[] b = jta.getText().getBytes(); // method chain으로 내용 가져옴
		
				try {
					fos = new FileOutputStream(f);	// fileoutputstream 생성
					bos = new BufferedOutputStream(fos); // bufferOutputstream 생성
					bos.write(b);	// 내용 넣기
					bos.flush();	// 버퍼 모두 저장
				
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException ie) {
					ie.printStackTrace();
				}
				// a.txt
				String name = f.getName();
				String n = name.substring(0, name.indexOf("."));
				setTitle(n+" - 메모장");
/*				String[] n2 = new String[name.length()];
				n2 = name.split(".");
				for(int i=0;i<n.length;i++){
					setTitle(n[i]+" - 메모장");
					System.out.println(n[i]);
				}*/
			}
			System.out.println(dig);
			System.out.println("저장 메뉴아이템 클릭했을 때");		
		}else if(obj==jmiHelp){
			JOptionPane.showMessageDialog(this, "이 프로그램은 나만의 저작권이 있으니 무단으로 복제할 시 형사상 전혀 문제가 없고, 단지 나의 저주가 있으리라", "메롱", JOptionPane.OK_OPTION);
		}
		else if(obj==jmiExit){ // 종료하기
			System.exit(0);
		}
		
	}
}
