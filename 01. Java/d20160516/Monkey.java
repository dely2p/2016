package d20160516;

public class Monkey {
	int 꼬리, 귀, 눈, 코, 입;						// 매개변수 int형 생성
	String 종류, 성별;								// 매개변수 String형 생성
	int 나이;
	Monkey(){									// 생성자 기본형
		성별 = "숫컷";								// 성별을 숫컷
		나이 = 10;								// 나이는  10으로 초기화
	}
	Monkey(int x,String y,String z){			// 매개변수가 있는 생성자 
		나이 = x;									// 받아온 x를 나이에 초기화
		성별 = y;									// 받아온 y를 성별에 초기화
		종류 = z;									// 받아온 z를 종류에 초기화
	}
	
	void 나무타기(){								// 나무타기 method
		
	}
	void 먹기(){									// 먹기 method
		
	}
	void 걷기(){									// 걷기 method
			
	}
	void 자기(){									// 자기 method
		
	}
}
