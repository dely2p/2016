package d20160513;
/*int[]  m = { 2, 3  , 9 };

int[]  n = { 9, 11, 3 };

int[]  k = new int[3];

k �迭��  m+n�� ����� ��� ����ϼ��� */
public class StatementHw2 {
	public static void main(String[] args) {
		int[]  m = { 2, 3, 9 };				// �迭 m �ʱ�ȭ
		int[]  n = { 9, 11, 3 };			// �迭 n �ʱ�ȭ
		int[]  k = new int[3];				// �迭 k �ʱ�ȭ
		
		for(int i=0;i<3;i++){				// ���� ����ŭ(3) �ݺ�
			k[i]=m[i]+n[i];					// �迭 m�� �ش� ���� �迭 n�� �ش� ���� ���ؼ� �迭 k�� �����Ѵ�.
		}
		for(int i=0;i<k.length;i++){		// ���� ����ŭ �ݺ�
			System.out.print(k[i]+" ");		// �迭 k�� ���
		}
	}
}
