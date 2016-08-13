package d20160517;

public class TestMain 
{
	public static void main(String[] args) {
		Medic me = new Medic();						// Medic 클래스 생성
		마린 m1 = new 마린();							// d20160516패키지에 있는 클래스를 가져옴
		마린 m2 = new 마린();							// 마린 m2 클래스 생성
		SiegeTank st = new SiegeTank();
		
		/*System.out.println("공격전 m2의 상태");
		m2.상태정보();
		
		System.out.println("m2 :"+m2);
		m1.공격(m2);
		
		System.out.println("공격후 m2의 상태");
		m2.상태정보();*/
		System.out.println("----------- 시즈모드 ----------");			// 시즈모드 문자열 출력
		st.상태정보();													// 상태정보 method
		st.시즈모드();													// 시즈모드 method
		st.상태정보();													// 상태정보 method 실행
		// 마린이 메딕을 공격
		System.out.println("----------- 시즈탱크가 메딕 공격 ----------");	// 시즈탱크가 메딕 공격 문자열 출력
		System.out.println("공격전 메딕상태");							// 공격전 메딕 상태 출력
		me.상태정보();													// 메딕 상태정보 출력
		
		st.공격(me);													// 시즈탱크 공격
		
		System.out.println("공격후 메딕상태");							// 공격받은 후 메딕상태 출력
		me.상태정보();													// 상태정보 method
		
		// 시즈탱크 객체를 생성하고 이 탱크가 미린과 시즈탱크를 공격할 수 있게 클래스를 작성하세요
		System.out.println("----------- 시즈탱크가 m1과 메딕 공격 -----------");
		System.out.println("공격전 m1의 상태");							// 공격전 m1 
		m1.상태정보();													// 상태정보 출력
		System.out.println("공격전 메딕상태");							// 공격전 메딕의
		me.상태정보();													// 상태정보 출력
		
		st.공격(m1);													// 시즈탱크의 마린 공격
		st.공격(me);													// 시즈탱크의 메딕 공격
		
		System.out.println("공격후 메딕상태");							// 공격 후 메딕
		me.상태정보();													// 상태정보 출력
		System.out.println("공격후 m1의 상태");							// 공격 후 마린
		m1.상태정보();													// 상태정보 출력
		
/*		m2.공격(m1);
		System.out.println("m1의 상태");
		m1.상태정보();
		System.out.println("m2의 상태");
		m2.상태정보();*/
		
/*		m2 = m1;
		m1.hp = 50;
		System.out.println(m2.hp);*/
		// me = m1;
		
		
		
//		System.out.println(me.HP);					// 메딕의 체력 출력

		
/*		GuGuDan gd = new GuGuDan();					// GuGuDan 클래스 생성
		GuGuDan gd2 = new GuGuDan(3);				// 매개변수가 있는  GuGudan 클래스 생성
		gd.print();									// gd의 print method 실행
		System.out.println("==================");	// 구분선
		gd2.print();								// gd2의 print method 실행
*/		
		
	}
}
