package d20160513;

public class MethodEx3 {
	// static void 매서드명(매개변수, 매개변수, ...){
	// void : 리턴값 없음
	//}
	
	static int add(int a, int b){								// add method
		System.out.println("===add 매서드 내부 실행중===");			// 문자열 출력
		System.out.println(" a : " + a);						// a값 출력
		System.out.println(" b : " + b);						// b값 출력
		int c = a+b;											// a+b값을 int형 변수 c에 초기화
		// 일을 처리하고 값을 메인메서드로 리턴할 수 있다.
		return c;												// 계산 값 c를 main으로 다시 return 
	}
	// method 선언 형식
	// static 리턴값의 자료형 method명(자료형 변수명, 자료형 변수명...){
	//}
	
	static int minus(int a, int b){								// minus method
		//int c = a-b;											// a-b값을 int형 변수 c에 초기화
		//return c;												// return 
		return a-b;												// return 더 간결함
	}
	// 매개변수의 이름은 지역변수
	static float add(float a, int b){							// add method(float반환형)
		return a+b;												// return
	}
	
	public static void main(String[] args) {
		// 메서드 호출 시, 메서드명과 매개변수 개수, 타입, 순서가 일치해야 한다.
		int k = add(100,200);									// 두개 int형 매개변수를 가진 add method가 실행한 후 int형 값 return
		//add(100,302.f);
		System.out.println(" k : "+k);							// 반환 k값 출력
				
		int n = minus(300,100);									// 두개 int형 매개변수를 가진 minus method가 실행한 후 int형 값 return 
		System.out.println(" n : "+n);							// 반환 n값 출력
		
		float f = add(102.2f,500);								// float형, int형 매개변수를 가진 add method가 실행한 후 float형 값 return
		System.out.println(" f : "+f);							// 반환 f값 출력
		
	}
}
