package d20160519;

public class Terran {							// 공통되는 부분을 가지고 더 상위의 개념을 만드는 것 -> 추상화(<->구체화)
	int mp;
	int hp, x, y, 공격속도;							
	int 이동속도, 방어력, 사정거리;
	int 단가;
	
	void 이동(){									// 이동 method
		System.out.println("고고고~~~");			// 문자열 출력
	}
	void 패트롤(){									// 패트롤 method
		System.out.println("와리가리 ");			// 문자열 출력
	}	
	void 홀드(){
		System.out.println("얼어라 꽁~~~~");		// 홀드 method
	}
	void 상태정보(){								// 상태정보 method
		System.out.println("===================");
		System.out.println("체력 : "+hp);
//		System.out.println("공격력 : "+공격력);
		System.out.println("공격속도 : "+공격속도);
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}

}
