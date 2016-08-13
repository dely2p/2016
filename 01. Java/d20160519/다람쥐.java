package d20160519;

public class 다람쥐 extends 포유류{					// 포유류 클래스 상속받음
	int 꼬리;										// 멤버변수
		
	public 다람쥐(){								// 생성자
		꼬리 = 1;
	}
	public void 나무에오르기(){						// 나무에오르기 method
		System.out.println("나무에 올라가용~~~~");
	}
	@Override									// annotation
	public void 먹기(){							// 먹기 method
		System.out.println("도토리를 먹어요");
	}
	@Override									// annotation
	public void 자기(){							// 자기 method
		System.out.println("쿨쿨쿨 다람쥐 잠~~");
	}
}
