package d20160510;

import java.util.Scanner;
//국어, 영어 , 수학 점수를 입력 받아 총점과 평균을 출력하세요
public class Day20150510hw2 {
	public static void main(String[] args) {
		
		System.out.println("국어, 영어, 수학 순으로 점수 입력 : ");			// 국어, 영어, 수학 순으로 점수 입력 문자열 출력
		Scanner sc = new Scanner(System.in);					// 스캐너 생성
		int kor = sc.nextInt();									// 국어 점수 입력받음
		int eng = sc.nextInt();									// 영어 점수 입력받음
		int mat = sc.nextInt();									// 수학 점수 입력받음
		
		int sum = kor + eng + mat;								// 국어, 영어, 수학 합계를 sum에 대입
		int avg = sum / 3;										// 총점을 과목 수로 나누어 평균값을 avg에 대입
		
		System.out.println("총점 : "+sum+" , "+"평균 : "+avg);		// 총점과 평균을 출력
	}
}
