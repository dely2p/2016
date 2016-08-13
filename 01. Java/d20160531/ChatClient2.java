package d20160531;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ChatClient2 extends Frame implements ActionListener {
	CardLayout layout1;
	TextField ip,name;
	Button conn, reset;
	Panel login,chat;
	TextArea jta;
	TextField jtf;
	Button send;
	
	public ChatClient2() {
		super();
		layout1 = new CardLayout();
		setLayout(layout1);
		ip = new TextField();
		name = new TextField();
		conn = new Button("접속");
		reset = new Button("reset");
		login = new Panel();
		chat = new Panel();
		
		login.setBounds(100, 100, 600, 400);
		ip.setBounds(250, 100, 150, 30);
		name.setBounds(250, 200, 150, 30);
		conn.setBounds(150, 300, 100, 50);
		reset.setBounds(300, 300, 100, 50);		
		
		conn.addActionListener(this);
		reset.addActionListener(this);
		layout1.show(this, "login"); // 레이아웃의 현재창에   redpanel을 보여줌
		//layout2.show(this, "connect"); // 레이아웃의 현재창에   redpanel을 보여줌
		
		login.add(ip);
		login.add(name);
		login.add(conn);
		login.add(reset);
		add("login",login);
		add("chat",chat);
		
		//////////////////////////////////////
		
		chat.setBounds(100, 100, 600, 600);
		//jta.setBounds(100, 100, 400, 400);
		jtf.setBounds(50, 500, 300, 30);
		send.setBounds(300, 300, 50, 50);
		
		send.addActionListener(this);
		layout1.show(this, "chat");		
		chat.add(jta);
		chat.add(jtf);
		chat.add(send);
		setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		System.out.println(obj);
		if(obj==conn){
			layout1.show(this, "chat");
		}
		
	}
	public static void main(String[] args) {
		new ChatClient2();
	}
}
