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
	
	FileInputStream fis = new FileInputStream(f);	// file inputstream �̿�� ���ÿ�
	FileOutputStream fos = new FileOutputStream(f2);	// file outputstream 
	
	BufferedInputStream bis = new BufferedInputStream(fis);	// buffer�� ��밡��(�ӵ��� ����)
	BufferedOutputStream bos = new BufferedOutputStream(fos);	// buffer�� ��밡��(�ӵ��� ����)
	
/*	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("c:\\Hello.java")));
	BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("c:\\SaveHello.java")));*/
	
	int v = 0;
	while((v=bis.read())!=-1){	// buffer�� ������ ���� ������ while���� ������
		bos.write(v);
		System.out.print((char)v);	// ���� ���
		
		bos.flush(); // buffer�� �� ä�����ų�, flush �ؾ� ���ۿ��� ��������
	}
}
}
