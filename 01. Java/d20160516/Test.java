package d20160516;

public class Test {
	public static void main(String[] args) {
		
		Car c;								// 4byteũ���� ������� c�� stack�� ���õ�
		c = new Car();						// �����Ҵ翬����(new)�� heap�� ���� ����(����,�ڵ�,����,â��,������,������,���(),����(),����())
		//Car c = new Car();
		Car c2 = new Car();

		
		System.out.println(c); 				// Ŭ������ �ּ� ���
		
		c.���();								// Car Ŭ������ ��� method ����
		c.����();								// Car Ŭ������ ���� method ����(. -> dot������)
		System.out.println(c.����);			// Car Ŭ������ ���� ���� ���
		
		System.out.println(c2.����);			// Car Ŭ������ ���� ���� ���
		
		System.out.println("-----------------------------");
		c.������ = "�ƹݶ�";						// �ν��Ͻ� ������ ������ �Է�
		c.���� = 4;							// c.���� �ʱ�ȭ
		c.������ = "����";						// c.������ �ʱ�ȭ
		c.â�� = 6;							// c.â�� �ʱ�ȭ
		c.�ڵ� = 1;							// c.�ڵ� �ʱ�ȭ
		c.����();								// ���� method ����
		c2.������ = "�ҳ�Ÿ";					// �ν��Ͻ� ������ ������ �Է�
		
		System.out.println("c.������ : "+c.������);		// c��ü�� ������ ���
		System.out.println("c2.������ : "+c2.������);	// c2��ü�� ������ ���
		
	}
}
