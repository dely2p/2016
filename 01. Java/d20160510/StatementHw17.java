package d20160510;

// 주사위 2개를 던져 합이 4가 되는 모든 경우에 수를 출력하세요.
public class StatementHw17 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=6;i++){								// 주사위의 눈의 수인 6만큼 반복
			for(int j=1;j<=6;j++){							// 두개의 수를 비교해야하니 주사위의 눈의 수인 6만큼 반복
				sum = i+j;									// i와 j를 더하여 sum에 대입한다.
				if(sum==4){									// 만약 더한 값이 4라면
					System.out.println("("+i+","+j+")");	// 해당 주사위 눈 i와 j를 출력한다.
				}
			}
		}
	}
}
