package d20160516;

public class Car {
	int 바퀴;											// 멤버 변수 바퀴
	int 핸들;											// 멤버 변수 핸들
	int 엔진;											// 멤버 변수 엔진
	int 창문;											// 멤버 변수 창문
	String 제조사;										// 멤버 변수 제조사
	String 차량명;										// 멤버 변수 차량명
	
	void 출발(){										// method 출발
		System.out.println("부릉~~ 부릉~~");
	}
	void 정지(){										// method 정지
		System.out.println("찌이익~~~");
	}	
	void 가속(){										// method 가속
		System.out.println("과아악~~~");		
	}
	void 후진(){										// method 후진
		System.out.println("띠리리리리이리~~");
	}
	void 주차(){										// method 주차
		System.out.println(".......... p");
	}
}