package d20160512;

public class ArrayEx6 {
	public static void main(String[] args){
		//int[] a = new int[3];
		int[] a = {3,9,2};							// ����� ���ÿ� �� �ʱ�ȭ
		
		System.out.println("a : "+a); 				// a ������
		
		// �迭�� ũ��
		System.out.println("���� : "+ a.length);		// �迭�� ���� ���
		
		// �迭�� �� ���
/*		a[0] = 10;									 
		a[1] = 20;
		a[3] = 30;*/
		
		// �迭 ��� ���
		// �ݺ��� ��� �ؼ� ���
		for(int i=0;i<a.length;i++){				// �迭�� ���̸�ŭ �ݺ�
		//	a[i] = (1+i)*10;
			System.out.println(a[i]);				// �迭 a�� ���
		}
	}
}
