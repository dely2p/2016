package d20160510;

import java.io.IOException;
public class StatementEx8 {
	public static void main(String[] args) throws IOException{
		// 입력된 값이 대문자 소문자 숫자인지 판별
		
		// 1. 사용자로부터 값을 입력
		System.out.print("갑 입력 : ");						// 값 입력 문자열 출력
		int data = System.in.read();						// 입력값 한글자 입력받음
		
		// 2. 이 값에서 ASCII코드값을 알아낸다.
		System.out.println("ASCII코드값 : "+ data);			// 입력받은 값의 아스키코드 출력
		
		// 3. 대문자 A 코드 : 65, 소문자 : 97, 숫자 0 : 48
		//	이 값을 참조로 대소문자 숫자 판별가능
		if(data>=48 && data<=57){							// 입력받은 값이 48~57 사이 값이면
			// 4. 메세지 출력
			System.out.println("숫자입니다.");					// 숫자라고 출력
		}else if(data>=65 && data<=90)						// 입력받은 값이 65~90 사이 값이면
			System.out.println("대문자입니다.");					// 대문자라고 출력
		else if(data>=97 && data<=122)						// 입력받은 값이 97~122 사이 값이면
			System.out.println("소문자입니다.");					// 소문자라고 출력
	}
}
