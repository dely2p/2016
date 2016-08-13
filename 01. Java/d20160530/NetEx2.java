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
	// Ŭ���̾�Ʈ ���� : ����
	try {
		Socket s = new Socket("192.168.0.232",5000); // ���� ip�ּ�, ����
		
		InputStream is = s.getInputStream();	// inputstream
		OutputStream os = s.getOutputStream();	// outputstream
		
		InputStreamReader isr2 = new InputStreamReader(is);	// return �Ǵ� �޽����� �ޱ� ���� ����
		BufferedReader br2 = new BufferedReader(isr2);	// buffer ����
		
		OutputStreamWriter osw = new OutputStreamWriter(os);	// �������� ������ 
		BufferedWriter bw = new BufferedWriter(osw);	// buffer ����
		PrintWriter pw = new PrintWriter(bw);			// ���� ������ ��� ������ printwriter ����
		
		InputStreamReader isr = new InputStreamReader(System.in);	// inputstream ����
		BufferedReader br = new BufferedReader(isr); // buffer ����
		String data = null;
		while((data=br.readLine())!=null){
			// ���
			pw.println(data);
			pw.flush();
			String msg = br2.readLine(); // �������� ���� ������ ����
			System.out.println("������ ������ �� : "+msg);	// ���� ���� �ٽ� ��������
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
