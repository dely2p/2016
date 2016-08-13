package d20160519;

public class Horse extends 포유류 implements Flyable{					// 포유류로부터 상송받음
	int 꼬리;										// 멤버변수
	String 색상; // 적토마
	
	Horse(){									// 생성자
		꼬리 = 1;
		색상 = "적토마";
	}
	public void 달리다(){							// 달리다 method
		System.out.println("말~~~ 달리자~~");	
	}
	@Override
	public void 비행() {							// 비행 method
		System.out.println("날아라~~ Horse~~");	
	}
	@Override									// annotation
	public void 먹기(){							// 먹기 method
		System.out.println("냠냠냠 당근을 먹어요");
	}
	@Override									// annotation
	public void 자기(){							// 자기 method
		System.out.println("쿨쿨쿨 서서 자요~");
	}
}
