package d20160510;

import java.util.Scanner;
//����, ���� , ���� ������ �Է� �޾� ������ ����� ����ϼ���
public class Day20150510hw2 {
	public static void main(String[] args) {
		
		System.out.println("����, ����, ���� ������ ���� �Է� : ");			// ����, ����, ���� ������ ���� �Է� ���ڿ� ���
		Scanner sc = new Scanner(System.in);					// ��ĳ�� ����
		int kor = sc.nextInt();									// ���� ���� �Է¹���
		int eng = sc.nextInt();									// ���� ���� �Է¹���
		int mat = sc.nextInt();									// ���� ���� �Է¹���
		
		int sum = kor + eng + mat;								// ����, ����, ���� �հ踦 sum�� ����
		int avg = sum / 3;										// ������ ���� ���� ������ ��հ��� avg�� ����
		
		System.out.println("���� : "+sum+" , "+"��� : "+avg);		// ������ ����� ���
	}
}
