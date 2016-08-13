package d20160510;

import java.util.Scanner;

public class StatementEx10 {
// 사용자로부터 성적을 입력받아서 성적을 평가
	public static void main(String[] args) {
		System.out.println("성적입력 : ");					// 성적입력 문자열 출력
		Scanner sc  = new Scanner(System.in);			// 스캐너 출력
		// 문자열 String str = sc.nextLine();
		// System.out.println(str);
		
		int score = sc.nextInt();						// 입력받은 값을 score에 초기화
		if(score>=90){									// socre가 90보다 크면
			System.out.println("A학점");					// A학점 출력
		}else if(score>=80){							// 아니면 socre가 80보다 크면
			System.out.println("B학점");					// B학점 출력
		}else if(score>=70){							// 아니면 socre가 70보다 크면
			System.out.println("C학점");					// C학점 출력
		}else if(score>=60){							// 아니면 socre가 60보다 크면
			System.out.println("D학점");					// D학점 출력
		}else{											// 아니면 socre가 60보다 작으면
			System.out.println("F학점");					// F학점 출력
		}
	}
}
