package d20160513;

public class MethodEx4 {
	
	static int mul(int a, int b){				// mul method
		return a*b;								// a*b���� return 
	}
	public static void main(String[] args) {
		int a = 100;							// a�� 100�� �ʱ�ȭ
		int b = 200;							// b�� 200�� �ʱ�ȭ
		int c = mul(a,b);						// c�� mul method ������ �ʱ�ȭ
		System.out.println(" c : "+c);			// c�� ���
	}
}
