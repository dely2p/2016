package d20160516;

public class TestMain4 {
	public static void main(String[] args) {
		마린  m = new 마린();				// 마린 클래스 생성
		마린 sm = new 마린(500);			// 체력 500짜리 슈퍼 마린
		m.공격();							// m 클래스의 공격 method
		m.상태정보();						// m 클래스의 상태정보 method
		m.스팀팩();						// m 클래스의 스팀팩 method
		m.상태정보();						// m 클래스의 상태정보 method
		
		sm.상태정보();						// sm 클래스의 상태정보 method

		System.out.println("=============================");
		
	}
}
