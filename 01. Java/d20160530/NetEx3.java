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
// �޾Ƹ� ����
public class NetEx3 {
	public static void main(String[] args) {
		try{
			ServerSocket s = new ServerSocket(5000);	// ���Ϲ�ȣ 5000��
			System.out.println("Ŭ���̾�Ʈ ��ٸ��� ��..");
			Socket client = s.accept();	// ���� ��ٸ�
			InetAddress inet = client.getInetAddress();	// ������ Ŭ���̾�Ʈ ip ����
			System.out.println("ip : "+inet.getHostAddress());
			InputStream is = client.getInputStream();	// inputstream ����
			OutputStream os = client.getOutputStream(); // outputstream ����
			
			OutputStreamWriter osw = new OutputStreamWriter(os);	// �ѱ� �������� outputstreamwriter ����
			BufferedWriter bw = new BufferedWriter(osw);	// buffer����
			PrintWriter pw = new PrintWriter(bw);	// printwriter ����
			
			InputStreamReader isr = new InputStreamReader(is);	// Ŭ���̾�Ʈ�κ��� �Է¹��� inputstreamreader ����
			BufferedReader br = new BufferedReader(isr);	// buffer����
			String msg = null;
			while((msg = br.readLine())!=null){
				System.out.println(msg);	// �޽��� ���
				pw.println(msg);
				pw.flush();
			}
			
		}catch(IOException e){
			
			e.printStackTrace();
		}
	}
}
