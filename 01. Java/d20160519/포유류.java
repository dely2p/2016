package d20160519;

public abstract class 포유류 {							// 추상 클래스 (추상 method가 한개라도 있으면 추상클래스여야함)
													// 추상클래스는 new 할 수 없는 클래스
	public int 눈, 코, 입;								// 멤버변수
	
	포유류(){											// 생성자
		눈 = 2;
		코 = 1;
		입 = 1;
	}
	
	public abstract void 먹기();						// 추상형 먹기 method(추상형으로 반드시 오버라이드 해야함)
	public abstract void 자기();						// 추상형 자기 method

}
