package d20160518;

public class TestMain {
	public static void main(String[] args) {
		//Person p1 = new Person();					// Person 클래스 생성
		SuperMan sm = new SuperMan();				// SuperMan 클래스 생성
		
		sm.비행();									// SuperMan의 method
		sm.먹기();									// Person의 method(상속받아서 SuperMan에서 사용 가능)
		System.out.println(sm.getName());			// Person의 getName 사용가능		
		
	}
}
