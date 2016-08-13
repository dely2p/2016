package d20160525;

public class ArrayListEx2 {
	// 자바는 객체지향 언어 입니다.
	// int ==> integer
	// byte ==> Byte
	// short ==> Short
	
	// Wrapper Class
	// primitive type의 변수를 감싸서 객체로..
	
	public static void main(String[] args) {
		byte b = 20; // 기본형 변수
		Byte by = new Byte(b); // 객체
		
		System.out.println(Byte.MAX_VALUE); // 최대값
		System.out.println(Byte.MIN_VALUE); // 최소값
		
		int c = 30;
		// 객체로 만들기
		Integer it = new Integer(c);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.toBinaryString(30)); // 이진수
		System.out.println(it.floatValue()); // float형
		
		Integer it2 = 40;
		int k = it2; // unboxing 허용
		System.out.println("k : "+k);
		
	
		
	}
}
