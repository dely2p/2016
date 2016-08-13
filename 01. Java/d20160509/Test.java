package d20160509;

public class Test {										// Test Class 시작
	public static void main(String[] args){				// main method 자바응용프로그램의 시작
		// 변수 사용
		// 자료형 변수명 = 상수;
		char ch1 = 'a';									// char 형 ch1에 'a'로 초기화
		char ch2 = 97;									// ch2에 아스키코드 97로 초기화
		char ch3 = '\u0061';							// 유니코드 
		
		System.out.println("ch1 : " + ch1); 			// 연결연산자로 ch1 출력
		System.out.println("ch2 : " + ch2); 			// 연결연산자로 ch2 출력
		System.out.println("ch3 : " + ch3); 			// 연결연산자로 ch3 출력
		// char ch4 = "a"; 								// 문자열
		// char ch5 = 'ab';								// 문자 1개만 가능
		
		char ch6 = '\t';								// \의미가 있는 특수문자를 표기하는 기호
		// 특수 문자
		// \n \t \b \' \" \\
		System.out.println("오늘은  " + " 월요일"); 			// 연결연산자로 ch3 출력
		System.out.println("오늘은  " + ch6 + " 월요일"); 	// 연결연산자로 ch3 출력

		
	}													// main end
}														// Test class end
