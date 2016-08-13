package d20160510;

import java.util.Scanner;

public class StatementEx9 {
	public static void main(String[] args) {
		// 학생의 총점과 평균을 출력
		int kor = 55;													// kor 변수에 55로 초기화
		int eng = 90;													// eng 변수에 90으로 초기화
		int mat = 70;													// mat 변수에 70으로 초기화
		
		// 총점과 평균을 출력
		int sum = kor + eng + mat;										// kor, eng, mat을 모두 더해서 sum에 초기화
		float avg = sum / 3;											// 소수점도 출력하기 위해 sum을 과목 수로 나눈 값을 float형 avg에 초기화 
		System.out.println("총점 :" + sum + '\n' + "평균 :" + avg);			// 총점과 평균 출력
		
		// 이때 평균이 60이상이면 합격 아니면 불합격 메세지 출력
		if(avg>=60)														// 평균이 60이상이면
			System.out.println("합격");									// 합격 출력
		else															// 평균이 60이상이 아니면
			System.out.println("불합격");									// 불합격 출력
	}
}
