package d20160519;

public class 마린 extends Terran implements Flyable{
 
	int   공격력;												// 멤버변수  , 전역변수
	boolean isSteamPack;
	
	마린(){													// 마린 생성자								
		// super();
		hp = 100;  x =0 ; y = 0;
		공격력 = 5; 방어력 = 3; 
		공격속도 = 5; 이동속도 = 4;
		사정거리 = 5; 단가 = 50;
	}
	마린(int hp){												// 매개변수 1개 있는 생성자
		// super();
		this.hp = hp;
		// 자기 자신을 가리키는 참조변수
		  this.x =0 ; y = 0;
		공격력 = 5; 방어력 = 3; 
		공격속도 = 5; 이동속도 = 4;
		사정거리 = 5; 단가 = 50;
	}	
	
	@Override
	public void 비행() {										// 비행 method
		System.out.println("날아라 마린~~~~");
		
	}
	void 공격(){												// 공격 method
		System.out.println("뚜뚜뚜뚜ㄸ뚜뚜뚜뚜뚜");
	}
	
	void 공격(Terran t){										// Terran의 후손이면 모두 공격가능
		System.out.println("마린 매개변수가 있는 메서드");
		System.out.println("t : " + t);
		t.hp -= 공격력;
		System.out.println("뚜뚜뚜뚜ㄸ뚜뚜뚜뚜뚜");
	}


	void 스팀팩(){												// 스팀팩 method
		if(isSteamPack==false && hp > 5){					// isSteamPack이 false고 hp가 5보다 크면
			isSteamPack = true;								// isSteamPack을 true로 바꾸고
			System.out.println("뿅~~~~ 나와라 레이져~~~ ");		// 문자열 출력
			공격력+=3;											// 공격력 +3
			공격속도 +=3;										// 공격속도 +3
			hp -= 5;										// hp -5
		}		
	}		
}
