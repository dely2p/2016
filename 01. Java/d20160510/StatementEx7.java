package d20160510;

import java.util.Scanner;

public class StatementEx7 {
	// ������� �Է°��� �޾Ƽ� �� ���� Ȧ������ ¦������ �Ǻ�
	public static void main(String[] args) {
		System.out.println("�Է�: ");						// �Է� ���ڿ� ���
		
		// 1. ����ڷκ��� ���� �Է� �޴´�.
		Scanner sc = new Scanner(System.in); 			// ��ĳ�� ����
		// System.in ==> Ű���� 
		// System.out ==> �����
		int value = sc.nextInt(); 						// ����ڷκ��� Ű���� ���� �޾ƿ�
		System.out.println("�ԷµȰ�: " + value);			// �Է¹��� �� ���
		
		// 2. �� ���� �Ǻ�
		if(value%2 == 0){								// �Է¹��� ���� 2�� ������ �������� ¦���̹Ƿ�
			// 3. �޽��� ���
			System.out.println(value + "�� ¦���Դϴ�");		// ¦����� ���
		}else{											// �Է¹��� ���� 2�� ������ �������� ������
			System.out.println(value + "�� Ȧ���Դϴ�");		// Ȧ����� ���
		}
		/*if(value%2 == 0){								// if���� �� �� ���� ������ 
			System.out.println(value + "�� ¦���Դϴ�");		// if~else������ ���� ���� �� ȿ����
		}*/
		
		
	}
}
