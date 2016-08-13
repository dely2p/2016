package d20160509;
//홀수단만  출력하기 
public class StatementHw8 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++){									// 구구단 단을 i로 두어 2단부터 9단까지 반복한다.
			for(int j=1;j<=9;j++){								// 구구단에서 1부터 9까지 곱할 값을 j로 두어 반복한다.
				if((i%2)!=0)									// 구구단 단이 홀수이면
					System.out.println(i+" * "+j+" = "+i*j);	// 구구단을 출력한다.
			}
			System.out.println();								// 단마다 한 줄씩 띄어서 가독성을 높인다.
		}
	}
}
