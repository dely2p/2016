package d20160516;

public class 마린 {
	// 멤버변수, 전역변수
	int hp,x,y,공격력,공격속도;
	int 이동속도, 방어력, 사정거리;
	int 단가;
	boolean isSteamPack;
	
	// 생성자
	// 1. 클래스명과 동일
	// 2. 목적 : 멤버변수의 초기화
	// 3. 리턴값 X, void X
	// 4. 클래스명 ==> 첫글자를 대문자,
	//    생성자명 ==> 첫글자 대문자
	
	
	public 마린(){						// 마린 생성자
		hp = 100;				// 체력
		x = 0; y = 0;			// x, y
		공격력 = 10;				// 공격력
		방어력 = 20;				// 방어력
		이동속도 = 5;				// 이동속도
		공격속도 = 15;				// 공격속도
		단가 = 50;				// 단가
		사정거리 = 3;				// 사정거리 초기화
	}
	
	마린(int hp){					// 생성자(Constructor) 오버로딩
		this.hp = hp;			// 전역변수 hp에 지역변수 hp 값을 담음
		// 자기 자신을 가리키는 참조변수
		x = 0; y = 0;			// x, y
		공격력 = 10;				// 공격력
		방어력 = 20;				// 방어력
		이동속도 = 5;				// 이동속도
		공격속도 = 15;				// 공격속도
		단가 = 50;				// 단가
		사정거리 = 3;				// 사정거리 초기화
	}
	
	void 공격(){									// 공격 method
		System.out.println("뚜뚜뚜뚜두두두두두두두두");	// 문자열 출력
	}
	void 이동(){									// 이동 method
		System.out.println("고고고~~~");			// 문자열 출력
	}
	void 패트롤(){									// 패트롤 method
		System.out.println("와리가리 ");			// 문자열 출력
	}	
	void 스팀팩(){									// 스틸팩 method
		if(isSteamPack==false && hp>5){			// 만약 isSteamPack이 false고, hp가 5보다 크면
			isSteamPack = true;					// isSteamPack을 true로 바꾸고
			System.out.println("뿅~~ 나와라 레이져!");	// 문자열 출력	
			공격력+=3;									// 공격력은 +3
			공격속도+=3;								// 공격속도도 +3
			hp-=5;									// 체력은 -5로 변경
		}
		
	}
	void 홀드(){
		System.out.println("얼어라 꽁~~~~");
	}
	void 상태정보(){
		System.out.println("===================");
		System.out.println("체력 : "+hp);
		System.out.println("공격력 : "+공격력);
		System.out.println("공격속도 : "+공격속도);
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}
