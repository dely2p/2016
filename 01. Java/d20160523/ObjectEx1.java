package d20160523;

import d20160519.����;

// �ڹٿ��� ���������� ��?

// 1. import java.lang.*
// 2. extends Object
// 3. �⺻ ������(�ٸ� �Ű����� �ִ� �����ڰ� ���� ���)
//		��� ������ ���� �⺻��, ���� 0 ������ null
// 4. ��������� ����Ű�� �������� : this
// 5. super
// 6. super()
// 7. default

public class ObjectEx1 {
	public static void main(String[] args) {
		Object obj1 = new Object();				// Object Ŭ���� obj1 ����
		Object obj2 = new Object();				// Object Ŭ���� obj2 ����

		obj1 = obj2;							// obj2 �������� obj1�� ����
		System.out.println("obj1 : "+obj1);
		System.out.println("obj2 : "+obj2);
		
		if(obj1 == obj2)						// obj1�� obj2�� ������
			System.out.println("���ϰ�ü");
		else									// �ƴϸ�
			System.out.println("�ٸ���ü");

		System.out.println("----------------------------");
		
		if(obj1.equals(obj2))					// �ΰ� �������� ������ true, �ٸ��� false
			System.out.println("���ϰ�ü");
		else									// �ƴϸ�
			System.out.println("�ٸ���ü");
		
		System.out.println("----------------------------");
		
		Class cls = obj1.getClass();			// obj1�� � Ŭ�������� Ŭ������ ��Ÿ��
		System.out.println("Ŭ������  : "+cls.getName());
		
		// Object Ŭ������ instance�����ΰ���?(�� �������� � Ŭ������ ���������� �˰���� �� ����)
		System.out.println(obj1 instanceof Object); // instanceof�� ������
		System.out.println(obj1 instanceof ����);
		
		System.out.println("obj2�� ������  : "+ obj2);	// �츮�� ���� �������� toString()�Ǿ�����
		System.out.println("obj2.toString() : "+obj2.toString());
		System.out.println(
				obj2.getClass().getName() + '@' +
				Integer.toHexString(obj2.hashCode()));
		
		
	}
}
