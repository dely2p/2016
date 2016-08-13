package d20160510;
/*숙제1. 구구단 옆으로 출력하기 (이중for문 사용) 

2* 1 = 2   2 * 2 = 4    2 * 3 = 6        2 * 9  = 18
3 * 1 = 3   3 * 2 = 6   3 * 3 = 9 ...   3 * 9 = 27 

...

9 * 1 = 9   9 * 2 = 18   9 * 3 = 27     9 * 9 = 81 */
public class Day20150510hw1 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++){									// 구구단 2단부터 9단까지 반복 실행
			for(int j=1;j<=9;j++){								// 구구단 1부터 9까지 실행
				System.out.print(i+" * "+j+" = "+i*j+'\t');		// 구구단 출력, 탭으로 간격 띄움
			}
			System.out.println();								// 구구단 한 단이 끝나면 엔터
		}
	}
}
