package d20160516;

public class StatementHw4 {
	public static void main(String[] args) {
		Medic md = new Medic(50,0,0,50);		// Medic Ŭ���� ����(hp, x, y, �̵��ӵ�)
		md.Medic����();							// ���� ���
		System.out.println("�����!");				// ����� ���ڿ� ���
		md.�����(7,2,100);						// medic�� ����� method ��� �� ��ġ ��ȭ, �̵��ӵ� ��ȭ
		md.Medic����();							// ���� ���
		System.out.println("ġ�����ּ���~~");		// ġ�����ּ��� ���ڿ� ���
		md.ġ���ϱ�();								// �ӹ��� ���ڿ� ���, hp ����, �̵��ӵ� 0���� ��ȭ
		md.Medic����();							// ���� ���
		System.out.println("���°� �����?");		// ���°� ����� ���ڿ� ���
		md.���¸��ϱ�(false);						// false�� �ξ� ����� �˸�
		
	}
}
