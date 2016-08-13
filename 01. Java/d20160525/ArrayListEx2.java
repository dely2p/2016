package d20160525;

public class ArrayListEx2 {
	// �ڹٴ� ��ü���� ��� �Դϴ�.
	// int ==> integer
	// byte ==> Byte
	// short ==> Short
	
	// Wrapper Class
	// primitive type�� ������ ���μ� ��ü��..
	
	public static void main(String[] args) {
		byte b = 20; // �⺻�� ����
		Byte by = new Byte(b); // ��ü
		
		System.out.println(Byte.MAX_VALUE); // �ִ밪
		System.out.println(Byte.MIN_VALUE); // �ּҰ�
		
		int c = 30;
		// ��ü�� �����
		Integer it = new Integer(c);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.toBinaryString(30)); // ������
		System.out.println(it.floatValue()); // float��
		
		Integer it2 = 40;
		int k = it2; // unboxing ���
		System.out.println("k : "+k);
		
	
		
	}
}
