package d20160509;

import java.util.Scanner;

public class StatementEx5 {
	public static void main(String[] args) {
		System.out.println("갑 입력 : ");				// 값입력 출력
		// 값을 입력 받는 스캐너 만들기
		Scanner sc = new Scanner(System.in);		// Scanner 사용
		// 스캐너로부터 숫자 입력받기
		int value = sc.nextInt();					// 키보드에서 받아온 값을 value에 초기화
		// 입력 받은 값 출력
		System.out.println(value);					// value값을 출력
		
		if(value>100){								// 조건 분기문
			System.out.println("입력값이 100보다 크다");	// 입력값이 100보다 클 때 출력
		}else{
			System.out.println("입력값이 100보다 작다");	// 입력값이 100보다 작을 때 츨력
		
		}
	}
}
