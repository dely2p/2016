package d20160511;

public class ArrayEx2 {
	public static void main(String[] args) {
		// �迭 : ������ ũ�⸦ ���� ���ӵ� ������ �Ҵ�� ����
		//	1. ���ټӵ��� ���
		//	2. �ε����� �̿��� �ݺ����� ��� ����
		
		int[] a;										// �迭 a ����
		a = new int[5];									// a�迭 ����
		// �迭 ������ �������� �ڷ����� �⺻���� �������
		// �⺻���� : 0 
		// int �⺻�� : 0
		// float �⺻�� : 0.0f
		// boolean : true => 1 false ==> 0 
		// 			false
		
		System.out.println("a : "+a);							// a�� �ִ� �ּҰ�
		System.out.println("a[0] : "+a[0]);   					// a�迭�� �ּҸ� ���� ã�ư� 0��° ����- �⺻������ 0�� �������
		
		System.out.println(a.length); 					// �迭�� ����(����)�� ��Ÿ��		
		
/*		
		for(int i=0;i<5;i++){							// for���� �̿��� 5�� �ݺ�
			System.out.println("a["+i+"] : "+ a[i]);	// a�迭 ���
		}
		*/
	}
}
