package d20160510;

import java.util.Scanner;
public class StatementHw11 {
	public static void main(String[] args){
		
		System.out.println("�� �Է� : ");							// �� �Է� ���ڿ� ���
		Scanner sc = new Scanner(System.in);					// ��ĳ�� ����
		int val = sc.nextInt();									// ����ڷκ��� ���� �Է¹޾Ƽ� val�� �ʱ�ȭ
		
		if(val%3==0){											// val�� 3���� ���� ���� 0�̸�(3�� ����̸�)
			System.out.println(val + "�� 3�� ����Դϴ�.");			// 3�� ������ ���
		}else{													// val�� 3���� ���� ���� 0�� �ƴϸ�(3�� ����� �ƴϸ�)
			System.out.println(val + "�� 3�� ����� �ƴմϴ�.");			// 3�� ����� �ƴ϶�� ���
		}
	}
}
