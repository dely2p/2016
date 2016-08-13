package d20160513;
/*int[]  m = { 2, 3  , 9 };

int[]  n = { 9, 11, 3 };

int[]  k = new int[3];

k 배열에  m+n의 결과를 담고 출력하세요 */
public class StatementHw2 {
	public static void main(String[] args) {
		int[]  m = { 2, 3, 9 };				// 배열 m 초기화
		int[]  n = { 9, 11, 3 };			// 배열 n 초기화
		int[]  k = new int[3];				// 배열 k 초기화
		
		for(int i=0;i<3;i++){				// 열의 수만큼(3) 반복
			k[i]=m[i]+n[i];					// 배열 m의 해당 열과 배열 n의 해당 열을 더해서 배열 k에 대입한다.
		}
		for(int i=0;i<k.length;i++){		// 행의 수만큼 반복
			System.out.print(k[i]+" ");		// 배열 k값 출력
		}
	}
}
