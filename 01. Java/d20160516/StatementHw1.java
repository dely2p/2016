package d20160516;

public class StatementHw1 {
	public static void main(String[] args) {
		int[] m = {200,100,300,200,400};		// 배열 m을 초기화
		int sum = 0;							// 더한 값을 저장해둘 sum을 0으로 초기화
		for(int i : m ){						// 향상된 for문을 이용해서
			sum += i;							// 배열 m의 값들을 모두 더함
		}
		System.out.println("sum : "+sum);		// 더한 값 출력
	}
}
