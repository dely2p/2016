package d20160517;

public class StatementHw9 {
	public static void main(String[] args){
		int a = 20;							// int�� a�� 20 ����
		int[] b = {10,20,50,30};			// int�� �迭 b�� �� ����
		float f = 240.3f;					// float�� f�� �� ����
		
		FormatData fd = new FormatData();	// FormatData Ŭ���� ����

		fd.print(a);						// overloading method�� print�� int�� ���
		fd.print(b);						// overloading method�� print�� int�� �迭 ���
		fd.print(f);						// overloading method�� print�� float�� ���
	}
}
