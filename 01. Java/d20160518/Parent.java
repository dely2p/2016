package d20160518;

public class Parent {
	int 나이, 자산;												// 멤버변수
	String 이름, 성별, 성격, 직업;
	
	Parent(){													// 기본 생성자
		나이 = 50;
		자산 = 500000000;
		System.out.println("Parent 기본생성자");
	}
	Parent(String 이름, String 성별, String 성격, String 직업){		// 매개변수 있는 생성자
		super();
		this.이름 = 이름;
		this.성별 = 성별;
		this.성격 = 성격;
		this.직업 = 직업;
		System.out.println("Parent 매개변수 있는 생성자");
	}
	
	void 먹기(){													// 먹기 method
		System.out.println("냠냠냠냠~~~");
	}
	void 자기(){													// 자기 method
		System.out.println("쿨쿨~~~");
	}	
	void 잔소리(){													// 잔소리 method
		System.out.println("#%%$^&@#$@~~~");
	}
	void 노래부르기(){												// 노래부르기 method
		System.out.println("라라라라라랄~~~~라라~~");
	}
	void 요리하기(){												// 요리하기 method
		System.out.println("탕근탕근! 계란탁!");
	}
}
