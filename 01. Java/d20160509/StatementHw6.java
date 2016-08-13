package d20160509;

import java.io.IOException;

public class StatementHw6 {
	public static void main(String[] args) throws IOException{	
		// 방법1
/*		System.out.print("입력: ");					// 입력 출력
		int code = System.in.read();				// 사용자로부터 한글자 받아오기
		char c2 = (char)code;						// code를 char로 형변환 해서 c2에 초기화
		System.out.println(c2);						// c2를 출력
*/	
		// 방법2
		System.out.print("입력: ");					// 입력 출력
		int code = System.in.read();				// 사용자로부터 한글자 받아오기
		System.out.println((char)code);				// char로 형변환해서 출력
	}
}
