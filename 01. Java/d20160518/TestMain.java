package d20160518;

public class TestMain {
	public static void main(String[] args) {
		//Person p1 = new Person();					// Person Ŭ���� ����
		SuperMan sm = new SuperMan();				// SuperMan Ŭ���� ����
		
		sm.����();									// SuperMan�� method
		sm.�Ա�();									// Person�� method(��ӹ޾Ƽ� SuperMan���� ��� ����)
		System.out.println(sm.getName());			// Person�� getName ��밡��		
		
	}
}
