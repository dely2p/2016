package d20160519;

public class Terran {							// ����Ǵ� �κ��� ������ �� ������ ������ ����� �� -> �߻�ȭ(<->��üȭ)
	int mp;
	int hp, x, y, ���ݼӵ�;							
	int �̵��ӵ�, ����, �����Ÿ�;
	int �ܰ�;
	
	void �̵�(){									// �̵� method
		System.out.println("����~~~");			// ���ڿ� ���
	}
	void ��Ʈ��(){									// ��Ʈ�� method
		System.out.println("�͸����� ");			// ���ڿ� ���
	}	
	void Ȧ��(){
		System.out.println("���� ��~~~~");		// Ȧ�� method
	}
	void ��������(){								// �������� method
		System.out.println("===================");
		System.out.println("ü�� : "+hp);
//		System.out.println("���ݷ� : "+���ݷ�);
		System.out.println("���ݼӵ� : "+���ݼӵ�);
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}

}
