package d20160516;

public class MethodEx8 {
	
	static int add(int ... arrs){							// add method
		System.out.println("add �޼ҵ� ���� : "+arrs);			// add �޼ҵ� ���� �ּҰ� ���
		int sum = 0;										// ���� �� ������ �� sum���� ����
		for(int i=0;i<arrs.length;i++){						// arrs�� length��ŭ �ݺ�
			sum+=arrs[i];									// arrs�� ������ ��� ����
		}
		return sum;											// ��� ���� �� return 
	}
	public static void main(String[] args) {
		int a = 10;											// ���� a�� 10���� �ʱ�ȭ
		int b = 20;											// ���� b�� 20���� �ʱ�ȭ	
		int c = 30;											// ���� c�� 30���� �ʱ�ȭ
		
		int k = add(a,b);									// �Ű������� 2���� add ����
		int m = add(a,b,c);									// �Ű������� 3���� add ����
		
		System.out.println("k : "+k);						// k�� ���
		System.out.println("m : "+m);						// m�� ���
		
		System.out.println("=====================");		// ���� ���
		
		// �����μ�
		int n = add(100,200,500,1000);						// �Ű����� ���� ���Ƶ� method���� 
		int n2 = add(2000,1000,2000,3000,10,20,30,40);		// ���� �Ű������� add�Լ� ���డ��
		
		System.out.println("n : "+n);						// n�� ���
		System.out.println("n2 : "+n2);						// n2�� ���
	}
}
