package d20160510;

import java.util.Scanner;

public class StatementEx10 {
// ����ڷκ��� ������ �Է¹޾Ƽ� ������ ��
	public static void main(String[] args) {
		System.out.println("�����Է� : ");					// �����Է� ���ڿ� ���
		Scanner sc  = new Scanner(System.in);			// ��ĳ�� ���
		// ���ڿ� String str = sc.nextLine();
		// System.out.println(str);
		
		int score = sc.nextInt();						// �Է¹��� ���� score�� �ʱ�ȭ
		if(score>=90){									// socre�� 90���� ũ��
			System.out.println("A����");					// A���� ���
		}else if(score>=80){							// �ƴϸ� socre�� 80���� ũ��
			System.out.println("B����");					// B���� ���
		}else if(score>=70){							// �ƴϸ� socre�� 70���� ũ��
			System.out.println("C����");					// C���� ���
		}else if(score>=60){							// �ƴϸ� socre�� 60���� ũ��
			System.out.println("D����");					// D���� ���
		}else{											// �ƴϸ� socre�� 60���� ������
			System.out.println("F����");					// F���� ���
		}
	}
}
