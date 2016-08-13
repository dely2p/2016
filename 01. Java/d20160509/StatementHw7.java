package d20160509;

import java.io.IOException;
// 입력받은 구구단만 출력하기 
public class StatementHw7 {
	public static void main(String[] args) throws IOException{
		System.out.print("몇 단? ");							// 몇 단? 문자열 출력
		int val = System.in.read();							// 한글자 문자를 입력받음
		val-=48;											// 입력받은 값을 아스키코드 값 48(숫자 0)으로 뺀다.
		for(int i=1;i<=9;i++)								// 1부터 9까지 반복한다.
			System.out.println(val+" * "+i+" = "+val*i);	// 입력받은 단을 반복문을 사용하여 출력한다.
	}
}
