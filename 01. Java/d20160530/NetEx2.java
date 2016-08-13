package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class NetEx2 {
	public static void main(String[] args) {
	// Socket
	// 클라이언트 소켓 : 소켓
	try {
		Socket s = new Socket("192.168.0.232",5000); // 서버 ip주소, 소켓
		
		InputStream is = s.getInputStream();	// inputstream
		OutputStream os = s.getOutputStream();	// outputstream
		
		InputStreamReader isr2 = new InputStreamReader(is);	// return 되는 메시지를 받기 위해 생성
		BufferedReader br2 = new BufferedReader(isr2);	// buffer 생성
		
		OutputStreamWriter osw = new OutputStreamWriter(os);	// 서버에게 전송할 
		BufferedWriter bw = new BufferedWriter(osw);	// buffer 생성
		PrintWriter pw = new PrintWriter(bw);			// 여러 형으로 출력 가능한 printwriter 생성
		
		InputStreamReader isr = new InputStreamReader(System.in);	// inputstream 생성
		BufferedReader br = new BufferedReader(isr); // buffer 생성
		String data = null;
		while((data=br.readLine())!=null){
			// 출력
			pw.println(data);
			pw.flush();
			String msg = br2.readLine(); // 돌려받은 값을 변수에 넣음
			System.out.println("서버가 전송한 글 : "+msg);	// 보낸 글을 다시 돌려받음
		}
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
