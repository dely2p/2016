package d20160516;

public class TestMain {
	public static void main(String[] args) {
		Person p1 = new Person();			// 클래스 p1 생성
		// 클래스명 참조변수 = new 생성자();
		
		// 생성자 : 객체의 초기화를 목적으로 멤버 벼수의 초기값을
		// 지정해주는 특별한 능력이 있는 메서드
		
		// 클래스명과 동일한 이름을 가지고 있는 메서드 
		// 객체 생성시 1회만 실행되는 메서드 
		
		
		Person p2 = new Person();			// 클래스  p2 생성
		Person p3 = new Person();			// 클래스  p3 생성
		
		p1.나이 = 25;							// p1 클래스의 각 멤버변수 초기화
		p1.성별 = "여";
		p1.이름 = "송은주";
		p1.혈액형 = "B";
		p1.키 = 180.0f;
		p1.몸무게 = 41.0f;
		p2.나이 = 28;							// p2 클래스의 각 멤버변수 초기화
		p2.성별 = "남";
		p2.이름 = "최철민";
		p2.혈액형 = "A";
		p2.키 = 180.5f;
		p2.몸무게 = 60.0f;	
		
		System.out.println(p1.나이);			// p1의 멤버변수 값 출력
		System.out.println(p1.성별);
		System.out.println(p1.이름);
		System.out.println(p1.혈액형);
		System.out.println(p1.키);
		System.out.println(p1.몸무게);
		System.out.println("============");
		System.out.println(p2.나이);			// p2의 멤버변수 값 출력
		System.out.println(p2.성별);
		System.out.println(p2.이름);
		System.out.println(p2.혈액형);
		System.out.println(p2.키);
		System.out.println(p2.몸무게);
		System.out.println("============");
		System.out.println(p3.이름);			// p3의 멤버변수 값 출력
	}
}
