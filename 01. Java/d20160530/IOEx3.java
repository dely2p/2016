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
		
		FileReader fr = new FileReader(f);		// filreader 생성
		BufferedReader br = new BufferedReader(fr);		// bufferedreader 생성
		FileWriter fw = new FileWriter(f2);		// filewriter 생성
		BufferedWriter bw = new BufferedWriter(fw);	// bufferedwriter생성
		String data = null;		
		while((data = br.readLine())!=null){ // 한줄씩 읽어올 수 있음
			bw.write(data+"\n");			// data값+줄마다 엔터 해줌
			System.out.println(data);
		}
		bw.flush();
	}
}
