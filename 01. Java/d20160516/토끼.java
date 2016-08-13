package d20160516;

public class 토끼 {
	String 눈;						// 각 멤버변수 선언
	int 코, 입;
	
	토끼(){							// 토끼 생성자
		눈 = "빨강눈";					// 초기값 입력
		코 = 1;
		입 = 1;
	}
	토끼(String color){				// 매개변수가 1개 있는 토끼 생성자
		눈 = color;					// 매개변수의 String으로 눈의 색깔 변경
		코 = 1;
		입 = 1;
	}
	토끼(String color, int nose){		// 매개변수가 2개 있는 토끼 생성자
		눈 = color;					// 매개변수의 String으로 눈의 색깔 변경
		코 = nose;					// 매개변수의 int 값으로 코의 개수 변경
		입 = 1;
	}
	
	void 토끼정보(){					// 토끼 정보 출력 method
		System.out.println(눈+", 코"+코+"개, 입 "+입+"개");
	}
	void 먹기(){						// 먹기 method
		System.out.println("냠냠냠냠냠~~");
	}
	void 달리기(){						// 달리기 method
		System.out.println("깡총깡총~~~");
	}
	void 보기(String bob){			// 보기 method
		System.out.println(bob+" 발견! 번뜩!!!!");
	}
}
