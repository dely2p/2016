package d20160519;

public class Horse extends ������ implements Flyable{					// �������κ��� ��۹���
	int ����;										// �������
	String ����; // ���丶
	
	Horse(){									// ������
		���� = 1;
		���� = "���丶";
	}
	public void �޸���(){							// �޸��� method
		System.out.println("��~~~ �޸���~~");	
	}
	@Override
	public void ����() {							// ���� method
		System.out.println("���ƶ�~~ Horse~~");	
	}
	@Override									// annotation
	public void �Ա�(){							// �Ա� method
		System.out.println("�ȳȳ� ����� �Ծ��");
	}
	@Override									// annotation
	public void �ڱ�(){							// �ڱ� method
		System.out.println("������ ���� �ڿ�~");
	}
}
