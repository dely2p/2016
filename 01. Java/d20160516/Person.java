package d20160516;

public class Person {
	int 머리, 팔, 다리, 눈, 코, 입;							// 클래스 멤버변수에 초기값을 줌
	String 이름, 혈액형, 성별;								// String,
	int 나이;												// int
	float 키, 몸무게;										// float형 멤버변수 선언
	
	// 기본 생성자 - 생략 가능(없어도 있는것처럼 생성이 됨)
/*	Person(){
		머리 =0; 팔=0; 다리=0; 눈=0; 코=0; 입=0;
		이름 = null; 혈액형 = null; 성별 = null;
		나이 = 0; 키 = 0.0f; 몸무게 = 0.0f;
	}*/
	Person(int x, String y){							// Person 매개변수가 있는 생성자
		System.out.println("매개변수 있는 생성자");				// 문자열 출력
		 나이 = x;										// 받아온 값 나이에 초기화
		 이름 = y;										// 받아온 값 이름에 초기화
	}
	
	Person(){
		// 멤버변수의 값을 초기화 할 목적
		// 리턴할 필요가 없는 메서드, void
		머리 = 1;											// 생성자에서 각 멤버변수에 초기값을 줌
		팔 = 2;
		다리 = 2;
		눈 = 2;
		코 = 1;
		입 = 1;
		이름 = "이브";
		혈액형 = "o";
		성별 = "여";
		나이 = 20;
		키 = 180.0f;
		몸무게 = 60.0f;
		System.out.println("기본 생성자 호출됨");				// 기본 생성자 호출 문자열 출력

	}
	
	void 먹기(){											// 먹기 method 실행
		System.out.println("냠냠 맛있게 먹어요 ");				// 문자열 출력
	}
	void 잔다(){											// 잔다 method 실행
		System.out.println("쿨쿨 자요~~~ ");				// 문자열 출력
	}
	void 생각한다(){										// 생각한다 method 실행
		System.out.println("생각중... ");					// 문자열 출력
	}
	void 달리기(){											// 달리기 method 실행
		System.out.println("달료~~~~ ");					// 문자열 출력
	}
}
