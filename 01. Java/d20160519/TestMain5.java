package d20160519;

public class TestMain5 {
	// public : 공용-누구나 접근 가능한
	// static : instance-생성없이도 접근가능한
	// void : 리턴 값이 없는
	// main : 함수명
	// (String[] args) : 매개변수로 args라는 String[]을 갖는다.
	
	public static void main(String[] args) {
		

		System.out.println(SmartPhone.제조사);				
		SmartPhone sp1 = new SmartPhone();				// 클래스 생성
		SmartPhone.제조사 = "엘쮜";							// 변수 초기화
		System.out.println(sp1.제조사);
		System.out.println("--------------------");
		
		System.out.println(Math.random()); 				// 값을 랜덤하게 줌(static method)
		
		
	}
}
