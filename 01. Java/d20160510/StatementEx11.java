package d20160510;

import java.util.Scanner;

public class StatementEx11 {
	public static void main(String[] args) {
		System.out.println("����� ������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);			// ��ĳ�� ����
		int score = sc.nextInt();						// �Է¹��� �� score�� �ʱ�ȭ
		
		System.out.println("score : "+ score);			// �Է¹��� �� score ���
		switch(score/10){								// �Է¹��� ���� switch�� ���� -> score/10�� ������ case �Ǻ�
			case 10:									// score�� 10�̸�
				System.out.println("A����");				// A���� ���
				break;									// ��� �� case�� ��������
			case 9:										// score�� 9�̸�
				System.out.println("B����");				// B���� ���
				break;									// ��� �� case�� ��������
			case 8:										// score�� 8�̸�
				System.out.println("C����");				// C���� ���
				break;									// ��� �� case�� ��������
			case 7:										// score�� 7�̸�
				System.out.println("D����");				// D���� ���
				break;									// ��� �� case�� ��������
			default:									// �� �ܶ��
				System.out.println("F����");				// F���� ���									
				
		}
	}
}
