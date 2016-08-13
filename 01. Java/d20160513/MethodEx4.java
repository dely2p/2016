package d20160513;

public class MethodEx4 {
	
	static int mul(int a, int b){				// mul method
		return a*b;								// a*b값을 return 
	}
	public static void main(String[] args) {
		int a = 100;							// a에 100을 초기화
		int b = 200;							// b에 200을 초기화
		int c = mul(a,b);						// c에 mul method 실행후 초기화
		System.out.println(" c : "+c);			// c값 출력
	}
}
