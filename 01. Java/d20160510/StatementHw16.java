package d20160510;

// 1���� 100���� ���� 2�� ����� 3�� ����� �ƴ� ���� ��Ƽ� ������ ���� ���
public class StatementHw16 {
	public static void main(String[] args) {
		int sum = 0;							// sum�� 0���� �ʱ�ȭ
		for(int i=1;i<=100;i++){				// 1���� 100���� �ݺ��� ����
			if(i%2!=0 && i%3!=0){				// 2�� ����� �ƴϰ�, 3�� ����� �ƴ� ���̸�
				sum += i;						// ��� ���Ѵ�.
			}
		}
		System.out.println("������ �� : "+sum);		// ��� ���� ���� ���
	}
}
