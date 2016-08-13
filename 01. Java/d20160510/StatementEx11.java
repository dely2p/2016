package d20160510;

import java.util.Scanner;

public class StatementEx11 {
	public static void main(String[] args) {
		System.out.println("당신의 성적을 입력하세요");
		Scanner sc = new Scanner(System.in);			// 스캐너 생성
		int score = sc.nextInt();						// 입력받은 값 score에 초기화
		
		System.out.println("score : "+ score);			// 입력받은 값 score 출력
		switch(score/10){								// 입력받은 값을 switch문 돌림 -> score/10의 값으로 case 판별
			case 10:									// score가 10이면
				System.out.println("A학점");				// A학점 출력
				break;									// 출력 후 case문 빠져나옴
			case 9:										// score가 9이면
				System.out.println("B학점");				// B학점 출력
				break;									// 출력 후 case문 빠져나옴
			case 8:										// score가 8이면
				System.out.println("C학점");				// C학점 출력
				break;									// 출력 후 case문 빠져나옴
			case 7:										// score가 7이면
				System.out.println("D학점");				// D학점 출력
				break;									// 출력 후 case문 빠져나옴
			default:									// 그 외라면
				System.out.println("F학점");				// F학점 출력									
				
		}
	}
}
