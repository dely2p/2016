package d20160504;

public class VarEx4 {
	// main method
	public static void main(String[] args) {
		int i = 20;
		System.out.println(" i : "+ i);
		
		char c = 'a'; //문자 한글자 ' '
		System.out.println(" c : "+ c);
		char d1 = 'J'; //74
		char d2 = 'A'; //65
		char d3 = 'V'; //86
		char d4 = 'A'; //65
		System.out.println(""+d1+d2+d3+d4);
		//JAVA 글자를 출력
		
		String str = "Hello Java World";
		System.out.println(str);
		
		char c1 = 'A';
		// char c2 = 'AB';
		String s1 = "A";
		String s2 = "AB";
		
		char ch1 = 'A'; // 문자
		char ch2 = 97; // ASCII 코드
		char ch3 = '\u0061'; // unicode
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		// 문자열 + 숫자 ==> 문자
		// 문자 + 문자 ==> 산술연산자		
		System.out.println(d1+d2); // + : 산술연산자
		System.out.println(""+d1+d2); // + 연결연산자
		// 문자의  ASCII 코드 + ASCII 코드 
	}
}
