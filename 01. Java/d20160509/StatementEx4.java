package d20160509;

import java.io.IOException;

public class StatementEx4 {
	public static void main(String[] args) throws IOException {
		//�ܺηκ��� ���� �Է¹ޱ�
		System.out.println("�Է¹ޱ� : ");							// �Է¹ޱ� ���
		// ����ڷκ��� 1���ڸ� �Է¹޾� ASCII�ڵ�� ����
		int value = System.in.read();							// Ű���� �Է��� �޾Ƽ� value�� �ʱ�ȭ
		value -= 48;											// �Է¹��� ������ �ƽ�Ű�ڵ� 0(48)�� ����
		System.out.println("value : "+value);					// �� ���
		
		// �Է� ���� �� ����ϱ�
		for(int i=1;i<=9;i++){									// 9�� �ݺ�
			System.out.println(value+" * "+i+" = "+value*i);	// Ű�����Է¹��� ���� i�� ���ؼ� �� ���
		}
	}
}
