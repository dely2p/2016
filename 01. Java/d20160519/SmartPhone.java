package d20160519;

public class SmartPhone {
	String os, ��ȭ��ȣ, ��Ż�, ��Ÿ�, �𵨸�;						// �������
	static String ������;
	int ���ɹ�ȣ, �ø����ȣ;
	
	public SmartPhone(){									// ������
		������ = "����";
	}
	
	SmartPhone(String os, String ��ȭ��ȣ, String ��Ż�, String ������, String ��Ÿ�, String �𵨸�, int ���ɹ�ȣ, int �ø����ȣ){
		this.os = os;
		this.��ȭ��ȣ = ��ȭ��ȣ;
		this.��Ż� = ��Ż�;
		this.������ = ������;
		this.��Ÿ� = ��Ÿ�;
		this.���ɹ�ȣ = ���ɹ�ȣ;
		this.�ø����ȣ = �ø����ȣ;
	}
	
	public void ��ȭ�ɱ�(String ��ȭ��ȣ){						// ��ȭ�ɱ� method
		System.out.println("-----------");
		System.out.println(��ȭ��ȣ+"�� ��ȭ�Ŵ� ��....");
	}
	public void ��ȭ�ޱ�(){									// ��ȭ�ޱ� method
		System.out.println("��ȭ ��������~~~~");
	}
	public void game(){										// game method
		System.out.println("�����ϱ�");
	}
	public void getApp(){									// getApp method
		System.out.println("���� �ޱ�");
	}
}
