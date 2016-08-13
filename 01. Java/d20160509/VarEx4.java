package d20160509;
// 4순위 연산자 : 비교 연산자
// >, <, >=, <=, ==, !=(= ><) 

public class VarEx4 {
	public static void main(String [] args){
		int a = 100;									// a에 100으로 초기화
		int b = 20;										// b에 20을 초기화
		System.out.println("a > b : " + a + b);			// 문자열 연결연산자로 10020 출력
		System.out.println("a > b : " + (a>b));			// a가 더 크므로 ture
		System.out.println("a < b : " + (a<b));			// b가 더 작으므로 false
		System.out.println("a <= b : " + (a<=b));		// b가 더 작으므로 false
		System.out.println("a >= b : " + (a>=b));		// a가 더 크므로 ture
		System.out.println("a == b : " + (a==b));		// a와 b가 같지 않으므로 false
		System.out.println("a != b : " + (a!=b));		// a와 b가 같지 않으므로 true
	}
}
