package d20160509;

import java.io.IOException;
// �Է¹��� �����ܸ� ����ϱ� 
public class StatementHw7 {
	public static void main(String[] args) throws IOException{
		System.out.print("�� ��? ");							// �� ��? ���ڿ� ���
		int val = System.in.read();							// �ѱ��� ���ڸ� �Է¹���
		val-=48;											// �Է¹��� ���� �ƽ�Ű�ڵ� �� 48(���� 0)���� ����.
		for(int i=1;i<=9;i++)								// 1���� 9���� �ݺ��Ѵ�.
			System.out.println(val+" * "+i+" = "+val*i);	// �Է¹��� ���� �ݺ����� ����Ͽ� ����Ѵ�.
	}
}
