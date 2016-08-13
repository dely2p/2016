package d20160511;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 배열 : 동일한 크기를 갖는 연속된 공간에 할당된 변수
		//	1. 접근속도의 향상
		//	2. 인덱스를 이용한 반복문의 사용 가능
		
		int[] a;										// 배열 a 선언
		a = new int[5];									// a배열 생성
		// 배열 선언이 변수에는 자료형의 기본값이 들어있음
		// 기본값은 : 0 
		// int 기본값 : 0
		// float 기본값 : 0.0f
		// boolean : true => 1 false ==> 0 
		// 			false
		
		System.out.println("a : "+a);							// a가 있는 주소값
		System.out.println("a[0] : "+a[0]);   					// a배열의 주소를 보고 찾아간 0번째 변수- 기본값으로 0이 들어있음
		
		System.out.println(a.length); 					// 배열의 갯수(길이)를 나타냄		
		
/*		
		for(int i=0;i<5;i++){							// for문을 이용해 5번 반복
			System.out.println("a["+i+"] : "+ a[i]);	// a배열 출력
		}
		*/
	}
}
