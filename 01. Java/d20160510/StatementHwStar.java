package d20160510;

public class StatementHwStar {
	public static void main(String[] args) {
		// 1,2,3,4,5 �ﰢ�� �����
/*		for(int i=1;i<=5;i++){						// 5�� �ݺ� ����
			for(int j=1;j<=i;j++){					// i�� �ݺ� ���� (���⼭ i�� ���� �ε����� ����) 
				System.out.print("*");				// ����� ���
			}
			System.out.println();					// �ึ�� �ش� ����ŭ ���� ��� ���� ���ش�.
		}
*/
		// 5,4,3,2,1 ���ﰢ�� �����
		for(int i=0;i<5;i++){						// 5�� �ݺ� ����
			for(int j=1;j<=5-i;j++){				// 5-i���� �ݺ� ����
				System.out.print("*");				// ����� ���
			}
			System.out.println();					// �� �� ���
		}
		// ���ﰢ�� ����� �Ǵٸ� ���
/*		for(int i=9;i>=1;i--){						// 5�� �ݺ� ����
			for(int j=1;j<=i;j++){					// i�� �ݺ� ���� (���⼭ i�� ���� �ε����� ����) 
				System.out.print("*");				// ����� ���
			}
			System.out.println();					// �ึ�� �ش� ����ŭ ���� ��� ���� ���ش�.
		}
*/
	}
}
