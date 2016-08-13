package d20160527;

import java.io.File;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello3.java"); // \ 1개면 오류 \H 특수문자로 없으므로
		if(f.exists())							// Hello3이 존재하면
			System.out.println("파일 있음");
		else									// 없으면 
			f.createNewFile();					// 새로 생성
		if(f.canRead())							// 읽을 수 있으면
			System.out.println("읽기 가능");
		System.out.println(f.getAbsolutePath());// 파일의 절대주소 출력
		
		System.out.println("===========================");
		
		File f2 = new File("C:\\Program Files");
		
		if(f2.isDirectory())				// 파일이 디렉토리이면
			System.out.println("디렉토리");
		else								// 아니면
			System.out.println("파일");
		
		String[] fileList = f2.list();		// 파일리스트를 담아서
		for(String x : fileList){			// 출력
			System.out.println(x);
		}
	}
}
