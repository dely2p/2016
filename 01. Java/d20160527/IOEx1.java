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
		
		// byte Stream �迭�� ���Ͽ� �д� �ɷ��� �ִ� Ŭ����(byte������ �б⶧���� �ѱ��� ���� �� ����)
		FileInputStream fis = new FileInputStream(f); 
		FileOutputStream fos = new FileOutputStream(f2);
		int value =0;
		while((value=fis.read())!=-1){
			//fis.read(); // ������ ù��° ���ڸ� �ƽ�Ű�ڵ�� ������
			System.out.print((char)value); // char�� ����ȯ
			fos.write(value);
		}
		System.out.println("-----------------------------------------");
		

		// OutputStream <== �ֻ��� Ŭ����
		// FileOutputStream
	/*	FileOutputStream fos = new FileOutputStream(f2);
		
		int value =0;
		while((value=fis.read())!=-1){
			//fis.read(); // ������ ù��° ���ڸ� �ƽ�Ű�ڵ�� ������
			System.out.print((char)value); // char�� ����ȯ
			fos.write(value);
		}		*/
	}
}
