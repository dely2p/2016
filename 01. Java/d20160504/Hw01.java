package d20160504;

public class Hw01 {
	public static void main(String[] args) {
		int m1 = 100;
		byte b1 = 20;
		short sh1 = 200;
		int	k = m1 + b1; 						// k�� �ڷ����� �ۼ����� -> m1+b1���� m1�� int�̹Ƿ� int�� ���߾� �ڷ����� ����
		System.out.println("k : "+ (m1+b1));
		
		byte b2 = (byte)k;						// k�� int�� �ڷ����� �ξ��µ�, byte�� b2�� �������� ������ -> k���� 127���� �����Ƿ� byte�����ϴ� byte�� ����ȯ ��
		
		int b3 = 300; 							// ����� 300�� b3�� �ڷ����� byte �ִ밪�� 127���� ũ�Ƿ�  -> b3�� �ڷ����� int�� �ٲ�
		k = k + 1; 								// k�� �տ��� �̹� �ʱ�ȭ �����Ƿ� -> �ڷ��� int�� ����ų� �������� �ٸ� ������ �ٲ�
		System.out.println("k : "+ k);
	}
}
