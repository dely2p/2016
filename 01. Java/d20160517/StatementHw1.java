package d20160517;

public class StatementHw1 {
	static int[][] add(int[][] a, int[][]b){		// add method
		int[][] c = new int[3][3];					// 더한 값을 넣을 3x3 배열 생성
		for(int i=0;i<3;i++){						// 3행
			for(int j=0;j<3;j++){					// 3열 반복 실행하면서
				c[i][j] = a[i][j] + b[i][j];		// a와 b의 값을 더한 값을 c에 대입한다.
			}
		}
		return c;									// 배열을 return 한다.
	}
	public static void main(String[] args) {
		int[][] rslt = new int[3][3];				// 결과값을 넣을 배열 생성
		int[][] a = {{3,2,3},{4,5,6},{1,4,9}};		// a배열 생성 및 초기화
		int[][] b = {{1,8,7},{6,4,4},{3,2,3}};		// b배열 생성 및 초기화
		
		rslt =add(a,b);								// add method를 실행하고 return 값을 rslt 배열에 대입한다.
		
		for(int i=0;i<3;i++){						// 3행
			for(int j=0;j<3;j++){					// 3열을 돌면서
				System.out.print(rslt[i][j]+" ");	// 배열 결과값을 출력
			}
			System.out.println();					// 한줄 띄기 
		}
	}
}

