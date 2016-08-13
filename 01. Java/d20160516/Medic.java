package d20160516;

public class Medic {
	int hp,x,y;							// 멤버변수 선언
	int 이동속도;
	boolean ishealing;
	
	Medic(){							// 생성자 
		hp = 60;						// 각 값들 초기화
		x = 0;
		y = 0;	
		이동속도 = 50;
	}
	Medic(int hp, int x, int y, int v){	// 매개변수가 있는 생성자
		this.hp = hp;					// 전역변수 hp에 받아온 hp 초기화
		this.x = x;						// 전역변수 x에 받아온 x로 초기화
		this.y = y;						// 전역변수 y에 받아온 y로 초기화
		이동속도 = v;						// 이동속도에 받아온 v값으로 초기화
	}
	void 물어보기(int x,int y,int v){		// 물어보기 method
		System.out.println("누가 날 불렀죠?");
		this.x=x;
		this.y=y;
		이동속도 = v;
	}
	void 상태말하기(boolean sta){			// 상태말하기 method
		if(sta)
			System.out.println("그는 살았어. 짐.");
		else			
			System.out.println("그는 죽었어. 짐.");
	}
	void 치료하기(){						// 치료하기 method
		if(ishealing == false){			// ishealing이 false이면
			ishealing = true;			// healing을 true로 바꾸고
			System.out.println("임무 중이에요.");	// 임무중 문자열 출력
			hp-=20;								// 생명력 -20
			이동속도 = 0;							// 이동속도 0으로 바꿈
		}			
	}
	void Medic정보(){						// medic 정보 출력
		System.out.println("hp : "+hp+", x : "+x+", y : "+y+", 이동속도 : "+이동속도);
	}
}
