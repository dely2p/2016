package d20160519;

public class TestMain5 {
	// public : ����-������ ���� ������
	// static : instance-�������̵� ���ٰ�����
	// void : ���� ���� ����
	// main : �Լ���
	// (String[] args) : �Ű������� args��� String[]�� ���´�.
	
	public static void main(String[] args) {
		

		System.out.println(SmartPhone.������);				
		SmartPhone sp1 = new SmartPhone();				// Ŭ���� ����
		SmartPhone.������ = "����";							// ���� �ʱ�ȭ
		System.out.println(sp1.������);
		System.out.println("--------------------");
		
		System.out.println(Math.random()); 				// ���� �����ϰ� ��(static method)
		
		
	}
}
