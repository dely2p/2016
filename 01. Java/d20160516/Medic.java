package d20160516;

public class Medic {
	int hp,x,y;							// ������� ����
	int �̵��ӵ�;
	boolean ishealing;
	
	Medic(){							// ������ 
		hp = 60;						// �� ���� �ʱ�ȭ
		x = 0;
		y = 0;	
		�̵��ӵ� = 50;
	}
	Medic(int hp, int x, int y, int v){	// �Ű������� �ִ� ������
		this.hp = hp;					// �������� hp�� �޾ƿ� hp �ʱ�ȭ
		this.x = x;						// �������� x�� �޾ƿ� x�� �ʱ�ȭ
		this.y = y;						// �������� y�� �޾ƿ� y�� �ʱ�ȭ
		�̵��ӵ� = v;						// �̵��ӵ��� �޾ƿ� v������ �ʱ�ȭ
	}
	void �����(int x,int y,int v){		// ����� method
		System.out.println("���� �� �ҷ���?");
		this.x=x;
		this.y=y;
		�̵��ӵ� = v;
	}
	void ���¸��ϱ�(boolean sta){			// ���¸��ϱ� method
		if(sta)
			System.out.println("�״� ��Ҿ�. ��.");
		else			
			System.out.println("�״� �׾���. ��.");
	}
	void ġ���ϱ�(){						// ġ���ϱ� method
		if(ishealing == false){			// ishealing�� false�̸�
			ishealing = true;			// healing�� true�� �ٲٰ�
			System.out.println("�ӹ� ���̿���.");	// �ӹ��� ���ڿ� ���
			hp-=20;								// ����� -20
			�̵��ӵ� = 0;							// �̵��ӵ� 0���� �ٲ�
		}			
	}
	void Medic����(){						// medic ���� ���
		System.out.println("hp : "+hp+", x : "+x+", y : "+y+", �̵��ӵ� : "+�̵��ӵ�);
	}
}
