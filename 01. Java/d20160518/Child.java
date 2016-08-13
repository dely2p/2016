package d20160518;

public class Child extends Parent{
	
	String SNSid;										// 멤버변수
	
	Child(){											// 생성자
		super();
		SNSid = "푸하하하";
		System.out.println("Child 클래스의 기본생성자");
	}
	
	public void 클럽가기(){								// 클럽가기 method
		System.out.println("춤만 추러왔어요~~");
	}
	public void 학교가기(){								// 학교가기 method
		System.out.println("학교가기 싫어요ㅠㅠ");
	}
	// annotation
	@Override											// 컴파일 시점에 에러를 찾을 수 있음
	void 노래부르기(){										// 오버라이딩(method 시그니처는 동일, body는 다르게)
		System.out.println("Ah Choo~~");
	}
	
}
