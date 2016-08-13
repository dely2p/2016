package d20160513;

public class MethodEx6 {
	static void printMsg(String str){				// printMsg method
		System.out.println(str+" 자바!!!");			// 매개변수와 문자열을 출력
	}
	static void sayHello(){							// sayHello method
		System.out.println("곤니찌와.");				// 문자열 출력
	}
	static void maxInt(int c, int d){				// maxInt method
		if(c>d) // 조건분기문							// c가 d보다 더 크면
			System.out.println("큰 값은 "+c+"입니다.");	// 결과 출력
		else if(d<c)								// d가 c보다 더 크면
			System.out.println("큰 값은 "+d+"입니다.");	// 결과 출력
		else										// 그 외(두 값이 같으면)
			System.out.println("두 값은 같습니다.");		// 결과 출력
	}
	static int getNumber(int a, int b, int c, int d, int num){
		int arr[] = {a,b,c,d};						// 배열 arr에 받아온 a,b,c,d값으로 초기화한다.
		return arr[num-1];							// arr에 num-1 인덱스의 값을 return한다.
		
		/*switch(num){
		case 1:
			return a;
		case 2:
			return b;
		case 3:
			return c;
		case 4:
			return d;
		}
		return -1;*/
	}
	static int getInt(int[] temp, int position){	// getInt method 생성		
		temp[position-1] = -100;
		return temp[position-1];					// return temp[position-1 출력]
	}
	public static void main(String[] args) {
		printMsg("Hello");							// printMsg method "call by value"방식으로 호출
		sayHello();									// "call by name" 방식
		int a = 200;
		int b = 100;
		maxInt(a,b); // 큰 값은 ? 입니다.
		
		int[] m = {200,3000,1000,240};				// m 배열 초기화
		// 0,1,2
		// 3번째 값을 뽑기
		int k = getNumber(200,3000,1000,240,3);		// getNumber함수 호출
		System.out.println(k);						// k 값 출력

		
		int[] r = new int[3];						// 배열 r의 생성
		r = m;
		System.out.println(m);						// m 출력
		System.out.println(r);						// r 출력
		System.out.println(m[0]);					// m 첫번째 열 출력
		System.out.println(r[0]);					// r 첫번째 열 출력
		
		System.out.println("배열의 3번째 값은 : " +getInt(m,3));	// 3번째값 출력
		
		getInt(m,3);								// 매개변수로 배열을 전달할 수 있음
		System.out.println(m[2]);					// 배열m의 3번째 값 출력
	}
}
