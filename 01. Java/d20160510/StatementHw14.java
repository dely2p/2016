package d20160510;

import java.util.Scanner;
/*화폐교환기 

입력 : 67429 

5만원 : 1 장 
1만원 : 1 장
5천원 : 1 장
천원  : 2 장
오백원 : 0  개
백원   : 4 개 
오십원 : 0 개 
십원 :  2개 
1원  : 9 개*/
public class StatementHw14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();						// 화폐 입력받음
		
		int fiman = money/50000;						// 입력받은 돈에서 만원대를 구하고 5만원 이상의 수를 구한다.
		int manwon = money/10000%5;						// 입력받은 돈에서 만원대를 구하고 5만원 이하의 수를 구한다.
		int fichon = money%10000/5000;					// 입력받은 돈에서 천원대를 구하고 5천원 이상의 수를 구한다.
		int chonwon = money%10000/1000%5;				// 입력받은 돈에서 천원대를 구하고 5천원 이하의 수를 구한다.
		int fibak = money%10000%1000/500;				// 입력받은 돈에서 백원대를 구하고 5백원 이상의 수를 구한다.
		int bakwon = money%10000%1000/100%5;			// 입력받은 돈에서 백원대를 구하고 5백원 이하의 수를 구한다.
		int fisip = money%10000%1000%100/50;			// 입력받은 돈에서 십원대를 구하고 5십원 이상의 수를 구한다.
		int sipwon = money%10000%1000%100/10%5;			// 입력받은 돈에서 십원대를 구하고 5십원 이하의 수를 구한다.
		int ilwon = money%10;							// 입력받은 돈에서 일의자리인 나머지 수를 구한다.
		
		System.out.println("5만원 : "+ fiman + '\n'		// 5만원 출력
						+  "1만원 : "+ manwon + '\n'		// 만원 출력
						+  "5천원 : "+ fichon + '\n'		// 5천원 출력
						+  "천원 : "+ chonwon + '\n'		// 천원 출력
						+  "오백원 : "+ fibak + '\n'		// 5백원 출력
						+  "백원 : "+ bakwon + '\n'		// 백원 출력
						+  "오십원 : "+ fisip + '\n'		// 5십원 출력
						+  "십원 : "+ sipwon + '\n'		// 십원 출력
						+  "1원 : "+ ilwon + '\n'			// 1원 출력
						);
		
	}
}
