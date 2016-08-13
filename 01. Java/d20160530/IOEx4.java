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
		
		File f = new File("c:\\test.txt");			// file 생성
		FileWriter fw = new FileWriter(f);			// 파일 연결하는 filewriter 생성
		BufferedWriter bw = new BufferedWriter(fw);	// bufferedwriter생성
		// 키보드로부터 입력받기
		// ctrl+z 누를 때까지 반복
		int value = 0;
		// InputStream <==> Reader
		// InputStreamReader
		InputStreamReader isr = new InputStreamReader(System.in); // char stream
		BufferedReader br = new BufferedReader(isr);
		
		String data = null;
		
		while((data = br.readLine())!=null){	// 줄마다 끝까지 데이터를 받아옴
			bw.write(data+"\n");		// 저장
			System.out.println(data);
		}
		bw.flush();
	}
	
}
