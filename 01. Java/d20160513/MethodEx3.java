package d20160513;

public class MethodEx3 {
	// static void �ż����(�Ű�����, �Ű�����, ...){
	// void : ���ϰ� ����
	//}
	
	static int add(int a, int b){								// add method
		System.out.println("===add �ż��� ���� ������===");			// ���ڿ� ���
		System.out.println(" a : " + a);						// a�� ���
		System.out.println(" b : " + b);						// b�� ���
		int c = a+b;											// a+b���� int�� ���� c�� �ʱ�ȭ
		// ���� ó���ϰ� ���� ���θ޼���� ������ �� �ִ�.
		return c;												// ��� �� c�� main���� �ٽ� return 
	}
	// method ���� ����
	// static ���ϰ��� �ڷ��� method��(�ڷ��� ������, �ڷ��� ������...){
	//}
	
	static int minus(int a, int b){								// minus method
		//int c = a-b;											// a-b���� int�� ���� c�� �ʱ�ȭ
		//return c;												// return 
		return a-b;												// return �� ������
	}
	// �Ű������� �̸��� ��������
	static float add(float a, int b){							// add method(float��ȯ��)
		return a+b;												// return
	}
	
	public static void main(String[] args) {
		// �޼��� ȣ�� ��, �޼����� �Ű����� ����, Ÿ��, ������ ��ġ�ؾ� �Ѵ�.
		int k = add(100,200);									// �ΰ� int�� �Ű������� ���� add method�� ������ �� int�� �� return
		//add(100,302.f);
		System.out.println(" k : "+k);							// ��ȯ k�� ���
				
		int n = minus(300,100);									// �ΰ� int�� �Ű������� ���� minus method�� ������ �� int�� �� return 
		System.out.println(" n : "+n);							// ��ȯ n�� ���
		
		float f = add(102.2f,500);								// float��, int�� �Ű������� ���� add method�� ������ �� float�� �� return
		System.out.println(" f : "+f);							// ��ȯ f�� ���
		
	}
}
