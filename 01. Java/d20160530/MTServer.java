package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
// 여러 클라이언트 동시 접속
public class MTServer extends Thread{
	Socket client;
	BufferedReader br;
	PrintWriter pw;
	
	public MTServer(Socket client) {
		this.client = client;
	}
	@Override
	public void run() {
		// 모든 클라이언트와 통신을 담당하는 코드
		InetAddress inet = client.getInetAddress();	// 클라이언트 주소 받기
		String ip = inet.getHostAddress();		
		System.out.println("접속자 IP : "+ ip); // ip주소
		
		
	
		// 서버의 수신 객체
		try {
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));	 // client inputstreamreader
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 발신 객체
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
