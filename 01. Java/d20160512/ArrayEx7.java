package d20160512;

public class ArrayEx7 {
	public static void main(String[] args) {
		//int[][] m = new int [3][4];										// int자료형의 기본값이 들어있음
		
		int[][] m = {
				{1,2,3,4},
				{9,2,3,8},
				{1,9,1,4}
		};		
		
		// 출력
		for(int i=0;i<m.length;i++)										// 3번 반복(행)
			for(int j=0;j<m[i].length;j++)								// 4번 반복(열)
				System.out.println("m["+i+"]"+"["+j+"] : "+m[i][j]);	// 각 배열 값 출력
		
		System.out.println(m.length);									// 행렬 m의 길이(행 수와 동일)
		System.out.println(m[0]);										// 각 행의 참조값                                                   										
		System.out.println(m[0].length); 								// 행렬 m[0]의 길이(열 수와 동일) 

		
		int[][] n = new int[2][3];										// 2차 행렬 생성
		System.out.println(n);											// 스택에 있는 n의 주소값 출력
		System.out.println(n[0]);										// 스택에 있는  n[0]
		System.out.println(n.length);									// n의 길이 출력(행과 동일)
		System.out.println(n[0].length);								// n[0]의 길이 출력(열과 동일)
	
	
	}
}
