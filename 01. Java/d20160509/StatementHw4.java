package d20160509;

public class StatementHw4 {
	public static void main(String[] args) { // 1,3,6,10,15
		int sum = 0;
		for(int i=1;i<=5;i++){				// 1부터 5까지 반복문 돌림
			sum += i;						// val에 반복문을 이용해서 i값까지 더해줌
			System.out.println(sum);		// 더한 val값을 출력
		}
	}
}
