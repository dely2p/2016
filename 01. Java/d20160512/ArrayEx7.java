package d20160512;

public class ArrayEx7 {
	public static void main(String[] args) {
		//int[][] m = new int [3][4];										// int�ڷ����� �⺻���� �������
		
		int[][] m = {
				{1,2,3,4},
				{9,2,3,8},
				{1,9,1,4}
		};		
		
		// ���
		for(int i=0;i<m.length;i++)										// 3�� �ݺ�(��)
			for(int j=0;j<m[i].length;j++)								// 4�� �ݺ�(��)
				System.out.println("m["+i+"]"+"["+j+"] : "+m[i][j]);	// �� �迭 �� ���
		
		System.out.println(m.length);									// ��� m�� ����(�� ���� ����)
		System.out.println(m[0]);										// �� ���� ������                                                   										
		System.out.println(m[0].length); 								// ��� m[0]�� ����(�� ���� ����) 

		
		int[][] n = new int[2][3];										// 2�� ��� ����
		System.out.println(n);											// ���ÿ� �ִ� n�� �ּҰ� ���
		System.out.println(n[0]);										// ���ÿ� �ִ�  n[0]
		System.out.println(n.length);									// n�� ���� ���(��� ����)
		System.out.println(n[0].length);								// n[0]�� ���� ���(���� ����)
	
	
	}
}
