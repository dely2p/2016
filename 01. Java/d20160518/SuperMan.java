package d20160518;

public class SuperMan extends Person {					// 부모 Person이 가진 변수와 method를 상속받음
	int 망또;												// 멤버변수
	int 레깅스;
	int 빨간팬티;
	
	SuperMan(){											// 기본생성자
		// 부모로부터 물려받은 변수도 초기화
		// super();										// 부모의 기본생성자(안써도 기본으로 들어있음)
		// super.age = 100;
		super("클라크","외계인","신문기자",20);					// 매개변수 있는 생성자로 직접호출
		망또 = 1; //(this.망또 =1)
		레깅스 = 1;
		빨간팬티 = 1;
		System.out.println("슈퍼맨 클래스의 기본생성자");
	}
	
	public void 비행(){									// 비행 method
		System.out.println("쓩~~~~~ ");
	}
	public void 레이져쏘기(){								// 레이져쏘기 method
		System.out.println("찌이잉~~~~");
	}
}
