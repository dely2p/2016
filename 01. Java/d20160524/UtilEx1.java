package d20160524;

import java.util.Random;

public class UtilEx1 {
	public static void main(String[] args) {
		Random rnd = new Random();				// 랜덤 클래스 생성
		for(int i=0;i<100;i++){				
			int k = rnd.nextInt(45);			// 값 뽑아서 k에 넣기
			System.out.println("k : "+k);		// 출력
		}
	}
}
