package d20160510;

// 1���� 100���� ���� 2�� ����� 3�� ����� �ƴ� ���� ���
public class StatementHw15 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){				// 1���� 100���� �ݺ��� ����
			if(i%2!=0 && i%3!=0)				// 2�� ����� �ƴϰ� 3�� ����� �ƴ� �����
				System.out.print(i+" ");		// �� ���� ���
		}
	}
}
