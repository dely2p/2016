package d20160518;

public class Parent {
	int ����, �ڻ�;												// �������
	String �̸�, ����, ����, ����;
	
	Parent(){													// �⺻ ������
		���� = 50;
		�ڻ� = 500000000;
		System.out.println("Parent �⺻������");
	}
	Parent(String �̸�, String ����, String ����, String ����){		// �Ű����� �ִ� ������
		super();
		this.�̸� = �̸�;
		this.���� = ����;
		this.���� = ����;
		this.���� = ����;
		System.out.println("Parent �Ű����� �ִ� ������");
	}
	
	void �Ա�(){													// �Ա� method
		System.out.println("�ȳȳȳ�~~~");
	}
	void �ڱ�(){													// �ڱ� method
		System.out.println("����~~~");
	}	
	void �ܼҸ�(){													// �ܼҸ� method
		System.out.println("#%%$^&@#$@~~~");
	}
	void �뷡�θ���(){												// �뷡�θ��� method
		System.out.println("�������~~~~���~~");
	}
	void �丮�ϱ�(){												// �丮�ϱ� method
		System.out.println("��������! ���Ź!");
	}
}
