package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx3 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello.java");
		File f2 = new File("c:\\HelloTest.java");
		
		FileReader fr = new FileReader(f);		// filreader ����
		BufferedReader br = new BufferedReader(fr);		// bufferedreader ����
		FileWriter fw = new FileWriter(f2);		// filewriter ����
		BufferedWriter bw = new BufferedWriter(fw);	// bufferedwriter����
		String data = null;		
		while((data = br.readLine())!=null){ // ���پ� �о�� �� ����
			bw.write(data+"\n");			// data��+�ٸ��� ���� ����
			System.out.println(data);
		}
		bw.flush();
	}
}
