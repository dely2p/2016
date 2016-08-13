package d20160527;

import java.io.File;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello3.java"); // \ 1���� ���� \H Ư�����ڷ� �����Ƿ�
		if(f.exists())							// Hello3�� �����ϸ�
			System.out.println("���� ����");
		else									// ������ 
			f.createNewFile();					// ���� ����
		if(f.canRead())							// ���� �� ������
			System.out.println("�б� ����");
		System.out.println(f.getAbsolutePath());// ������ �����ּ� ���
		
		System.out.println("===========================");
		
		File f2 = new File("C:\\Program Files");
		
		if(f2.isDirectory())				// ������ ���丮�̸�
			System.out.println("���丮");
		else								// �ƴϸ�
			System.out.println("����");
		
		String[] fileList = f2.list();		// ���ϸ���Ʈ�� ��Ƽ�
		for(String x : fileList){			// ���
			System.out.println(x);
		}
	}
}
