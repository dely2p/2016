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
		super("메모장");
		
		area = new TextArea();
		
		miNew = new MenuItem("새로만들기");			// 메뉴아이템 생성
		miOpen = new MenuItem("열기");
		miSave = new MenuItem("저장");
		miExit = new MenuItem("종료");
		miHelp = new MenuItem("도움말보기");
		
		muFile = new Menu("파일(F)");				// 메뉴 생성
		muHelp = new Menu("도움말");
		
		mb = new MenuBar();						// 메뉴 바 생성
		
		muFile.add(miNew);						// 메뉴에 메뉴아이템 추가함
		muFile.add(miOpen);
		muFile.add(miSave);
		muFile.addSeparator();
		muFile.add(miExit);
		
		muHelp.add(miHelp);						// 메뉴에 메뉴아이템 추가
		
		mb.add(muFile);							// 메뉴바에 메뉴 추가
		mb.add(muHelp);
		
		setMenuBar(mb);							// 메뉴바 생성
		
		miNew.addActionListener(this);			// 엑션리스너 생성
		miOpen.addActionListener(this);
		miSave.addActionListener(this);
		miExit.addActionListener(this);
		miHelp.addActionListener(this);
		
		setBounds(100, 100, 600, 400);

		add(area);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){			// 추상메서드 부모를 익명inner클래스로 바로 씀
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
		if(obj==miNew){						// 새로만들기 메뉴아이템
			System.out.println("새로만들기");
			area.getText();
			area.setText("");
		}
		else if(obj==miExit){				// 종료 메뉴아이템
			System.out.println("종료합니다.");
			System.exit(0);
		}
		
	}
}
