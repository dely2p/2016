package d20160519;

import java.util.Arrays;
// �ζ� ��ȣ ������ 
public class TestMain6 {
	public static void main(String[] args) {
		int[] m = {1,2,3,4,5,6,7,8,9,10,			// �迭 m�ʱ�ȭ
				11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,
				31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45};
		int[] n = new int[6];						// �迭 n�ʱ�ȭ
		
		// �����ϰ� 0���� 9������ ������ ���ϱ�?
		// 0.0*10<Math.random()*10<1.0*10 double
		
		/*for(int i=0;i<100;i++)
			System.out.print((int)(Math.random()*45)+" ");		
		System.out.println();*/
		
		// 0���� 44������ ������ �����ϰ� 2�� �̱�		
		for(int i=0;i<300;i++){
			int a = (int)(Math.random()*45);
			int b = (int)(Math.random()*45);
	
			int tmp = m[a];					// swap
			m[a] = m[b];
			m[b] = tmp;		
		}
		
		for(int i=0;i<6;i++){				// 6�� �̾Ƽ�
			n[i] = m[i];
		}
		Arrays.sort(n);						// �����ϱ� 
		
		for(int i=0;i<6;i++)
			System.out.print(m[i]+"\t");	// ���
		

	}
}
