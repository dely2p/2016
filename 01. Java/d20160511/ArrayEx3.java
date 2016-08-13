package d20160511;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] c;										// 배열 c 선언
		c = new int[6];									// 길이가 6인 배열 생성
		// int a;
		// a = 10;
		// int a = 10;
		
		for(int i=0;i<c.length;i++){					// 배열의 길이만큼 반복
			c[i] = 11*(i+1);							// 각 배열에 11*(i+1)값을 대입
			System.out.println("c["+i+"] : "+ c[i]);	// 각 배열 값을 출력
		}		
		
		System.out.println("------------------------------");
		
/*		int[] m = new int[10];
		m[0] = 20;
		m[1] = 10;
		m[2] = 90;
		m[3] = 110;*/
		
		// 규칙성이 없는 배열 초기화 방법
		int[] m = {20,10,90,110};						// m 배열 생성과 함께 초기화
					
		for(int i=0;i<m.length;i++){					// m 배열 길이만큼 반복
			System.out.println("m["+i+"] : "+m[i]);		// m 배열 값 출력
		}
	}
}
