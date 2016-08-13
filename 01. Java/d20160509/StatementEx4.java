package d20160509;

import java.io.IOException;

public class StatementEx4 {
	public static void main(String[] args) throws IOException {
		//외부로부터 값을 입력받기
		System.out.println("입력받기 : ");							// 입력받기 출력
		// 사용자로부터 1글자를 입력받아 ASCII코드로 리턴
		int value = System.in.read();							// 키보드 입력을 받아서 value에 초기화
		value -= 48;											// 입력받은 값에서 아스키코드 0(48)을 빼줌
		System.out.println("value : "+value);					// 값 출력
		
		// 입력 받은 단 출력하기
		for(int i=1;i<=9;i++){									// 9번 반복
			System.out.println(value+" * "+i+" = "+value*i);	// 키보드입력받은 값과 i를 곱해서 단 출력
		}
	}
}
