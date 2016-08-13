package d20160510;
// break : 가장 가까운 반복문을 탈출
// continue : 이번만 생략

// break 라벨명 : 라벨명이 붙은 반복문을 탈출
// continue 라벨명 : 라벨명이 붙은 반복문을 이번만 생략

public class StatementEx13 {
	public static void main(String[] args) {	
		outer: // 라벨
		for(int j=1;j<=3;j++){											// 여기서부터~~
			for(int i=1;i<=4;i++){										// 4번 반복 실행 (for문) -> 지역변수 i는 for문을 벗어나면 사라짐
				if(i==j) break outer;									// break는 아예 실행 안하고 탈출, continue는 이번만 실행 안함(라벨은 이중for문 밖으로 탈출이나 한번실행 안하기 가능)
				System.out.println("j : " + j + "," + " i : "+ i);		// i,j값을 출력함	
			}
		}																// ~~~여기까지 3번 반복
		
		System.out.println("------------------");
		
		for(int j=1;j<=4;j++){											// 4x4 별찍기
			for(int i=1;i<=4;i++){										// 행,열 4로 반복문 사용
				System.out.print("*");									// 별 출력
				if(i>=j) break;											// i(열)가 j(행)보다 크면 break
			}
			System.out.println();										// 한 줄 띄기
		}
	}
}
