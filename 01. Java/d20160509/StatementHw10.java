package d20160509;
// 성적입력받아 학점출력하는 코드 완성해오기 
import java.util.Scanner;
public class StatementHw10 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		// Scanner사용
		System.out.print("성적입력 : ");				// 성적입력 문자열 출력
		int score = sc.nextInt();					// 키보드 입력값을 받아와서 score 초기화
		
		if(score>=90)								// score가 90점 이상이면
			System.out.println("A학점");				// A학점 출력
		else if(score>=80 && score<90)				// score가 80점 이상 90점 미만이면
			System.out.println("B학점");				// B학점 출력
		else if(score>=70 && score<80)				// score가 70점 이상 80점 미만이면
			System.out.println("c학점");				// C학점 출력
		else if(score>=60 && score<70)				// score가 60점 이상 70점 미만이면
			System.out.println("D학점");				// D학점 출력
		else if(score<60)							// score가 60점 미만이면
			System.out.println("F학점");				// F학점 출력
	}
}
