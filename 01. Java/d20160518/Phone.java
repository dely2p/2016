package d20160518;

public class Phone {
	String user, number,maker;								// �������
	int power, ncnt;
	
	Phone(){												// ������
		user = "ȫ�浿";
		power = 30;
		ncnt = 0;	
		maker = "samsung";
	}
	
	void ��ȭ�ɱ�(String number){								// ��ȭ�ɱ� method
		System.out.println(number+"���� ��ȭ�ɱ�!");
		System.out.println("��������������~~~~");
	}
	void ��ȭ�ޱ�(String number){								// ��ȭ�ޱ� method
		System.out.println(number+"���� ��ȭ�Խ��ϴ�!");
		System.out.println("��������?????");
	}
	void ��ȣ����(String number){								// ��ȣ���� method		
			this.number = number;
			System.out.println("��ȣ�� ����Ǿ����ϴ�.");
			ncnt++;
	}
	void �������(){											// ������� method
		System.out.println("��Ĭ!");
	}
	void �����ϱ�(){											// �����ϱ� method
		power += 20;
		System.out.println("���������� : "+power);
	}
	void ����(){												// �������� method
		System.out.println("[��������]");
		System.out.println("user name : "+user);
		System.out.println("maker : "+maker);
		System.out.println("���������� : "+power);
		System.out.println("��ȭ��ȣ ���� : "+ncnt);
		
	}
}
