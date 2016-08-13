package d20160516;

public class StatementHw3 {
	public static void main(String[] args) {
		토끼 r = new 토끼();				// 토끼 클래스 생성
		String bob="풀";					// 풀이라는 값을 넣으려고 String 선언 및 초기화
		r.토끼정보();						// 토끼정보 출력
		r.보기(bob);						// 풀을 발견한 토끼
		r.달리기();						// 달려가는 method
		r.먹기();							// 풀을 먹는 method
		
		토끼 r2 = new 토끼("파란눈");			// 파란눈의 토끼 생성
		r2.토끼정보();						// 토끼 정보 출력
				
		토끼 r3 = new 토끼("초록눈", 2);		// 초록눈에 코가 2개인 토끼 생성
		r3.토끼정보();						// 토끼정보 출력
	}
}
