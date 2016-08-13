package d20160531;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ChatServer2 extends JFrame implements ActionListener{
	
	JButton jbn;
	JTextArea jta;
	JScrollPane jsp;
	public ChatServer2() {
		super("ChatServer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		jta = new JTextArea();				// 咆胶飘area 积己		
		Font f = new Font("Gothic", Font.BOLD, 20);
		jta.setFont(f);
		jsp = new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	// 胶农费 积己		
		jbn = new JButton("exit");		// 滚瓢 积己
			
		add(jsp,"Center");
		add(jbn,"South");
		
		jbn.addActionListener(this);
		
		setVisible(true);		
	}
	public static void main(String[] args) {
		new ChatServer2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
			System.exit(0);

	}
}
