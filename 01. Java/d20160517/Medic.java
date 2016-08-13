package d20160517;

public class Medic 
{
	int 공격속도, HP, MP, 이동속도, 사거리, x, y;					// 멤버변수 선언
	String 성별, 이름;
	boolean isHeal;
	
	Medic()	{												// 생성자 -> 멤버변수 초기화
		이름 = "모랄레스";
		공격속도 = 3;
		성별 = "여";
		HP = 80;
		MP = 80;
		이동속도 = 4;
		사거리 = 2;
		x = 0;
		y = 0;
	}	
	
	Medic(int HP, int MP, int 사거리){ 						// (a=체력, b=마력, c=사거리) 매개변수 3개 있는  생성자 
	
		this();				// 기본생성자를 호출
		this.HP = HP;
		this.MP = MP;
		this.사거리 = 사거리;	
	}
	Medic(int HP, int 사거리, String 이름, int MP){ 			// 매개변수 4개 있는 생성자
		
		this(HP,MP,사거리);									// Medic(int HP, int MP, int 사거리) 생성자 호출
		this.이름 = 이름;										// 이름 변수 초기화

	}
	
		
	void 힐(){												// 힙 method
		if(MP>10){											// mp가 10보다 크면
			MP -= 10;										// mp를 10을 뺀다
			System.out.println("치료중입니다.");					// 치료중 출력
		} else{												// 아니면
			System.out.println("마나가..부족해..");				// 마나가 부족 출력
		}
		
	}
	
	void 상태정보(){											// 상태정보 method
		System.out.println("===상태정보===");
		System.out.println("이름 = "+ 이름);
		System.out.println("HP = " + HP);
		System.out.println("MP = " + MP);
		System.out.println("성별 = "+ 성별);
		System.out.println("이동 속도 = " + 이동속도);
		System.out.println("사거리 = " + 사거리);	
		System.out.println("==========");
	}

}
