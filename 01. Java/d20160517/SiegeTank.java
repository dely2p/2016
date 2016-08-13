package d20160517;

public class SiegeTank {
	
	int hp,x,y,공격력,공격속도;		// 멤버변수
	int 이동속도, 방어력, 사정거리;
	int 단가;
	
public	SiegeTank(){
		hp = 200;				// 체력
		x = 0; y = 0;			// x, y
		공격력 = 30;				// 공격력
		방어력 = 50;				// 방어력
		이동속도 = 20;				// 이동속도
		공격속도 = 25;				// 공격속도
		단가 = 150;				// 단가
		사정거리 = 5;				// 사정거리 초기화
	}
	
	void 공격(){									// 공격 method
		System.out.println("펑~~~ 펑~~~");	// 문자열 출력
	}
	void 공격(마린 m){								// 공격 method
		System.out.println("마린 매개변수가 있는 메서드");	// 문자열 출력
//		System.out.println("m : "+m);
		m.hp -= 공격력;
		System.out.println("펑~~~ 펑~~~");	// 문자열 출력

	}
	void 공격(Medic me){								// 공격 method
		System.out.println("메딕 매개변수가 있는 메서드");	// 문자열 출력
//		System.out.println("me : "+me);
		me.HP -= 공격력;
		System.out.println("펑~~~ 펑~~~");	// 문자열 출력

	}
	void 이동(){									// 이동 method
		System.out.println("고고고~~~");			// 문자열 출력
	}
	void 패트롤(){									// 패트롤 method
		System.out.println("와리가리 ");			// 문자열 출력
	}	
	void 홀드(){
		System.out.println("얼어라 꽁~~~~");
	}
	void 시즈모드(){								// 시즈모드 method
		사정거리 +=20;
		공격력 +=150;	
	}
	void 상태정보(){								// 상태정보 method
		System.out.println("===================");
		System.out.println("체력 : "+hp);
		System.out.println("공격력 : "+공격력);
		System.out.println("공격속도 : "+공격속도);
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}
