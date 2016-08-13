package d20160519;

public class SmartPhone {
	String os, 전화번호, 통신사, 통신망, 모델명;						// 멤버변수
	static String 제조사;
	int 유심번호, 시리얼번호;
	
	public SmartPhone(){									// 생성자
		제조사 = "구글";
	}
	
	SmartPhone(String os, String 전화번호, String 통신사, String 제조사, String 통신망, String 모델명, int 유심번호, int 시리얼번호){
		this.os = os;
		this.전화번호 = 전화번호;
		this.통신사 = 통신사;
		this.제조사 = 제조사;
		this.통신망 = 통신망;
		this.유심번호 = 유심번호;
		this.시리얼번호 = 시리얼번호;
	}
	
	public void 전화걸기(String 전화번호){						// 전화걸기 method
		System.out.println("-----------");
		System.out.println(전화번호+"로 전화거는 중....");
	}
	public void 전화받기(){									// 전화받기 method
		System.out.println("전화 받으세요~~~~");
	}
	public void game(){										// game method
		System.out.println("게임하기");
	}
	public void getApp(){									// getApp method
		System.out.println("어플 받기");
	}
}
