package d20160516;

public class TestMain {
	public static void main(String[] args) {
		Person p1 = new Person();			// Ŭ���� p1 ����
		// Ŭ������ �������� = new ������();
		
		// ������ : ��ü�� �ʱ�ȭ�� �������� ��� ������ �ʱⰪ��
		// �������ִ� Ư���� �ɷ��� �ִ� �޼���
		
		// Ŭ������� ������ �̸��� ������ �ִ� �޼��� 
		// ��ü ������ 1ȸ�� ����Ǵ� �޼��� 
		
		
		Person p2 = new Person();			// Ŭ����  p2 ����
		Person p3 = new Person();			// Ŭ����  p3 ����
		
		p1.���� = 25;							// p1 Ŭ������ �� ������� �ʱ�ȭ
		p1.���� = "��";
		p1.�̸� = "������";
		p1.������ = "B";
		p1.Ű = 180.0f;
		p1.������ = 41.0f;
		p2.���� = 28;							// p2 Ŭ������ �� ������� �ʱ�ȭ
		p2.���� = "��";
		p2.�̸� = "��ö��";
		p2.������ = "A";
		p2.Ű = 180.5f;
		p2.������ = 60.0f;	
		
		System.out.println(p1.����);			// p1�� ������� �� ���
		System.out.println(p1.����);
		System.out.println(p1.�̸�);
		System.out.println(p1.������);
		System.out.println(p1.Ű);
		System.out.println(p1.������);
		System.out.println("============");
		System.out.println(p2.����);			// p2�� ������� �� ���
		System.out.println(p2.����);
		System.out.println(p2.�̸�);
		System.out.println(p2.������);
		System.out.println(p2.Ű);
		System.out.println(p2.������);
		System.out.println("============");
		System.out.println(p3.�̸�);			// p3�� ������� �� ���
	}
}
