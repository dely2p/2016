package d20160518;

public class TestMain3 {
	public static void main(String[] args) {
		���� m1 = new ����();							// ���� Ŭ���� m1 ����
		���� m2 = new ����();							// ���� Ŭ���� m2 ����
		SiegeTank st = new SiegeTank();				// ������ũ Ŭ���� st ����
		//Ghost g1 = new Ghost();						// Ghost Ŭ���� g1 ����
		Medic me = new Medic();						// Medic Ŭ���� me ����
		
		m1.����(m2);									// m1�� m2 ����
		m1.����(st);									// m1�� st ����
		//m1.����(g1);
		
		System.out.println("===============");		// ���м�
		
		me.��(m1);									// medic�� m1 ġ��
		me.��(me);									// medic�� meġ��

	}
}
