package d20160516;

public class ���� {
	// �������, ��������
	int hp,x,y,���ݷ�,���ݼӵ�;
	int �̵��ӵ�, ����, �����Ÿ�;
	int �ܰ�;
	boolean isSteamPack;
	
	// ������
	// 1. Ŭ������� ����
	// 2. ���� : ��������� �ʱ�ȭ
	// 3. ���ϰ� X, void X
	// 4. Ŭ������ ==> ù���ڸ� �빮��,
	//    �����ڸ� ==> ù���� �빮��
	
	
	public ����(){						// ���� ������
		hp = 100;				// ü��
		x = 0; y = 0;			// x, y
		���ݷ� = 10;				// ���ݷ�
		���� = 20;				// ����
		�̵��ӵ� = 5;				// �̵��ӵ�
		���ݼӵ� = 15;				// ���ݼӵ�
		�ܰ� = 50;				// �ܰ�
		�����Ÿ� = 3;				// �����Ÿ� �ʱ�ȭ
	}
	
	����(int hp){					// ������(Constructor) �����ε�
		this.hp = hp;			// �������� hp�� �������� hp ���� ����
		// �ڱ� �ڽ��� ����Ű�� ��������
		x = 0; y = 0;			// x, y
		���ݷ� = 10;				// ���ݷ�
		���� = 20;				// ����
		�̵��ӵ� = 5;				// �̵��ӵ�
		���ݼӵ� = 15;				// ���ݼӵ�
		�ܰ� = 50;				// �ܰ�
		�����Ÿ� = 3;				// �����Ÿ� �ʱ�ȭ
	}
	
	void ����(){									// ���� method
		System.out.println("�ѶѶѶѵεεεεεεε�");	// ���ڿ� ���
	}
	void �̵�(){									// �̵� method
		System.out.println("����~~~");			// ���ڿ� ���
	}
	void ��Ʈ��(){									// ��Ʈ�� method
		System.out.println("�͸����� ");			// ���ڿ� ���
	}	
	void ������(){									// ��ƿ�� method
		if(isSteamPack==false && hp>5){			// ���� isSteamPack�� false��, hp�� 5���� ũ��
			isSteamPack = true;					// isSteamPack�� true�� �ٲٰ�
			System.out.println("��~~ ���Ͷ� ������!");	// ���ڿ� ���	
			���ݷ�+=3;									// ���ݷ��� +3
			���ݼӵ�+=3;								// ���ݼӵ��� +3
			hp-=5;									// ü���� -5�� ����
		}
		
	}
	void Ȧ��(){
		System.out.println("���� ��~~~~");
	}
	void ��������(){
		System.out.println("===================");
		System.out.println("ü�� : "+hp);
		System.out.println("���ݷ� : "+���ݷ�);
		System.out.println("���ݼӵ� : "+���ݼӵ�);
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}
