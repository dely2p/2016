package d20160530;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOEx6 {
	public static void main(String[] args) throws IOException {
		Member m1 = new Member(1, "홍길동", "hong", "gildong", "010-1234-5678");
		Member m2 = new Member(2, "홍판서", "hong", "daddy", "010-2345-6789");
		
		// 파일 : File
		File f= new File("c:\\member.dat");
		
		// 파일에 접근할 수 있는 능력 클래스 : FileOutputStream
		FileOutputStream fos = new FileOutputStream(f);
		
		// 버퍼? : BufferedOutputStream
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// 객체 저장 : ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(m1);	// 멤버객체를 저장시킴
		oos.writeObject(m2);	// 멤버객체를 저장시킴
		oos.flush();	// flush
		
	}
}
