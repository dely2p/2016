package d20160516;

public class StatementHw1 {
	public static void main(String[] args) {
		int[] m = {200,100,300,200,400};		// �迭 m�� �ʱ�ȭ
		int sum = 0;							// ���� ���� �����ص� sum�� 0���� �ʱ�ȭ
		for(int i : m ){						// ���� for���� �̿��ؼ�
			sum += i;							// �迭 m�� ������ ��� ����
		}
		System.out.println("sum : "+sum);		// ���� �� ���
	}
}
