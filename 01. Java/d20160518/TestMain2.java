package d20160518;

public class TestMain2 {
	public static void main(String[] args) {
	/*
		Parent p = new Parent();		
		Child c = new Child();
		Child c2; 

		p = c;							// �θ�, �ڽ� �����̱⶧���� �θ����������� �ڽ� �������� ���� �� ����
		p.�Ա�();							// ����
		p.�뷡�θ���();						// �θ� �˰��ִ� method�� ȣ�� ����
		//p.Ŭ������();					// �θ� �𸣴� method�� ȣ�� �Ұ���
		
		//c = p;						// �θ��������� = �ڽ��������� ����(�ݴ�δ� ���� ���翩�θ� �� �� ���� ������ �� �� ����)
		
		c2 = (Child)p;					// p�� ��� �ִ� ���� c�̱⶧���� ����ȯ���ϸ� ������
		c2.Ŭ������(); 					// Ŭ������ method����
		*/
		
		Parent p = new Child();			// Parent�� Child�� �θ��ڽİ���(stack�� p�� heap�� ChildŬ������ ������)
		p.�Ա�();
	}
}
