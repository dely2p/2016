package d20160518;

public class Medic extends Terran{

	String 성별, 이름;									// 멤버변수
	boolean isHeal;
	
	Medic() {										// 생성자
		이름 = "모랄레스";
		공격속도 = 3;
		성별 = "여";
		hp = 80;
		mp = 80;
		이동속도 = 4;
		사정거리 = 2;
		x = 0;
		y = 0;
	}
	
	Medic(int  HP, int MP , int 사정거리){				// 매개변수가 3개인 생성자
	// 기본생성자를 호출해 
		this();
		this.hp = HP;
		this.mp= MP;
		this.사정거리 = 사정거리;
	}
	// hp, 사거리 ,  이름 , mp
	Medic(int hp, int 사정거리, String 이름, int mp){	// 매개변수가 4개인 생성자
		this(hp,mp,사정거리);
		this.이름 = 이름;

	}
	
	void 힐(Terran t) {								// 힐 method(테란의 모든 후손 치료 가능)
		if (t.mp > 10) {							// mp가 10보다 크면 
			t.mp -= 10;								// mp -10
			System.out.println("치료중입니다.");			// 치료
		} else {									// 10보다 작으면
			System.out.println("마나가..부족해..");		// 마나 부족 출력
		}

	}

	
	

}
