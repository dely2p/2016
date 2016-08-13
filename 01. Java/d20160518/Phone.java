package d20160518;

public class Phone {
	String user, number,maker;								// 멤버변수
	int power, ncnt;
	
	Phone(){												// 생성자
		user = "홍길동";
		power = 30;
		ncnt = 0;	
		maker = "samsung";
	}
	
	void 전화걸기(String number){								// 전화걸기 method
		System.out.println(number+"에게 전화걸기!");
		System.out.println("따르르르르르릉~~~~");
	}
	void 전화받기(String number){								// 전화받기 method
		System.out.println(number+"에게 전화왔습니다!");
		System.out.println("여보세요?????");
	}
	void 번호저장(String number){								// 번호저장 method		
			this.number = number;
			System.out.println("번호가 저장되었습니다.");
			ncnt++;
	}
	void 사진찍기(){											// 사진찍기 method
		System.out.println("찰칵!");
	}
	void 충전하기(){											// 충전하기 method
		power += 20;
		System.out.println("현재충전량 : "+power);
	}
	void 정보(){												// 상태정보 method
		System.out.println("[상태정보]");
		System.out.println("user name : "+user);
		System.out.println("maker : "+maker);
		System.out.println("현재충전량 : "+power);
		System.out.println("전화번호 개수 : "+ncnt);
		
	}
}
