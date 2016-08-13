package d20160519;

public class 고래 extends 포유류{					// 포유류 클래스 상속받음
	public int 지느러미;							// 멤버변수
	String 성별;
	
	public 고래(){								// 생성자
		지느러미 = 4;
		성별 = "여";     		
	}
	public void 헤엄치기(){						// 헤엄치기 method
		System.out.println("슝슝~~~~ 헤엄치기!");
	}
	@Override									// annotation
	public void 먹기(){							// 먹기 method
		System.out.println("냠냠냠 새우를 먹어요");
	}
	@Override									// annotation
	public void 자기(){							// 자기 method
		System.out.println("쿨쿨쿨 물속에서 잠~~");
	}
}
