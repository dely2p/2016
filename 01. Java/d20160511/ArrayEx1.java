package d20160511;

public class ArrayEx1 {
	public static void main(String[] args) {
		// �迭 : apt ����
		// ������ ����� ���ӵ� ������ �Ҵ�Ǵ� ����
		// int a; ���� ����
		int[] a;											// �迭 ����
		// int a[]; �迭�� �ٸ� ǥ��
		
		a = new int[3]; // a���� intũ���� �迭 3���� ��Ʈ�� ����ٴ� �ǹ�
		
		a[0] = 10;											// a�� 0��° �迭�� 10�� ����
		a[1] = 20;											// a�� 1��° �迭�� 20�� ����
		a[2] = 30;											// a�� 2��° �迭�� 30�� ����
		
		System.out.println("a[0] : "+a[0]);					// a[0]�� �� ���
		System.out.println("a[1] : "+a[1]);					// a[1]�� �� ���
		System.out.println("a[2] : "+a[2]);					// a[2]�� �� ���
		System.out.println();								// �� ĭ ���
		// --------------------------------------------------------
		
		// int ũ��10���� �迭 ���� b�� �����ϰ�
		// ������ ������ 10,20,30,40,50,60,70,80,90,100�� ����
		int[] b;											// �迭 b����
		b = new int[10];									// �迭 ����
/*		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		b[5] = 60;
		b[6] = 70;
		b[7] = 80;
		b[8] = 90;
		b[9] = 100;		*/
		// ����ϼ���
/*		System.out.println("b[0] : "+b[0]);
		System.out.println("b[1] : "+b[1]);
		System.out.println("b[2] : "+b[2]);
		System.out.println("b[3] : "+b[3]);
		System.out.println("b[4] : "+b[4]);
		System.out.println("b[5] : "+b[5]);
		System.out.println("b[6] : "+b[6]);
		System.out.println("b[7] : "+b[7]);
		System.out.println("b[8] : "+b[8]);
		System.out.println("b[9] : "+b[9]);*/

		// b[���� ] : ���� ==> ÷��, �ε���
		for(int i=0;i<=9;i++){								// �ݺ����� 10�� ������
			b[i] = 10*(i+1);								// �迭 b�� ���� �ֱ�-10�� �����ϴ� �� �ֱ�
			System.out.println("b["+i+"] : "+b[i]);			// �迭 �� ���
		}	
		
		//System.out.println(b[10]);						// runtime�� ����-�迭�� �ε����� ������ ���
	}
}
