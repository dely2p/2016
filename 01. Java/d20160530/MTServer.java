package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
// ���� Ŭ���̾�Ʈ ���� ����
public class MTServer extends Thread{
	Socket client;
	BufferedReader br;
	PrintWriter pw;
	
	public MTServer(Socket client) {
		this.client = client;
	}
	@Override
	public void run() {
		// ��� Ŭ���̾�Ʈ�� ����� ����ϴ� �ڵ�
		InetAddress inet = client.getInetAddress();	// Ŭ���̾�Ʈ �ּ� �ޱ�
		String ip = inet.getHostAddress();		
		System.out.println("������ IP : "+ ip); // ip�ּ�
		
		
	
		// ������ ���� ��ü
		try {
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));	 // client inputstreamreader
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// �߽� ��ü
		try {
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))); // client outputstreamreader
			String msg = null;
			while((msg=br.readLine())!=null){
				System.out.println("["+ip+"] : "+msg);
				pw.println("["+ip+"] : "+msg);
				pw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
}
