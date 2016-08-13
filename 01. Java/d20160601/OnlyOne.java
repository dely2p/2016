package d20160601;
// 싱글톤 디자인 패턴 (Singleton Design Pattern)
// 1. 하나의 객체만을 생성하기 위한 패턴
// 2. 현실세계에서 존재하는 객체가 유일한 객체
//	  가상의 세계에서도 유일한 객체를 생성해서 사용할 목적으로 제공
public class OnlyOne {
	// 2. 클래스안에서 자신의 객체를 생성한다.
	static OnlyOne oo = new OnlyOne(); // 객체를 만들면서 생성
	// 1. 생성자의 접근지정자를 private
	private OnlyOne(){ 
		
	}
	// 3. 외부에서 OnlyOne 객체를 제공하는 메서드를 정의한다.
	public static OnlyOne getInstance(){ // static 객체를 만들어서 return 
		return oo;
	}
}
