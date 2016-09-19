

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {
	public static void main(String[] args) {
		String searchData = "HONGILDong20 20 남원_한양 hong@gmail.com 02-1234-5678 "
				+ "KO2 20 서울 dagda@hanafos.com 010-22-3333"
				+ "이순신 20 부산 lee@gmail.com 080 333 4444";
		//String searchData = "ABC Hello Halo Hipo $5,000.50 한글 ";
		
		//Pattern patern = Pattern.compile("검색패턴");
		//Pattern patern = Pattern.compile("Ko"); 
		//Pattern patern = Pattern.compile("\\d"); //문자열에서 숫자만 찾아서 출력
		//Pattern patern = Pattern.compile("\\w"); //_포함한 문자열을 의미함(한글제외)
		//Pattern patern = Pattern.compile("\\d+"); //여러자리 숫자만 찾아오기
		//Pattern patern = Pattern.compile("\\d{3}"); //3자리 숫자만 찾아오기
		//Pattern patern = Pattern.compile("^[A-Z]+[a-z]+[0-9]+"); 
		//Pattern patern = Pattern.compile("H..o"); 
		//Pattern patern = Pattern.compile("\\$[0-9]+[0-9,.]+"); 
		//Pattern patern = Pattern.compile("[가-힣]+"); 
		Pattern patern = Pattern.compile("[a-zA-Z0-9_\\-.]+@[a-zA-Z0-9_\\-]+\\.[a-zA-Z]{2,}"); 
		// * : 0번 이상 반복(0,1,n)
		// + : 1번 이상 반복(1,n)
		// ? : 0 or 1
		// {} :횟수를 표시
		
		// 패턴에 적용 가능한 메타 문자
		// ^ : 시작 문자
		// $ : 종료문자
		// [] : 문자열셋 - 소문자 a부터 z사이의 문자라는 의미
		// [^] : 지정한 패턴을 제외한 문자
		// \d : 숫자, [0-9]와 같은 의미
		// \D : 숫자가 아닌 값 [^0-9]와 같은 의미
		// . : 뉴라인(\n)제외한 한문자
		// - : 범위 지정 메타 문자 - [a-z]
		
		// 패턴에 적용 가능한 메타 문자
		// \w : 영문자, _, 숫자 포함되어 있는 영문
		// \W : 영문자, _, 숫자가 아닌 문자
		// \s : 공백
		// \S : 공백을 제외한 문자
		
		// \\p{Alpha} : 대소문자 알파벳
		// \\p{Digit} : 숫자
		// \\p{Alnum} : 대소문자 알파벳, 숫자
		
		//Matcher matchar = patern.matcher("검색할 문자열");
		Matcher matchar = patern.matcher(searchData);
		
		while(matchar.find()){
			System.out.println(matchar.group());
		}
	}
}
