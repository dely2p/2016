package d20160524;

import java.util.Random;

public class UtilEx1 {
	public static void main(String[] args) {
		Random rnd = new Random();				// ���� Ŭ���� ����
		for(int i=0;i<100;i++){				
			int k = rnd.nextInt(45);			// �� �̾Ƽ� k�� �ֱ�
			System.out.println("k : "+k);		// ���
		}
	}
}
