package d20160513;

public class MethodEx6 {
	static void printMsg(String str){				// printMsg method
		System.out.println(str+" �ڹ�!!!");			// �Ű������� ���ڿ��� ���
	}
	static void sayHello(){							// sayHello method
		System.out.println("������.");				// ���ڿ� ���
	}
	static void maxInt(int c, int d){				// maxInt method
		if(c>d) // ���Ǻб⹮							// c�� d���� �� ũ��
			System.out.println("ū ���� "+c+"�Դϴ�.");	// ��� ���
		else if(d<c)								// d�� c���� �� ũ��
			System.out.println("ū ���� "+d+"�Դϴ�.");	// ��� ���
		else										// �� ��(�� ���� ������)
			System.out.println("�� ���� �����ϴ�.");		// ��� ���
	}
	static int getNumber(int a, int b, int c, int d, int num){
		int arr[] = {a,b,c,d};						// �迭 arr�� �޾ƿ� a,b,c,d������ �ʱ�ȭ�Ѵ�.
		return arr[num-1];							// arr�� num-1 �ε����� ���� return�Ѵ�.
		
		/*switch(num){
		case 1:
			return a;
		case 2:
			return b;
		case 3:
			return c;
		case 4:
			return d;
		}
		return -1;*/
	}
	static int getInt(int[] temp, int position){	// getInt method ����		
		temp[position-1] = -100;
		return temp[position-1];					// return temp[position-1 ���]
	}
	public static void main(String[] args) {
		printMsg("Hello");							// printMsg method "call by value"������� ȣ��
		sayHello();									// "call by name" ���
		int a = 200;
		int b = 100;
		maxInt(a,b); // ū ���� ? �Դϴ�.
		
		int[] m = {200,3000,1000,240};				// m �迭 �ʱ�ȭ
		// 0,1,2
		// 3��° ���� �̱�
		int k = getNumber(200,3000,1000,240,3);		// getNumber�Լ� ȣ��
		System.out.println(k);						// k �� ���

		
		int[] r = new int[3];						// �迭 r�� ����
		r = m;
		System.out.println(m);						// m ���
		System.out.println(r);						// r ���
		System.out.println(m[0]);					// m ù��° �� ���
		System.out.println(r[0]);					// r ù��° �� ���
		
		System.out.println("�迭�� 3��° ���� : " +getInt(m,3));	// 3��°�� ���
		
		getInt(m,3);								// �Ű������� �迭�� ������ �� ����
		System.out.println(m[2]);					// �迭m�� 3��° �� ���
	}
}
