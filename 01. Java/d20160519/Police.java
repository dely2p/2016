package d20160519;
// ������ ���� ������ �ִ� . = has a(��������� ���� ��)
// ������ ���̴� = is a(���)

// ������ : ��� ���� �ڱⰡ ���� ������ �ൿ�� �����ϰ� �ϴ� ��
public class Police {
	int ����;													// �������
	String ���, �̸�, ����, �ٹ���;
	Weapon w;
	
	Police(){												// ������
		
	}
	Police(Weapon w){										// �Ű������� �ִ� ������
		// ���� ����
		this.w = w;
	}
	public void fire(){										// fire method
		if(w!=null)
			w.use();
	}
	public void ü��(){										// ü�� method
		System.out.println("ü���մϴ� �̶��ٿ�Ģ�� �־��~~");
	}
	public void ����(){										// ���� method
		System.out.println("�������ƿ�~~");
	}
	public void ���ִܼ�(){									// ���ִܼ� method
		System.out.println("��~~ �Ҿ��ּ���~~");
	}
	public void ����(){										// ���� method
		System.out.println("�ẹ�������̿���~~");
	}
}
