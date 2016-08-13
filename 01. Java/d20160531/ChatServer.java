package d20160531;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import d20160530.MultiServer;

public class ChatServer extends JFrame implements ActionListener{
	ArrayList<MServer> list = new ArrayList<MServer>(); // �����ϴ� Ŭ���̾�Ʈ�� �����ص� arraylist
	JTextArea jta;
	JButton jbtn;
	JScrollPane jsp;
	ServerSocket ss;
	PrintWriter pw;
	BufferedReader br;

		
	public ChatServer(){
		super("ä�ü��� ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// ����
		
		jta = new JTextArea();
		Font f = new Font("Gothic",Font.BOLD,30);
		jta.setFont(f);
		//jta.setFont(new Font("Gothic",Font.BOLD,30));
		
		jsp = new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		jbtn = new JButton("����");
		
		add(jsp,"Center");	// ���̾ƿ� ����� textarea ����
		add(jbtn,"South");	// ���̾ƿ� ���ʿ� ��ư ����
		jbtn.addActionListener(this);
		
		setBounds(100, 100, 800, 600);
		setVisible(true);
		
		vchat();
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}
	
	private void vchat(){
		// ����� ���� ���� ����
		try {
			ss = new ServerSocket(5000);
			while(true){
				// ����� ���� ���
				Socket client = ss.accept(); 
				MServer ms = new MServer(client);
				list.add(ms);
				ms.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�����մϴ�");
		System.exit(0);
		
	}
	class MServer extends Thread{ // ���inner Ŭ����
		
		Socket client;
		String ip;
		PrintWriter pw;
		BufferedReader br;
		public MServer(Socket client) {
			this.client = client;
			InetAddress inet = client.getInetAddress();
			ip = inet.getHostAddress();
			
			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			// �а� ���� ���
			String msg = null;
			try {
				msg = br.readLine();
				jta.append("[ + "+ip+" ] : "+msg+"\n");
				broadcast("[ + "+ip+" ] : "+msg);
				// ���� ��ũ�� ���� �Ʒ��� �̵�
				JScrollBar sb = jsp.getVerticalScrollBar();
				int v = sb.getMaximum();
				sb.setValue(v);
			} catch (IOException e) {
				list.remove(this);
			}
			
			
		}// run() end	
		
		
		public void broadcast(String data){
			// ArrayList �ȿ� �ִ� ��� ����ڿ��� �� ������ ����
			for(MServer x : list){
				x.pw.println(data);
				x.pw.flush();
			}
		}
	}// MServer class end
	
	
	
}// ChatServer class end;


