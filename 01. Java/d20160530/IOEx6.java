package d20160530;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOEx6 {
	public static void main(String[] args) throws IOException {
		Member m1 = new Member(1, "ȫ�浿", "hong", "gildong", "010-1234-5678");
		Member m2 = new Member(2, "ȫ�Ǽ�", "hong", "daddy", "010-2345-6789");
		
		// ���� : File
		File f= new File("c:\\member.dat");
		
		// ���Ͽ� ������ �� �ִ� �ɷ� Ŭ���� : FileOutputStream
		FileOutputStream fos = new FileOutputStream(f);
		
		// ����? : BufferedOutputStream
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// ��ü ���� : ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(m1);	// �����ü�� �����Ŵ
		oos.writeObject(m2);	// �����ü�� �����Ŵ
		oos.flush();	// flush
		
	}
}
