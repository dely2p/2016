package d20160510;

import java.io.IOException;
public class StatementEx8 {
	public static void main(String[] args) throws IOException{
		// �Էµ� ���� �빮�� �ҹ��� �������� �Ǻ�
		
		// 1. ����ڷκ��� ���� �Է�
		System.out.print("�� �Է� : ");						// �� �Է� ���ڿ� ���
		int data = System.in.read();						// �Է°� �ѱ��� �Է¹���
		
		// 2. �� ������ ASCII�ڵ尪�� �˾Ƴ���.
		System.out.println("ASCII�ڵ尪 : "+ data);			// �Է¹��� ���� �ƽ�Ű�ڵ� ���
		
		// 3. �빮�� A �ڵ� : 65, �ҹ��� : 97, ���� 0 : 48
		//	�� ���� ������ ��ҹ��� ���� �Ǻ�����
		if(data>=48 && data<=57){							// �Է¹��� ���� 48~57 ���� ���̸�
			// 4. �޼��� ���
			System.out.println("�����Դϴ�.");					// ���ڶ�� ���
		}else if(data>=65 && data<=90)						// �Է¹��� ���� 65~90 ���� ���̸�
			System.out.println("�빮���Դϴ�.");					// �빮�ڶ�� ���
		else if(data>=97 && data<=122)						// �Է¹��� ���� 97~122 ���� ���̸�
			System.out.println("�ҹ����Դϴ�.");					// �ҹ��ڶ�� ���
	}
}
