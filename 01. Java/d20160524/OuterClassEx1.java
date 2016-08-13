package d20160524;
// Inner Class
// member inner class
// static inner class
// local inner class
// annonymous inner class

public class OuterClassEx1 {
	int a = 10; // 전역변수
	static int b = 20; // 공용변수
	static final int c = 30; // 상수
	// 중첩
	class MemberInnerClass{
		int d = 30;
		//static int e = 40; // memberInnerClass도
		// Outerclass에서 볼 때 멤버변수로 취급
		// 따라서 instance화 해야 memberInnerClass도 사용 가능
		static final int f = 40;
		public void print(){
			System.out.println("a : "+a);
			System.out.println("b : "+b);
			System.out.println("c : "+c);
			System.out.println("d : "+d);
			//System.out.println("e : "+e);
			System.out.println("f : "+f);
		} // print() end
	} // MemberInnerClass end
	
	public static void main(String[] args) {
		 OuterClassEx1 oce1 = new OuterClassEx1();
		 // MemberInnerClass 객체 생성
		 OuterClassEx1.MemberInnerClass mic 
		 	= oce1.new MemberInnerClass();
		 mic.print();
	}
} // OuterClass end
