package d20160517;

public class StatementHw1 {
	static int[][] add(int[][] a, int[][]b){		// add method
		int[][] c = new int[3][3];					// ���� ���� ���� 3x3 �迭 ����
		for(int i=0;i<3;i++){						// 3��
			for(int j=0;j<3;j++){					// 3�� �ݺ� �����ϸ鼭
				c[i][j] = a[i][j] + b[i][j];		// a�� b�� ���� ���� ���� c�� �����Ѵ�.
			}
		}
		return c;									// �迭�� return �Ѵ�.
	}
	public static void main(String[] args) {
		int[][] rslt = new int[3][3];				// ������� ���� �迭 ����
		int[][] a = {{3,2,3},{4,5,6},{1,4,9}};		// a�迭 ���� �� �ʱ�ȭ
		int[][] b = {{1,8,7},{6,4,4},{3,2,3}};		// b�迭 ���� �� �ʱ�ȭ
		
		rslt =add(a,b);								// add method�� �����ϰ� return ���� rslt �迭�� �����Ѵ�.
		
		for(int i=0;i<3;i++){						// 3��
			for(int j=0;j<3;j++){					// 3���� ���鼭
				System.out.print(rslt[i][j]+" ");	// �迭 ������� ���
			}
			System.out.println();					// ���� ��� 
		}
	}
}

