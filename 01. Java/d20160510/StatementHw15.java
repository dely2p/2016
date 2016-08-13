package d20160510;

// 1부터 100까지 수중 2의 배수와 3의 배수가 아닌 값을 출력
public class StatementHw15 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){				// 1부터 100까지 반복문 실행
			if(i%2!=0 && i%3!=0)				// 2의 배수가 아니고 3의 배수가 아닌 수라면
				System.out.print(i+" ");		// 그 값을 출력
		}
	}
}
