package d20160517;

public class SiegeTank {
	
	int hp,x,y,���ݷ�,���ݼӵ�;		// �������
	int �̵��ӵ�, ����, �����Ÿ�;
	int �ܰ�;
	
public	SiegeTank(){
		hp = 200;				// ü��
		x = 0; y = 0;			// x, y
		���ݷ� = 30;				// ���ݷ�
		���� = 50;				// ����
		�̵��ӵ� = 20;				// �̵��ӵ�
		���ݼӵ� = 25;				// ���ݼӵ�
		�ܰ� = 150;				// �ܰ�
		�����Ÿ� = 5;				// �����Ÿ� �ʱ�ȭ
	}
	
	void ����(){									// ���� method
		System.out.println("��~~~ ��~~~");	// ���ڿ� ���
	}
	void ����(���� m){								// ���� method
		System.out.println("���� �Ű������� �ִ� �޼���");	// ���ڿ� ���
//		System.out.println("m : "+m);
		m.hp -= ���ݷ�;
		System.out.println("��~~~ ��~~~");	// ���ڿ� ���

	}
	void ����(Medic me){								// ���� method
		System.out.println("�޵� �Ű������� �ִ� �޼���");	// ���ڿ� ���
//		System.out.println("me : "+me);
		me.HP -= ���ݷ�;
		System.out.println("��~~~ ��~~~");	// ���ڿ� ���

	}
	void �̵�(){									// �̵� method
		System.out.println("����~~~");			// ���ڿ� ���
	}
	void ��Ʈ��(){									// ��Ʈ�� method
		System.out.println("�͸����� ");			// ���ڿ� ���
	}	
	void Ȧ��(){
		System.out.println("���� ��~~~~");
	}
	void ������(){								// ������ method
		�����Ÿ� +=20;
		���ݷ� +=150;	
	}
	void ��������(){								// �������� method
		System.out.println("===================");
		System.out.println("ü�� : "+hp);
		System.out.println("���ݷ� : "+���ݷ�);
		System.out.println("���ݼӵ� : "+���ݼӵ�);
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}
