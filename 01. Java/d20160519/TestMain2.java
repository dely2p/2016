package d20160519;
// OOP
// 1. ĸ��ȭ(encapsulation) ==> ������ ����
// 2. ���(Inheritance)
// 3. �߻�ȭ(Abstraction)
// 4. ������(Polymorphism)



public class TestMain2 {
	public static void main(String[] args) {
		���� m1 = new ����();							// ���� Ŭ���� ����
		���� m2 = new ����();							
		���� m3 = new ����();							
		���� m4 = new ����();							
		
		Horse h1 = new Horse();						// Horse Ŭ���� ����
		Horse h2 = new Horse();
		Horse h3 = new Horse();
		Horse h4 = new Horse();
		Horse h5 = new Horse();
		
		// ������
		// ������ ���۹������ ���۽�Ű����
		// ��� ���� �ٸ� ������ �ϰ� �ϴ� ��
		
		/*Flyable f;
		f = m1;
		f = h1;*/
		Flyable[] f = {m1, m1, m3, m4, h1, h2, h3, h4, h5};		// �ѹ��� �����Ű��
		for(Flyable i : f){
			i.����();
		}
		
		
		
/*		m1.����();									// ���� method ����
		System.out.println("----------------");
		Horse h1 = new Horse();						// Horse Ŭ���� ����
		h1.����();									// ���� method ����
*/	}
}
