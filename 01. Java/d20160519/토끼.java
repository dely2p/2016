package d20160519;

public class �䳢 extends ������{					// ������ Ŭ���� ��ӹ���
	private int ��;
	protected int �̻�;
	public String ��;
	
	public �䳢(){								// ������
		�� = 2;
		�̻� = 2;
		�� = "�Ӱ��";   
	}	
	public void ����(){							// ���� method
		System.out.println("���ѱ���~~~~");
	}
	@Override									// annotation
	public void �Ա�(){							// �Ա� method
		System.out.println("�ȳȳ� Ǯ�� ���ְ� �Ծ��");
	}
	@Override									// annotation
	public void �ڱ�(){							// �ڱ� method
		System.out.println("������ �䳢������ ��~~");
	}
}
