package d20160509;
// 4���� ������ : �� ������
// >, <, >=, <=, ==, !=(= ><) 

public class VarEx4 {
	public static void main(String [] args){
		int a = 100;									// a�� 100���� �ʱ�ȭ
		int b = 20;										// b�� 20�� �ʱ�ȭ
		System.out.println("a > b : " + a + b);			// ���ڿ� ���Ῥ���ڷ� 10020 ���
		System.out.println("a > b : " + (a>b));			// a�� �� ũ�Ƿ� ture
		System.out.println("a < b : " + (a<b));			// b�� �� �����Ƿ� false
		System.out.println("a <= b : " + (a<=b));		// b�� �� �����Ƿ� false
		System.out.println("a >= b : " + (a>=b));		// a�� �� ũ�Ƿ� ture
		System.out.println("a == b : " + (a==b));		// a�� b�� ���� �����Ƿ� false
		System.out.println("a != b : " + (a!=b));		// a�� b�� ���� �����Ƿ� true
	}
}
