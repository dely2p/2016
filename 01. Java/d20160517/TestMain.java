package d20160517;

public class TestMain 
{
	public static void main(String[] args) {
		Medic me = new Medic();						// Medic Ŭ���� ����
		���� m1 = new ����();							// d20160516��Ű���� �ִ� Ŭ������ ������
		���� m2 = new ����();							// ���� m2 Ŭ���� ����
		SiegeTank st = new SiegeTank();
		
		/*System.out.println("������ m2�� ����");
		m2.��������();
		
		System.out.println("m2 :"+m2);
		m1.����(m2);
		
		System.out.println("������ m2�� ����");
		m2.��������();*/
		System.out.println("----------- ������ ----------");			// ������ ���ڿ� ���
		st.��������();													// �������� method
		st.������();													// ������ method
		st.��������();													// �������� method ����
		// ������ �޵��� ����
		System.out.println("----------- ������ũ�� �޵� ���� ----------");	// ������ũ�� �޵� ���� ���ڿ� ���
		System.out.println("������ �޵����");							// ������ �޵� ���� ���
		me.��������();													// �޵� �������� ���
		
		st.����(me);													// ������ũ ����
		
		System.out.println("������ �޵����");							// ���ݹ��� �� �޵���� ���
		me.��������();													// �������� method
		
		// ������ũ ��ü�� �����ϰ� �� ��ũ�� �̸��� ������ũ�� ������ �� �ְ� Ŭ������ �ۼ��ϼ���
		System.out.println("----------- ������ũ�� m1�� �޵� ���� -----------");
		System.out.println("������ m1�� ����");							// ������ m1 
		m1.��������();													// �������� ���
		System.out.println("������ �޵����");							// ������ �޵���
		me.��������();													// �������� ���
		
		st.����(m1);													// ������ũ�� ���� ����
		st.����(me);													// ������ũ�� �޵� ����
		
		System.out.println("������ �޵����");							// ���� �� �޵�
		me.��������();													// �������� ���
		System.out.println("������ m1�� ����");							// ���� �� ����
		m1.��������();													// �������� ���
		
/*		m2.����(m1);
		System.out.println("m1�� ����");
		m1.��������();
		System.out.println("m2�� ����");
		m2.��������();*/
		
/*		m2 = m1;
		m1.hp = 50;
		System.out.println(m2.hp);*/
		// me = m1;
		
		
		
//		System.out.println(me.HP);					// �޵��� ü�� ���

		
/*		GuGuDan gd = new GuGuDan();					// GuGuDan Ŭ���� ����
		GuGuDan gd2 = new GuGuDan(3);				// �Ű������� �ִ�  GuGudan Ŭ���� ����
		gd.print();									// gd�� print method ����
		System.out.println("==================");	// ���м�
		gd2.print();								// gd2�� print method ����
*/		
		
	}
}
