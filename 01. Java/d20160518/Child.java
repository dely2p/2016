package d20160518;

public class Child extends Parent{
	
	String SNSid;										// �������
	
	Child(){											// ������
		super();
		SNSid = "Ǫ������";
		System.out.println("Child Ŭ������ �⺻������");
	}
	
	public void Ŭ������(){								// Ŭ������ method
		System.out.println("�㸸 �߷��Ծ��~~");
	}
	public void �б�����(){								// �б����� method
		System.out.println("�б����� �Ⱦ��Ф�");
	}
	// annotation
	@Override											// ������ ������ ������ ã�� �� ����
	void �뷡�θ���(){										// �������̵�(method �ñ״�ó�� ����, body�� �ٸ���)
		System.out.println("Ah Choo~~");
	}
	
}
