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
		// ���� ���� : FileOutputStream
		// ������ : BufferedOutputStream
		// �⺻ �ڷ��� �����͸� ���� : DataOutputStream
		FileOutputStream fos = new FileOutputStream(f);
		FileInputStream fis = new FileInputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataOutputStream dos = new DataOutputStream(bos);
		DataInputStream dis = new DataInputStream(bis);
		
		dos.writeUTF("ȫ�浿");	// ĳ���͸�
		dos.writeInt(10);	// ����
		dos.writeLong(32124322);	// ����ġ
		dos.writeBoolean(true);		// ���� : �� : true, �� : false
		dos.writeByte(21); 	// �� ���� ��ȣ
		
		dos.flush();
		System.out.println("------------------------------");
		
		System.out.println("ĳ���͸� : "+dis.readUTF());	// �� ������ ������ ������ �о�;���
		System.out.println("���� : "+dis.readInt());
		System.out.println("����ġ : "+dis.readLong());
		System.out.println("���� : "+((dis.readBoolean()==true)? "��":"��"));	// 3�� ������
		System.out.println("�� ���� ��ȣ : "+dis.readByte());
			
	}
}
