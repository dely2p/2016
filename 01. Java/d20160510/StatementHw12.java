package d20160510;

import java.io.IOException;
// �Էµ� ���ڸ� �����ȯ ��Ű���� �Ѵ�.
public class StatementHw12 {
	public static void main(String[] args) throws IOException{
		
		// 1. ����ڷκ��� �Է°� �ޱ�
		System.out.println("�� �Է� : ");			// �� �Է� ���ڿ� ���
		int val = System.in.read();				// �Է¹��� ���� val�� �ʱ�ȭ
		
		// 2. ��ҹ��� �Ǻ�
		if(val>=97 && val<=122){// �ҹ���			// �Է¹��� ���� �ƽ�Ű 97~122���� ���̸�(�ҹ���)
			// 3. ��ȯ
			val-=32;							// �ƽ�Ű 32�� ���� �빮�ڷ� ��ȯ�Ѵ�.
		}else if(val>=65 && val<=90){			// �Է¹��� ���� �ƽ�Ű 65~90���� ���̸�(�빮��)
			val+=32;							// �ƽ�Ű 32�� ���ؼ� �ҹ��ڷ� ��ȯ�Ѵ�.
		}
		
		// 4. ���
		System.out.println((char)val);			// val�� ���ڷ� ����ȯ�ؼ� ����Ѵ�.
	}
}
