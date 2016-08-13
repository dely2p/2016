package d20160523;

public class StringEx1 {
	public static void main(String[] args) {
		String str1 = new String("java");			// String Ŭ���� str1 ����
		String str2 = new String("java");			// String Ŭ���� str2 ����
		
		// String class�� toString()
		// Object Ŭ������ toString()�� �������̵� �߱� ������
		// �ڱ� �ڽ��� ���ڿ��� ����� �� �ִ�.		
		
		System.out.println(str1);					// String���� Override �ؼ� String�ڽ� ���� ����
		System.out.println(str2.toString());		// toString()�� �����Ǿ�����
		
		System.out.println("------------------------------");
		
		if(str1 == str2)							// ������ ��
			System.out.println("���� ��ü");
		else
			System.out.println("�ٸ� ��ü");

		System.out.println("------------------------------");
		
		// Object : equals() : ������ �� �޼���
		// String : equals() : ����� : Override
		
		if(str1.equals(str2))						// String Ŭ���������� ����񱳴� equals method���
			System.out.println("������ ���ڿ�");
		else
			System.out.println("�ٸ� ���ڿ�");
		
		System.out.println("------------------------------");
		
		String str3 = "java";						// new ������ ���ϸ�(Primitive typeó�� ����) ���� ���� ��
		String str4 = "java";						// �޸𸮸� ���̱����� ���� heap �޸� ���
		
		if(str3==str4)
			System.out.println("O");
		else
			System.out.println("X");
		str3 = "Oracle";							// ������ �ٲ�� ���ο� �޸𸮿� �ٽ� ����
		System.out.println(str3);					
		System.out.println(str4);
		
	}
}
