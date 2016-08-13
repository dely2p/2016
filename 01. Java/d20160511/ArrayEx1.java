package d20160511;

public class ArrayEx1 {
	public static void main(String[] args) {
		// 배열 : apt 변수
		// 동일한 사이즈에 연속된 공간에 할당되는 변수
		// int a; 변수 선언
		int[] a;											// 배열 생성
		// int a[]; 배열의 다른 표현
		
		a = new int[3]; // a에는 int크기의 배열 3개를 세트로 만든다는 의미
		
		a[0] = 10;											// a의 0번째 배열에 10을 대입
		a[1] = 20;											// a의 1번째 배열에 20을 대입
		a[2] = 30;											// a의 2번째 배열에 30을 대입
		
		System.out.println("a[0] : "+a[0]);					// a[0]의 값 출력
		System.out.println("a[1] : "+a[1]);					// a[1]의 값 출력
		System.out.println("a[2] : "+a[2]);					// a[2]의 값 출력
		System.out.println();								// 한 칸 띄기
		// --------------------------------------------------------
		
		// int 크기10개의 배열 변수 b를 선언하고
		// 각각의 변수에 10,20,30,40,50,60,70,80,90,100을 대입
		int[] b;											// 배열 b선언
		b = new int[10];									// 배열 생성
/*		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		b[5] = 60;
		b[6] = 70;
		b[7] = 80;
		b[8] = 90;
		b[9] = 100;		*/
		// 출력하세요
/*		System.out.println("b[0] : "+b[0]);
		System.out.println("b[1] : "+b[1]);
		System.out.println("b[2] : "+b[2]);
		System.out.println("b[3] : "+b[3]);
		System.out.println("b[4] : "+b[4]);
		System.out.println("b[5] : "+b[5]);
		System.out.println("b[6] : "+b[6]);
		System.out.println("b[7] : "+b[7]);
		System.out.println("b[8] : "+b[8]);
		System.out.println("b[9] : "+b[9]);*/

		// b[숫자 ] : 숫자 ==> 첨자, 인덱스
		for(int i=0;i<=9;i++){								// 반복문을 10번 돌려서
			b[i] = 10*(i+1);								// 배열 b에 값을 넣기-10씩 증가하는 값 넣기
			System.out.println("b["+i+"] : "+b[i]);			// 배열 값 출력
		}	
		
		//System.out.println(b[10]);						// runtime성 에러-배열의 인덱스가 범위를 벗어남
	}
}
