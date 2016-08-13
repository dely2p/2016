package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
// 메아리 서버
public class NetEx3 {
	public static void main(String[] args) {
		try{
			ServerSocket s = new ServerSocket(5000);	// 소켓번호 5000번
			System.out.println("클라이언트 기다리는 중..");
			Socket client = s.accept();	// 접속 기다림
			InetAddress inet = client.getInetAddress();	// 접속한 클라이언트 ip 저장
			System.out.println("ip : "+inet.getHostAddress());
			InputStream is = client.getInputStream();	// inputstream 생성
			OutputStream os = client.getOutputStream(); // outputstream 생성
			
			OutputStreamWriter osw = new OutputStreamWriter(os);	// 한글 전송위해 outputstreamwriter 생성
			BufferedWriter bw = new BufferedWriter(osw);	// buffer생성
			PrintWriter pw = new PrintWriter(bw);	// printwriter 생성
			
			InputStreamReader isr = new InputStreamReader(is);	// 클라이언트로부터 입력받을 inputstreamreader 생성
			BufferedReader br = new BufferedReader(isr);	// buffer생성
			String msg = null;
			while((msg = br.readLine())!=null){
				System.out.println(msg);	// 메시지 출력
				pw.println(msg);
				pw.flush();
			}
			
		}catch(IOException e){
			
			e.printStackTrace();
		}
	}
}
