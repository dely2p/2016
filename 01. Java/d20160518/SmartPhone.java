package d20160518;

public class SmartPhone extends Phone{					// Phone ��ӹ���

	String snsname;										// �������
	int appl;
	
	SmartPhone() {										// ������
		appl = 0;
	}

	void sns����(String snsname){							// sns���� method
		System.out.println(snsname+"����!");
	}
	void ���ôٿ�(String appname){							// ���ôٿ� method
		appl++;
		System.out.println(appname+"�ٿ� �Ϸ�!");
		System.out.println("�� ���� ���� : "+appl);		
	}
	void �������(){										// ������� method
		System.out.println("��Ĭ!");
		System.out.println("������� ���!!!");
	}
	void �����ϱ�(){										// �����ϱ� method
		power += 40;
		System.out.println("�������!!");
		System.out.println("���������� : "+power);
	}
	
	
}
