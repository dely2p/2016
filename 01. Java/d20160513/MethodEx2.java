package d20160513;

public class MethodEx2 {
	// �Ű�����, �Ķ����, ����, �μ�, argument
	static void printGuGuDan(int dan){
		//int dan = 5;											// ������ ���?
		System.out.println("���޹��� �� : "+ dan);
		for(int i=1;i<=9;i++)									// ������ ��� ���� 9���ݺ�
			 System.out.println(dan+" * "+i+" = "+dan*i);		// 3�� ���		
	}
	static void gauss(int val){									// gauss method 
		int sum = 0;											// sum ���� 0���� �ʱ�ȭ
		for(int i=1;i<=val;i++){								// main���� �޾ƿ� ����ŭ �ݺ�
			sum += i;											// sum�� ����
		}
		System.out.println("1���� "+val+"������ ���� "+sum+"�Դϴ�.");	// �� ���
	}

	public static void main(String[] args) {
		// ������ 3�� ���
		printGuGuDan(3);										// ������  method�� ���� ������ ����
		printGuGuDan(5);
		
		gauss(100);												// gauss method ����
		
		gauss(1000);
	}
}
