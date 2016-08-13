package d20160510;

import java.io.IOException;
// 입력된 문자를 대소전환 시키고자 한다.
public class StatementHw12 {
	public static void main(String[] args) throws IOException{
		
		// 1. 사용자로부터 입력값 받기
		System.out.println("값 입력 : ");			// 값 입력 문자열 출력
		int val = System.in.read();				// 입력받은 값을 val에 초기화
		
		// 2. 대소문자 판별
		if(val>=97 && val<=122){// 소문자			// 입력받은 값이 아스키 97~122사이 값이면(소문자)
			// 3. 변환
			val-=32;							// 아스키 32를 빼서 대문자로 변환한다.
		}else if(val>=65 && val<=90){			// 입력받은 값이 아스키 65~90사이 값이면(대문자)
			val+=32;							// 아스키 32를 더해서 소문자로 변환한다.
		}
		
		// 4. 출력
		System.out.println((char)val);			// val를 문자로 형변환해서 출력한다.
	}
}
