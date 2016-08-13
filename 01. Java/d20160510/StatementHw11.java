package d20160510;

import java.util.Scanner;
public class StatementHw11 {
	public static void main(String[] args){
		
		System.out.println("값 입력 : ");							// 값 입력 문자열 출력
		Scanner sc = new Scanner(System.in);					// 스캐너 생성
		int val = sc.nextInt();									// 사용자로부터 값을 입력받아서 val에 초기화
		
		if(val%3==0){											// val을 3으로 나눈 값이 0이면(3의 배수이면)
			System.out.println(val + "은 3의 배수입니다.");			// 3의 배수라고 출력
		}else{													// val을 3으로 나눈 값이 0이 아니면(3의 배수가 아니면)
			System.out.println(val + "은 3의 배수가 아닙니다.");			// 3의 배수가 아니라고 출력
		}
	}
}
