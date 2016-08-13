package d20160530;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOEx2 {
public static void main(String[] args) throws IOException {
	File f = new File("c:\\Hello.java");
	File f2 = new File("c:\\SaveHello.java");
	
	FileInputStream fis = new FileInputStream(f);	// file inputstream 이용과 동시에
	FileOutputStream fos = new FileOutputStream(f2);	// file outputstream 
	
	BufferedInputStream bis = new BufferedInputStream(fis);	// buffer도 사용가능(속도가 빠름)
	BufferedOutputStream bos = new BufferedOutputStream(fos);	// buffer도 사용가능(속도가 빠름)
	
/*	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("c:\\Hello.java")));
	BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("c:\\SaveHello.java")));*/
	
	int v = 0;
	while((v=bis.read())!=-1){	// buffer에 내용이 없을 때까지 while문을 돌리고
		bos.write(v);
		System.out.print((char)v);	// 값을 출력
		
		bos.flush(); // buffer가 다 채워지거나, flush 해야 버퍼에서 빠져나옴
	}
}
}
