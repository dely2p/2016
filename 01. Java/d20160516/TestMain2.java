package d20160516;

import java.util.Arrays;

public class TestMain2 {
	public static void main(String[] args) {
		Person p = new Person();						// 생성자 호출
		p.이름 = "송은주";									// p.이름 초기화
		p.나이 = 19;										// p.나이 초기화
		p.키 = 180.0f;									// p.키 초기화
		p.몸무게 = 41.0f;									// p.몸무게 초기화
		System.out.println(p.이름);						// 이름 출력
		
		System.out.println("=====================");
		Person p2 = new Person(900, "요다");				// 멤버변수의 초기화를 간편하게 할 수 있음
		
		System.out.println(p2.나이);						// p2.나이 출력
		System.out.println(p2.이름);						// p2.이름 출력
		System.out.println(p2.성별);						// null값
		
		
		
		// 정렬 
/*		int[] m = {1232,5146,8215,1056,2435};
		Arrays.sort(m);
		for(int x : m){
			System.out.print(x+ "\t");
		}*/
		
	}
}
