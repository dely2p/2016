package d20160513;
/*int[]   m = new int[ 9];

for(int i = o; i<=10; i++){
	System.out.println("i : "+ i );
}

ArrayIndexOutofBoundExcdeption : 10    �̶�� ������ �߻��ߴ� ��? �̷� ���ܰ� �߻��߰ڴ°�? */
public class StatementHw5 {
	public static void main(String[] args) {
		int[] m = new int[9];					// int�� 9�� ������ ���� �迭 m ����

		for(int i = 0; i<=10; i++){				// ������ 9���ε�, �ݺ��� 10���̹Ƿ� �޸� ������ �����ٰ� ������
			m[i]=i*100;							// �迭m�� i*100�� ����
			System.out.println("i : "+ i );		// i�� ���
		}
	}
}
