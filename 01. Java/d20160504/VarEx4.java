package d20160504;

public class VarEx4 {
	// main method
	public static void main(String[] args) {
		int i = 20;
		System.out.println(" i : "+ i);
		
		char c = 'a'; //���� �ѱ��� ' '
		System.out.println(" c : "+ c);
		char d1 = 'J'; //74
		char d2 = 'A'; //65
		char d3 = 'V'; //86
		char d4 = 'A'; //65
		System.out.println(""+d1+d2+d3+d4);
		//JAVA ���ڸ� ���
		
		String str = "Hello Java World";
		System.out.println(str);
		
		char c1 = 'A';
		// char c2 = 'AB';
		String s1 = "A";
		String s2 = "AB";
		
		char ch1 = 'A'; // ����
		char ch2 = 97; // ASCII �ڵ�
		char ch3 = '\u0061'; // unicode
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		// ���ڿ� + ���� ==> ����
		// ���� + ���� ==> ���������		
		System.out.println(d1+d2); // + : ���������
		System.out.println(""+d1+d2); // + ���Ῥ����
		// ������  ASCII �ڵ� + ASCII �ڵ� 
	}
}
