package d20160524;
// Inner Class
// member inner class
// static inner class
// local inner class
// annonymous inner class

public class OuterClassEx1 {
	int a = 10; // ��������
	static int b = 20; // ���뺯��
	static final int c = 30; // ���
	// ��ø
	class MemberInnerClass{
		int d = 30;
		//static int e = 40; // memberInnerClass��
		// Outerclass���� �� �� ��������� ���
		// ���� instanceȭ �ؾ� memberInnerClass�� ��� ����
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
		 // MemberInnerClass ��ü ����
		 OuterClassEx1.MemberInnerClass mic 
		 	= oce1.new MemberInnerClass();
		 mic.print();
	}
} // OuterClass end
