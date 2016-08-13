package d20160523;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "java oracle";
		
		char ch = str.charAt(3);				// 해당 위치의 문자 뽑아냄
		System.out.println("ch : "+ch);
		
		String str2 = "월요일";
		System.out.println(str.concat(str2)); 	// 문자열을 붙이는 method
		
		String s1 = "월";						// String 변수들 초기화
		String s2 = "화";
		String s3 = "수";
		String s4 = "목";
		String s5 = "금";
		String s6 = "토";
		String s7 = "일";
		
		// 월 화 수 목 금 토 일
		String[] sstr = {s1,s2,s3,s4,s5,s6,s7};			// sstr에 값 초기화
		
		for(int i=0;i<sstr.length;i++)					
			System.out.print(sstr[i].concat(" "));		// concat을 이용해서 하나로 출력
		
		// method chain
		System.out.println(
				s1.concat(s2)
				.concat(s3)
				.concat(s4)
				.concat(s5)
				.concat(s6)
				.concat(s7));
		System.out.println();
		String t = str.concat(str2);					// str과 str2를 붙임
		System.out.println("t : " +t);					// 출력
		// contains(문자열) :
		// 해당 문자열이 존재하면 t, 아니면 false 리턴
		System.out.println(str.contains("java"));		// 해당값이 포함되어있는지 boolean으로 return해줌
		
		if(str.equalsIgnoreCase("JAVA ORACLE"));			// 대소문자를 무시하고 내용이 같은가?
			System.out.println("대소문자 무시하고 내용이 같음");
		// r이라는 글자가 몇번째 위치인지 반환하는 메서드
		System.out.println(str.indexOf('r')); // 6
	
		// 문자열의 부분집합 : 2번부터 6번전까지
		System.out.println(str.substring(2, 6)); // va o
		
		char[] chArray = str.toCharArray();
		// 한개씩 꺼내서 출력
		// 향상된 for문 사용
		
		for (char c : chArray) {		// 향상된 for문
			System.out.println(c);
		}
		// int값을 String으로 바꿔준다.
		int a = 20;
		String value = String.valueOf(a);		// int에서 String으로 형변환
		System.out.println(value);
		System.out.println("-------------------------------");
		
		String email = "dagda@hanafos.com";
		
		// id@메일서버
		// id추출해서 출력
		System.out.println(email.substring(0, email.indexOf('@')));
		// 0부터 @전까지(id) 출력하기
		String txt = "오늘은,월요일,내일은,화요일";
		// ,를 기준으로 쪼개서 출력
		// 오늘은
		// 월요일
		// 내일은
		// 화요일
		
		String[] d = txt.split(",");	// ,기준으로 잘라냄
		for(String x : d){				// 향상된 for문으로 
			System.out.println(x);		// 배열에 담긴 값 출력
		}
		
	}
	
}
