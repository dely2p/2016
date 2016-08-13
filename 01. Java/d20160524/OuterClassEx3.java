package d20160524;

public class OuterClassEx3 {
	int a = 10; // 전역변수
	static int b = 20; // 공용변수
	static final int c = 30; // 상수
	
	public void printAll(){
		// 클래스가 지역변수 처럼 사용
		class LocalInnerClass{
			int d = 30;
			//static int e = 40; // new 해야 쓸 수 있음
			static final int f = 40;
			public void print(){
				System.out.println("b : "+b);
				System.out.println("c : "+c);
				System.out.println("d : "+d);
				//System.out.println("e : "+e);
				System.out.println("f : "+f);
			}
		} // LocalInnerClass end
		LocalInnerClass lic = new LocalInnerClass();
		lic.print();
	} // printAll() end
	public static void main(String[] args) {
		OuterClassEx3 oce3 = new OuterClassEx3();
		oce3.printAll();
	}
} // OuterClassEx3 end
