package d20160509;
// 1부터 100까지의 누적합 구하기
public class StatementHw5 {
	public static void main(String[] args) {
		int sum = 0;											// 누적값을 담을 변수 선언
		for(int i=1;i<=100;i++){								// 1부터 100까지 for문을 돌림
			sum += i;											// i값을 for문을 돌리며 계속 더해서 sum에 대입함
		}
		// int sum = (1+1000)*500;
		System.out.println("1부터 100까지의 누적합은 "+sum+"입니다.");		// sum의 값을 출력
	}
}
