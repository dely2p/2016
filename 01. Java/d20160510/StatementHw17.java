package d20160510;

// �ֻ��� 2���� ���� ���� 4�� �Ǵ� ��� ��쿡 ���� ����ϼ���.
public class StatementHw17 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=6;i++){								// �ֻ����� ���� ���� 6��ŭ �ݺ�
			for(int j=1;j<=6;j++){							// �ΰ��� ���� ���ؾ��ϴ� �ֻ����� ���� ���� 6��ŭ �ݺ�
				sum = i+j;									// i�� j�� ���Ͽ� sum�� �����Ѵ�.
				if(sum==4){									// ���� ���� ���� 4���
					System.out.println("("+i+","+j+")");	// �ش� �ֻ��� �� i�� j�� ����Ѵ�.
				}
			}
		}
	}
}
