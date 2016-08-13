package d20160510;

public class StatementHwStar {
	public static void main(String[] args) {
		// 1,2,3,4,5 삼각형 별찍기
/*		for(int i=1;i<=5;i++){						// 5번 반복 실행
			for(int j=1;j<=i;j++){					// i번 반복 실행 (여기서 i는 행의 인덱스와 같음) 
				System.out.print("*");				// 별찍기 출력
			}
			System.out.println();					// 행마다 해당 수만큼 별을 찍고 엔터 해준다.
		}
*/
		// 5,4,3,2,1 역삼각형 별찍기
		for(int i=0;i<5;i++){						// 5번 반복 실행
			for(int j=1;j<=5-i;j++){				// 5-i번씩 반복 실행
				System.out.print("*");				// 별찍기 출력
			}
			System.out.println();					// 한 줄 띄기
		}
		// 역삼각형 별찍기 또다른 방법
/*		for(int i=9;i>=1;i--){						// 5번 반복 실행
			for(int j=1;j<=i;j++){					// i번 반복 실행 (여기서 i는 행의 인덱스와 같음) 
				System.out.print("*");				// 별찍기 출력
			}
			System.out.println();					// 행마다 해당 수만큼 별을 찍고 엔터 해준다.
		}
*/
	}
}
