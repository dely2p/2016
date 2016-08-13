package d20160509;

public class StatementEx2 {
	public static void main(String[] args) {
/*		for(int i=1;i<9;i++)
			System.out.println("*");
		System.out.println("**");*/
		
		int i = 1;											// 초기식
		while (i<10){										// 조건식(10보다 같거나 크면 while문을 나간다)
			System.out.println(" 3 * "+i+" = "+ 3*i);		// 3단 구구단 출력
			// 탈출조건
			i++;											// 증감식
		}		
	}
}
