package d20160511;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] c;										// �迭 c ����
		c = new int[6];									// ���̰� 6�� �迭 ����
		// int a;
		// a = 10;
		// int a = 10;
		
		for(int i=0;i<c.length;i++){					// �迭�� ���̸�ŭ �ݺ�
			c[i] = 11*(i+1);							// �� �迭�� 11*(i+1)���� ����
			System.out.println("c["+i+"] : "+ c[i]);	// �� �迭 ���� ���
		}		
		
		System.out.println("------------------------------");
		
/*		int[] m = new int[10];
		m[0] = 20;
		m[1] = 10;
		m[2] = 90;
		m[3] = 110;*/
		
		// ��Ģ���� ���� �迭 �ʱ�ȭ ���
		int[] m = {20,10,90,110};						// m �迭 ������ �Բ� �ʱ�ȭ
					
		for(int i=0;i<m.length;i++){					// m �迭 ���̸�ŭ �ݺ�
			System.out.println("m["+i+"] : "+m[i]);		// m �迭 �� ���
		}
	}
}
