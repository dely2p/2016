package d20160516;

public class Test {
	public static void main(String[] args) {
		
		Car c;								// 4byte크기의 저장공간 c가 stack에 마련됨
		c = new Car();						// 동적할당연산자(new)로 heap에 새로 만듦(바퀴,핸들,엔진,창문,제조사,차량명,출발(),정지(),후진())
		//Car c = new Car();
		Car c2 = new Car();

		
		System.out.println(c); 				// 클래스의 주소 출력
		
		c.출발();								// Car 클래스의 출발 method 실행
		c.정지();								// Car 클래스의 정지 method 실행(. -> dot연산자)
		System.out.println(c.바퀴);			// Car 클래스의 바퀴 변수 출력
		
		System.out.println(c2.엔진);			// Car 클래스의 엔진 변수 출력
		
		System.out.println("-----------------------------");
		c.차량명 = "아반떼";						// 인스턴스 변수로 차량명 입력
		c.바퀴 = 4;							// c.바퀴 초기화
		c.제조사 = "현대";						// c.제조사 초기화
		c.창문 = 6;							// c.창문 초기화
		c.핸들 = 1;							// c.핸들 초기화
		c.주차();								// 주차 method 실행
		c2.차량명 = "소나타";					// 인스턴스 변수로 차량명 입력
		
		System.out.println("c.차량명 : "+c.차량명);		// c객체의 차량명 출력
		System.out.println("c2.차량명 : "+c2.차량명);	// c2객체의 차량명 출력
		
	}
}
