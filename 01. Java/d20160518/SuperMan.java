package d20160518;

public class SuperMan extends Person {					// �θ� Person�� ���� ������ method�� ��ӹ���
	int ����;												// �������
	int ���뽺;
	int ������Ƽ;
	
	SuperMan(){											// �⺻������
		// �θ�κ��� �������� ������ �ʱ�ȭ
		// super();										// �θ��� �⺻������(�Ƚᵵ �⺻���� �������)
		// super.age = 100;
		super("Ŭ��ũ","�ܰ���","�Ź�����",20);					// �Ű����� �ִ� �����ڷ� ����ȣ��
		���� = 1; //(this.���� =1)
		���뽺 = 1;
		������Ƽ = 1;
		System.out.println("���۸� Ŭ������ �⺻������");
	}
	
	public void ����(){									// ���� method
		System.out.println("��~~~~~ ");
	}
	public void ���������(){								// ��������� method
		System.out.println("������~~~~");
	}
}
