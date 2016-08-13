package d20160516;

public class TestMain3 {
	public static void main(String[] args) {
		Monkey m1 = new Monkey();
		System.out.println(m1.성별); 					// 숫컷 출력
		System.out.println(m1.나이); 					// 10 출력
		Monkey m2 = new Monkey(20,"암컷","안경원숭이");	// 클래스 오버로딩
		System.out.println(m2.성별); 					// 암컷 출력
		System.out.println(m2.나이); 					// 20 출력
		System.out.println(m2.종류); 					// 안경원숭이 출력
		
	}
}
