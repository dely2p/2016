package d20160509;

import java.util.Scanner;

public class StatementEx6 {
	public static void main(String[] args) {
		// 1. 사용자로부터 성적을 입력받는다.
		Scanner sc = new Scanner(System.in);		// Scanner 사용
		System.out.print("성적입력 : ");				// 성적입력 문자열 출력
		int val = sc.nextInt();						// 키보드 입력받기
		// 2. 입력된 값 출력
		System.out.println(" 입력값 : "+val);			// 입력받은 값 출력
		// 3. 입력된 성적이 90점 이상이면 A학점 문자를 출력한다.
		if(val>=90)									// 조건분기문-입력받은 값이 90점 이상이면
			System.out.println("A학점");				// A학점 문자열 출력
	}
}
