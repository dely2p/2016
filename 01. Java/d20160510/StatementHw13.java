package d20160510;

import java.util.Scanner;										// �ٸ���Ű���� �ִ� Scanner�� ������

// ��ȯ�ϰ��� �ϴ� �ʸ� �Է� : 54321
// ��� : 15�ð� 5�� 21��
public class StatementHw13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);					// ��ĳ�� ����	
		int time = sc.nextInt();								// �޾ƿ� ���� time�� �ʱ�ȭ						
		
		int hour = time/3600;									// �Է¹��� ��ü �ʿ��� 60��*60�� �� 3600�� ������ �ð��� ���Ѵ�. 
		int min = time%3600/60;									// �Է¹��� ��ü �ʿ��� 3600 ���� �������� ���ϰ� �װ��� �д����� ����� ���� 60���� ������.
		int sec = time%60;										// �Է¹��� ��ü �ʿ��� 60���� ���� �������� ���Ͽ� �ʸ� ���Ѵ�.
		
		System.out.println(hour+"�ð�"+min+"��"+sec+"��");			// �ð�, ��, �ʸ� ������ ����Ѵ�.
	}
}
