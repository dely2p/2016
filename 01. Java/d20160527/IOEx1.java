package d20160527;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx1 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello.java");
		File f2 = new File("C:\\CopyHello.java");
		
		// byte Stream 계열에 파일에 읽는 능력이 있는 클래스(byte단위로 읽기때문에 한글은 읽을 수 없음)
		FileInputStream fis = new FileInputStream(f); 
		FileOutputStream fos = new FileOutputStream(f2);
		int value =0;
		while((value=fis.read())!=-1){
			//fis.read(); // 파일의 첫번째 글자를 아스키코드로 가져옴
			System.out.print((char)value); // char로 형변환
			fos.write(value);
		}
		System.out.println("-----------------------------------------");
		

		// OutputStream <== 최상위 클래스
		// FileOutputStream
	/*	FileOutputStream fos = new FileOutputStream(f2);
		
		int value =0;
		while((value=fis.read())!=-1){
			//fis.read(); // 파일의 첫번째 글자를 아스키코드로 가져옴
			System.out.print((char)value); // char로 형변환
			fos.write(value);
		}		*/
	}
}
