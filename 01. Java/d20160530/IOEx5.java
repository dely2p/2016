package d20160530;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx5 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\saveData.sav");
		// 파일 접근 : FileOutputStream
		// 빠르게 : BufferedOutputStream
		// 기본 자료형 데이터를 저장 : DataOutputStream
		FileOutputStream fos = new FileOutputStream(f);
		FileInputStream fis = new FileInputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataOutputStream dos = new DataOutputStream(bos);
		DataInputStream dis = new DataInputStream(bis);
		
		dos.writeUTF("홍길동");	// 캐릭터명
		dos.writeInt(10);	// 레벨
		dos.writeLong(32124322);	// 경험치
		dos.writeBoolean(true);		// 성별 : 남 : true, 여 : false
		dos.writeByte(21); 	// 주 무기 번호
		
		dos.flush();
		System.out.println("------------------------------");
		
		System.out.println("캐릭터명 : "+dis.readUTF());	// 쓴 순서와 동일한 순서로 읽어와야함
		System.out.println("레벨 : "+dis.readInt());
		System.out.println("경험치 : "+dis.readLong());
		System.out.println("성별 : "+((dis.readBoolean()==true)? "남":"여"));	// 3항 연산자
		System.out.println("주 무기 번호 : "+dis.readByte());
			
	}
}
