package d20160519;
// OOP
// 1. 캡슐화(encapsulation) ==> 정보의 은닉
// 2. 상속(Inheritance)
// 3. 추상화(Abstraction)
// 4. 다형성(Polymorphism)



public class TestMain2 {
	public static void main(String[] args) {
		마린 m1 = new 마린();							// 마린 클래스 생성
		마린 m2 = new 마린();							
		마린 m3 = new 마린();							
		마린 m4 = new 마린();							
		
		Horse h1 = new Horse();						// Horse 클래스 생성
		Horse h2 = new Horse();
		Horse h3 = new Horse();
		Horse h4 = new Horse();
		Horse h5 = new Horse();
		
		// 다형성
		// 동일한 조작방법으로 동작시키지만
		// 대상에 따라 다른 실행을 하게 하는 것
		
		/*Flyable f;
		f = m1;
		f = h1;*/
		Flyable[] f = {m1, m1, m3, m4, h1, h2, h3, h4, h5};		// 한번에 실행시키기
		for(Flyable i : f){
			i.비행();
		}
		
		
		
/*		m1.비행();									// 비행 method 실행
		System.out.println("----------------");
		Horse h1 = new Horse();						// Horse 클래스 생성
		h1.비행();									// 비행 method 실행
*/	}
}
