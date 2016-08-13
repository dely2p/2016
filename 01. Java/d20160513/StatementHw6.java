package d20160513;
/*score 배열에 국어 영어 수학 점수가
들어있다. 총점과 평균을 계산해서 배열에 담은후  모든 학생의 국어 , 영어, 수학, 총점, 평균를 출력하시오
참고 ) 배열에는 국어 , 영어 ,수학 점수 만 들어있다. 
	int[][] score = {
		{80,80,80,0,0},
		{60,80,45,0,0},
		{80,50,90,0,0},
		{80,72,90,0,0},
		{60,87,100,0,0},
		{42,55,99,0,0},
	};*/
public class StatementHw6 {
	public static void main(String[] args) {
		int[][] score = {								// score 2차배열 선언
				{80,80,80,0,0},
				{60,80,45,0,0},
				{80,50,90,0,0},
				{80,72,90,0,0},
				{60,87,100,0,0},
				{42,55,99,0,0},
		};
		
		for(int i=0;i<score.length;i++){				// for문으로 score 행만큼 반복
			for(int j=0;j<3;j++){						// score 열만큼 반복
				score[i][3] += score[i][j];				// 각 과목을 더해서 총점을 구함
				score[i][4] = score[i][3]/3;			// 각 총점을 과목수로 나눠서 평균을 구함
			}
		}
		
		for(int i=0;i<score.length;i++){				// score행만큼 반복
			
				System.out.println("국어 : "+score[i][0]+'\t'+'\t'+"영어 : "+score[i][1]+'\t'+'\t'+"수학 : "+score[i][2]
						+'\t'+'\t'+"총점 : "+score[i][3]+'\t'+'\t'+"평균 : "+score[i][4]);			// 각과목과 총점, 평균 출력
			
		}
	}
}
