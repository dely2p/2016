package d20160519;
// 경찰은 총을 가지고 있다 . = has a(멤버변수로 만들어서 씀)
// 경찰은 총이다 = is a(상속)

// 다형성 : 대상에 따라 자기가 가진 고유의 행동을 실행하게 하는 것
public class Police {
	int 나이;													// 멤버변수
	String 계급, 이름, 성별, 근무지;
	Weapon w;
	
	Police(){												// 생성자
		
	}
	Police(Weapon w){										// 매개변수가 있는 생성자
		// 무장 경찰
		this.w = w;
	}
	public void fire(){										// fire method
		if(w!=null)
			w.use();
	}
	public void 체포(){										// 체포 method
		System.out.println("체포합니다 미란다원칙이 있어요~~");
	}
	public void 순찰(){										// 순찰 method
		System.out.println("순찰돌아요~~");
	}
	public void 음주단속(){									// 음주단속 method
		System.out.println("후~~ 불어주세요~~");
	}
	public void 수사(){										// 수사 method
		System.out.println("잠복수사중이에요~~");
	}
}
