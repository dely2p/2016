package d20160523;

public class StringEx1 {
	public static void main(String[] args) {
		String str1 = new String("java");			// String 클래스 str1 생성
		String str2 = new String("java");			// String 클래스 str2 생성
		
		// String class의 toString()
		// Object 클래스의 toString()를 오버라이드 했기 때문에
		// 자기 자신의 문자열을 출력할 수 있다.		
		
		System.out.println(str1);					// String에서 Override 해서 String자신 값이 나옴
		System.out.println(str2.toString());		// toString()이 생략되어있음
		
		System.out.println("------------------------------");
		
		if(str1 == str2)							// 참조값 비교
			System.out.println("같은 객체");
		else
			System.out.println("다른 객체");

		System.out.println("------------------------------");
		
		// Object : equals() : 참조값 비교 메서드
		// String : equals() : 내용비교 : Override
		
		if(str1.equals(str2))						// String 클래스에서의 내용비교는 equals method사용
			System.out.println("동일한 문자열");
		else
			System.out.println("다른 문자열");
		
		System.out.println("------------------------------");
		
		String str3 = "java";						// new 생성을 안하면(Primitive type처럼 선언) 값이 같을 때
		String str4 = "java";						// 메모리를 줄이기위해 같은 heap 메모리 사용
		
		if(str3==str4)
			System.out.println("O");
		else
			System.out.println("X");
		str3 = "Oracle";							// 내용이 바뀌면 새로운 메모리에 다시 생성
		System.out.println(str3);					
		System.out.println(str4);
		
	}
}
