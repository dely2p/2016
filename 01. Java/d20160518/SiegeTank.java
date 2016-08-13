package d20160518;

public class SiegeTank extends Terran {
	int		공격력;							// 멤버변수
	boolean	siegeMod;

	SiegeTank() {							// 기본생성자
		hp = 150;
		x = 0;
		y = 0;
		공격력 = 30;
		공격속도 = 1;
		이동속도 = 2;
		방어력 = 1;
		사정거리 = 3;
		단가 = 150;
	}

	void siegeMode() {						// 시즈 모드 method
		if (!siegeMod) {					// 시즈모드면
			공격력 = 70;						// 공격력 -70
			사정거리 = 5;						// 사정거리는 5
		}
		else {								// 시즈모드 아니면
			공격력 = 30;						// 공격력 30
			사정거리 = 3;						// 사정거리 3
		}
	}

	void 공격(Terran t) {						// 공격 method
		t.hp -= 공격력;						// 공격력만큼 감소
	}

}
