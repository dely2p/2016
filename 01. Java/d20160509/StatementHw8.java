package d20160509;
//Ȧ���ܸ�  ����ϱ� 
public class StatementHw8 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++){									// ������ ���� i�� �ξ� 2�ܺ��� 9�ܱ��� �ݺ��Ѵ�.
			for(int j=1;j<=9;j++){								// �����ܿ��� 1���� 9���� ���� ���� j�� �ξ� �ݺ��Ѵ�.
				if((i%2)!=0)									// ������ ���� Ȧ���̸�
					System.out.println(i+" * "+j+" = "+i*j);	// �������� ����Ѵ�.
			}
			System.out.println();								// �ܸ��� �� �پ� �� �������� ���δ�.
		}
	}
}
