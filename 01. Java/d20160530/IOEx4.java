package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class IOEx4 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("c:\\test.txt");			// file ����
		FileWriter fw = new FileWriter(f);			// ���� �����ϴ� filewriter ����
		BufferedWriter bw = new BufferedWriter(fw);	// bufferedwriter����
		// Ű����κ��� �Է¹ޱ�
		// ctrl+z ���� ������ �ݺ�
		int value = 0;
		// InputStream <==> Reader
		// InputStreamReader
		InputStreamReader isr = new InputStreamReader(System.in); // char stream
		BufferedReader br = new BufferedReader(isr);
		
		String data = null;
		
		while((data = br.readLine())!=null){	// �ٸ��� ������ �����͸� �޾ƿ�
			bw.write(data+"\n");		// ����
			System.out.println(data);
		}
		bw.flush();
	}
	
}
