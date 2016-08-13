package d20160513;
//1. 구구단 3단을  2차원 배열에 담고 출력 하세요   9행 3열짜리 배열 
public class StatementHw1 {
	public static void main(String[] args) {
		int[][] trd = new int[9][3];
		
		for(int i=0;i<trd.length;i++){			
				trd[i][0] = 3;							// trd배열 첫번째 열에 3을 대입
				trd[i][1] = i+1;						// trd배열 두번째 열에 각행+1 수를 대입
				trd[i][2] = (i+1)*3;					// trd배열 세번째 열에 앞의 두 수의 곱을 대입
		}
		
		for(int i=0;i<trd.length;i++){					// trd배열의 행만큼 반복
			System.out.println(trd[i][0] + " * " + trd[i][1] + " = " + trd[i][2]);
														// 구구단 출력
		}
	}
}
