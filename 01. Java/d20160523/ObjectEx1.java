package d20160523;

import d20160519.마린;

// 자바에서 생략가능한 것?

// 1. import java.lang.*
// 2. extends Object
// 3. 기본 생성자(다른 매개변수 있는 생성자가 없을 경우)
//		멤버 변수의 값을 기본값, 숫자 0 참조값 null
// 4. 멤버변수를 가리키는 참조변수 : this
// 5. super
// 6. super()
// 7. default

public class ObjectEx1 {
	public static void main(String[] args) {
		Object obj1 = new Object();				// Object 클래스 obj1 생성
		Object obj2 = new Object();				// Object 클래스 obj2 생성

		obj1 = obj2;							// obj2 참조값을 obj1에 대입
		System.out.println("obj1 : "+obj1);
		System.out.println("obj2 : "+obj2);
		
		if(obj1 == obj2)						// obj1과 obj2가 같으면
			System.out.println("동일객체");
		else									// 아니면
			System.out.println("다른객체");

		System.out.println("----------------------------");
		
		if(obj1.equals(obj2))					// 두개 참조값이 같으면 true, 다르면 false
			System.out.println("동일객체");
		else									// 아니면
			System.out.println("다른객체");
		
		System.out.println("----------------------------");
		
		Class cls = obj1.getClass();			// obj1이 어떤 클래스인지 클래스명 나타냄
		System.out.println("클래스명  : "+cls.getName());
		
		// Object 클래스의 instance변수인가요?(내 참조값이 어떤 클래스의 참조값인지 알고싶을 때 쓰임)
		System.out.println(obj1 instanceof Object); // instanceof는 연산자
		System.out.println(obj1 instanceof 마린);
		
		System.out.println("obj2의 참조값  : "+ obj2);	// 우리가 보는 참조값은 toString()되어있음
		System.out.println("obj2.toString() : "+obj2.toString());
		System.out.println(
				obj2.getClass().getName() + '@' +
				Integer.toHexString(obj2.hashCode()));
		
		
	}
}
