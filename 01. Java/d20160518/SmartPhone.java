package d20160518;

public class SmartPhone extends Phone{					// Phone 상속받음

	String snsname;										// 멤버변수
	int appl;
	
	SmartPhone() {										// 생성자
		appl = 0;
	}

	void sns실행(String snsname){							// sns실행 method
		System.out.println(snsname+"실행!");
	}
	void 어플다운(String appname){							// 어플다움 method
		appl++;
		System.out.println(appname+"다운 완료!");
		System.out.println("총 어플 개수 : "+appl);		
	}
	void 사진찍기(){										// 사진찍기 method
		System.out.println("찰칵!");
		System.out.println("포샵기능 사용!!!");
	}
	void 충전하기(){										// 충전하기 method
		power += 40;
		System.out.println("고속충전!!");
		System.out.println("현재충전량 : "+power);
	}
	
	
}
