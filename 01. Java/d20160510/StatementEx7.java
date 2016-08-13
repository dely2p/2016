package d20160510;

import java.util.Scanner;

public class StatementEx7 {
	// 사용자의 입력값을 받아서 이 값이 홀수인지 짝수인지 판별
	public static void main(String[] args) {
		System.out.println("입력: ");						// 입력 문자열 출력
		
		// 1. 사용자로부터 값을 입력 받는다.
		Scanner sc = new Scanner(System.in); 			// 스캐너 생성
		// System.in ==> 키보드 
		// System.out ==> 모니터
		int value = sc.nextInt(); 						// 사용자로부터 키보드 값을 받아옴
		System.out.println("입력된값: " + value);			// 입력받은 값 출력
		
		// 2. 이 값을 판별
		if(value%2 == 0){								// 입력받은 값이 2로 나누어 떨어지면 짝수이므로
			// 3. 메시지 출력
			System.out.println(value + "는 짝수입니다");		// 짝수라고 출력
		}else{											// 입력받은 값이 2로 나누어 떨어지지 않으면
			System.out.println(value + "는 홀수입니다");		// 홀수라고 출력
		}
		/*if(value%2 == 0){								// if문을 또 쓸 수도 있지만 
			System.out.println(value + "는 짝수입니다");		// if~else문으로 쓰는 것이 더 효율적
		}*/
		
		
	}
}
