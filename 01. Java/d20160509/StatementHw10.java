package d20160509;
// �����Է¹޾� ��������ϴ� �ڵ� �ϼ��ؿ��� 
import java.util.Scanner;
public class StatementHw10 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		// Scanner���
		System.out.print("�����Է� : ");				// �����Է� ���ڿ� ���
		int score = sc.nextInt();					// Ű���� �Է°��� �޾ƿͼ� score �ʱ�ȭ
		
		if(score>=90)								// score�� 90�� �̻��̸�
			System.out.println("A����");				// A���� ���
		else if(score>=80 && score<90)				// score�� 80�� �̻� 90�� �̸��̸�
			System.out.println("B����");				// B���� ���
		else if(score>=70 && score<80)				// score�� 70�� �̻� 80�� �̸��̸�
			System.out.println("c����");				// C���� ���
		else if(score>=60 && score<70)				// score�� 60�� �̻� 70�� �̸��̸�
			System.out.println("D����");				// D���� ���
		else if(score<60)							// score�� 60�� �̸��̸�
			System.out.println("F����");				// F���� ���
	}
}
