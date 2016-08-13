package d20160518;

public class Protoss {
	int hp, shield, pay, atk, def, mspeed, aspeed;
	String name;
	
	Protoss(){							// Protoss 생성자
		
	}
	void 공격(Protoss p){					// 공격 method
		if(p.shield<0)					// shield가 0보다 작으면
			p.hp -= atk;				// hp에서 마이너스
		else if(p.shield<atk){			// shield가 atk보다 작으면
			int tmp = atk-p.shield;		// shield값에서 먼저 빼고
			p.hp -= tmp;				// 나머지는 hp에서 뺀다.
		}else							// shield에서 빼기가 가능하면
			p.shield -= atk;			// shield에서 뺀다.
		aspeed += 50;
		p.def += 40;
		p.mspeed += 40;
	}
	void 상태정보(){						// 상태정보 method
		System.out.println("[Dragon 상태정보]");
		System.out.println("hp : "+hp);
		System.out.println("shield : "+shield);
		System.out.println("pay : "+pay);
		System.out.println("atk : "+atk);
		System.out.println("def : "+def);
		System.out.println("mspeed : "+mspeed);
		System.out.println("aspeed : "+aspeed);
	}
}
