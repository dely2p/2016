package d20160510;

import java.util.Scanner;

public class StatementEx9 {
	public static void main(String[] args) {
		// �л��� ������ ����� ���
		int kor = 55;													// kor ������ 55�� �ʱ�ȭ
		int eng = 90;													// eng ������ 90���� �ʱ�ȭ
		int mat = 70;													// mat ������ 70���� �ʱ�ȭ
		
		// ������ ����� ���
		int sum = kor + eng + mat;										// kor, eng, mat�� ��� ���ؼ� sum�� �ʱ�ȭ
		float avg = sum / 3;											// �Ҽ����� ����ϱ� ���� sum�� ���� ���� ���� ���� float�� avg�� �ʱ�ȭ 
		System.out.println("���� :" + sum + '\n' + "��� :" + avg);			// ������ ��� ���
		
		// �̶� ����� 60�̻��̸� �հ� �ƴϸ� ���հ� �޼��� ���
		if(avg>=60)														// ����� 60�̻��̸�
			System.out.println("�հ�");									// �հ� ���
		else															// ����� 60�̻��� �ƴϸ�
			System.out.println("���հ�");									// ���հ� ���
	}
}
