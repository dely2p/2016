package d20160523;

public class StringBufferEx {
	public static void main(String[] args) {
		String str = "Hello java World";
		// 거꾸로 출력하기
		char[] s = str.toCharArray();			// 문자열을 문자로 바꿔서 배열에 저장
		StringBuffer sb1 = new StringBuffer(str);	
		System.out.println(sb1.reverse());		// StringBuffer를 이용한 동일한 결과
		for(int i=s.length-1;i>=0;i--){			// 꺼꾸로 출력
			System.out.print(s[i]);
		}
		System.out.println();					
		
		StringBuffer sb = new StringBuffer();	// StringBuffer 생성
		
		sb.append("SELECT empno, ename, sal ");	// 값들을 이어서 저장할 수 있음
		sb.append("FROM emp ");
		sb.append("Where empno = 7788;");
		
		System.out.println(sb);					// 출력
		System.out.println(sb.reverse());		// 거꾸로 출력
	}
	
}
