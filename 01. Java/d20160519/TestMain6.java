package d20160519;

import java.util.Arrays;
// 로또 번호 생성기 
public class TestMain6 {
	public static void main(String[] args) {
		int[] m = {1,2,3,4,5,6,7,8,9,10,			// 배열 m초기화
				11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,
				31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45};
		int[] n = new int[6];						// 배열 n초기화
		
		// 랜덤하게 0부터 9사이의 정수를 구하기?
		// 0.0*10<Math.random()*10<1.0*10 double
		
		/*for(int i=0;i<100;i++)
			System.out.print((int)(Math.random()*45)+" ");		
		System.out.println();*/
		
		// 0부터 44까지의 정수를 랜덤하게 2개 뽑기		
		for(int i=0;i<300;i++){
			int a = (int)(Math.random()*45);
			int b = (int)(Math.random()*45);
	
			int tmp = m[a];					// swap
			m[a] = m[b];
			m[b] = tmp;		
		}
		
		for(int i=0;i<6;i++){				// 6개 뽑아서
			n[i] = m[i];
		}
		Arrays.sort(n);						// 정렬하기 
		
		for(int i=0;i<6;i++)
			System.out.print(m[i]+"\t");	// 출력
		

	}
}
