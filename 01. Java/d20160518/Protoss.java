package d20160518;

public class Protoss {
	int hp, shield, pay, atk, def, mspeed, aspeed;
	String name;
	
	Protoss(){							// Protoss ������
		
	}
	void ����(Protoss p){					// ���� method
		if(p.shield<0)					// shield�� 0���� ������
			p.hp -= atk;				// hp���� ���̳ʽ�
		else if(p.shield<atk){			// shield�� atk���� ������
			int tmp = atk-p.shield;		// shield������ ���� ����
			p.hp -= tmp;				// �������� hp���� ����.
		}else							// shield���� ���Ⱑ �����ϸ�
			p.shield -= atk;			// shield���� ����.
		aspeed += 50;
		p.def += 40;
		p.mspeed += 40;
	}
	void ��������(){						// �������� method
		System.out.println("[Dragon ��������]");
		System.out.println("hp : "+hp);
		System.out.println("shield : "+shield);
		System.out.println("pay : "+pay);
		System.out.println("atk : "+atk);
		System.out.println("def : "+def);
		System.out.println("mspeed : "+mspeed);
		System.out.println("aspeed : "+aspeed);
	}
}
