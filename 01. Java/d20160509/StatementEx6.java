package d20160509;

import java.util.Scanner;

public class StatementEx6 {
	public static void main(String[] args) {
		// 1. ����ڷκ��� ������ �Է¹޴´�.
		Scanner sc = new Scanner(System.in);		// Scanner ���
		System.out.print("�����Է� : ");				// �����Է� ���ڿ� ���
		int val = sc.nextInt();						// Ű���� �Է¹ޱ�
		// 2. �Էµ� �� ���
		System.out.println(" �Է°� : "+val);			// �Է¹��� �� ���
		// 3. �Էµ� ������ 90�� �̻��̸� A���� ���ڸ� ����Ѵ�.
		if(val>=90)									// ���Ǻб⹮-�Է¹��� ���� 90�� �̻��̸�
			System.out.println("A����");				// A���� ���ڿ� ���
	}
}
