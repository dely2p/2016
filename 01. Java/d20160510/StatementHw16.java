package d20160510;

// 1부터 100까지 수중 2의 배수와 3의 배수가 아닌 값을 모아서 누적한 값을 출력
public class StatementHw16 {
	public static void main(String[] args) {
		int sum = 0;							// sum을 0으로 초기화
		for(int i=1;i<=100;i++){				// 1부터 100까지 반복문 실행
			if(i%2!=0 && i%3!=0){				// 2의 배수가 아니고, 3의 배수가 아닌 값이면
				sum += i;						// 모두 더한다.
			}
		}
		System.out.println("누적한 값 : "+sum);		// 모두 더한 값을 출력
	}
}
