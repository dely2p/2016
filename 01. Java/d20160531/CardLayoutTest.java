package d20160531;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutTest extends Frame implements MouseListener{
	CardLayout layout;
	Panel p1,p2;
	public CardLayoutTest() {
		super("카드레이아웃 테스트");
		setBounds(100, 100, 400, 400);
		layout = new CardLayout();
		setLayout(layout);
		// 컴포넌트 초기화
		p1 = new Panel();
		p2 = new Panel();
		
		p1.setBackground(Color.red);
		p2.setBackground(Color.blue);
		
		add("redPanel",p1);	// redPanel 추가
		add("bluePanel",p2); // bluePanel 추가
		
		layout.show(this, "redPanel"); // 레이아웃의 현재창에   redpanel을 보여줌
		p1.addMouseListener(this);
		p2.addMouseListener(this);
		
		setVisible(true);	
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		new CardLayoutTest();
	}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {
		Object obj = e.getSource();		
		if(obj==p1)
			layout.show(this, "bluePanel");
		else
			layout.show(this, "redPanel");
	}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
}
