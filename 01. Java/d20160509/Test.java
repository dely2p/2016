package d20160509;

public class Test {										// Test Class ����
	public static void main(String[] args){				// main method �ڹ��������α׷��� ����
		// ���� ���
		// �ڷ��� ������ = ���;
		char ch1 = 'a';									// char �� ch1�� 'a'�� �ʱ�ȭ
		char ch2 = 97;									// ch2�� �ƽ�Ű�ڵ� 97�� �ʱ�ȭ
		char ch3 = '\u0061';							// �����ڵ� 
		
		System.out.println("ch1 : " + ch1); 			// ���Ῥ���ڷ� ch1 ���
		System.out.println("ch2 : " + ch2); 			// ���Ῥ���ڷ� ch2 ���
		System.out.println("ch3 : " + ch3); 			// ���Ῥ���ڷ� ch3 ���
		// char ch4 = "a"; 								// ���ڿ�
		// char ch5 = 'ab';								// ���� 1���� ����
		
		char ch6 = '\t';								// \�ǹ̰� �ִ� Ư�����ڸ� ǥ���ϴ� ��ȣ
		// Ư�� ����
		// \n \t \b \' \" \\
		System.out.println("������  " + " ������"); 			// ���Ῥ���ڷ� ch3 ���
		System.out.println("������  " + ch6 + " ������"); 	// ���Ῥ���ڷ� ch3 ���

		
	}													// main end
}														// Test class end
