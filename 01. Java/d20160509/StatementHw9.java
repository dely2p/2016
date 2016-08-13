package d20160509;
// 3단 옆으로 출력하기
public class StatementHw9 {
	public static void main(String[] args) {
		int val = 3;											// 3단이므로 val을 3으로 초기화
		for(int i=1;i<=9;i++){									// 9번 반복 실행시킴
			System.out.print(val+" * "+i+" = "+val*i+'\t');		// 반복문을 이용해 구구단 3단을 출력함
		}
	}
}
