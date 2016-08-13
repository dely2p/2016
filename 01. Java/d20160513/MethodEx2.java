package d20160513;

public class MethodEx2 {
	// 매개변수, 파라미터, 인자, 인수, argument
	static void printGuGuDan(int dan){
		//int dan = 5;											// 구구단 몇단?
		System.out.println("전달받은 값 : "+ dan);
		for(int i=1;i<=9;i++)									// 구구단 출력 위해 9번반복
			 System.out.println(dan+" * "+i+" = "+dan*i);		// 3단 출력		
	}
	static void gauss(int val){									// gauss method 
		int sum = 0;											// sum 변수 0으로 초기화
		for(int i=1;i<=val;i++){								// main에서 받아온 값만큼 반복
			sum += i;											// sum에 더함
		}
		System.out.println("1부터 "+val+"까지의 합은 "+sum+"입니다.");	// 값 출력
	}

	public static void main(String[] args) {
		// 구구단 3단 출력
		printGuGuDan(3);										// 구구단  method에 값을 가지고 실행
		printGuGuDan(5);
		
		gauss(100);												// gauss method 실행
		
		gauss(1000);
	}
}
