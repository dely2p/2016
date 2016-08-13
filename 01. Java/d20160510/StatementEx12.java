package d20160510;

public class StatementEx12 {
	public static void main(String[] args) {	
		 
		for(int j=1;j<=3;j++){									// 여기서부터~~
			for(int i=1;i<=4;i++){								// 4번 반복 실행 (for문) -> 지역변수 i는 for문을 벗어나면 사라짐
				System.out.println("i : " + i + " j : "+ j);	// i,j값을 출력함
			}
		}														// ~~~여기까지 3번 반복
	}
}
