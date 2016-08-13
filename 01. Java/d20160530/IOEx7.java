package d20160530;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOEx7 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("c:\\member.dat");
		
		// 파일에 접근할 수 있는 능력  : FileInputStream
		FileInputStream fis = new FileInputStream(f);
		
		// 버퍼 사용 가능  : BufferedInputStream
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		// 객체 접근이 가능한 읽기 : ObjectInputStream
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Object obj1 = ois.readObject();
		Object obj2 = ois.readObject();
		
		Member m1 = (Member)obj1;
		System.out.println("이름 : "+m1.getName());
		System.out.println("ID : "+m1.getId());
		System.out.println("PW : "+m1.getPw());
		
		Member m2 = (Member)obj2;
		System.out.println("이름 : "+m2.getName());
		System.out.println("ID : "+m2.getId());
		System.out.println("PW : "+m2.getPw());
	}
}
