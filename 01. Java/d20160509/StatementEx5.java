package d20160509;

import java.util.Scanner;

public class StatementEx5 {
	public static void main(String[] args) {
		System.out.println("�� �Է� : ");				// ���Է� ���
		// ���� �Է� �޴� ��ĳ�� �����
		Scanner sc = new Scanner(System.in);		// Scanner ���
		// ��ĳ�ʷκ��� ���� �Է¹ޱ�
		int value = sc.nextInt();					// Ű���忡�� �޾ƿ� ���� value�� �ʱ�ȭ
		// �Է� ���� �� ���
		System.out.println(value);					// value���� ���
		
		if(value>100){								// ���� �б⹮
			System.out.println("�Է°��� 100���� ũ��");	// �Է°��� 100���� Ŭ �� ���
		}else{
			System.out.println("�Է°��� 100���� �۴�");	// �Է°��� 100���� ���� �� ����
		
		}
	}
}
