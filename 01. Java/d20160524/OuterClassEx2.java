package d20160524;

public class OuterClassEx2 {
	int a = 10; // ��������
	static int b = 20; // ���뺯��
	static final int c = 30; // ���
	static class StaticInnerClass{
		int d = 30;
		static int e = 40; 
		static final int f = 40;
		public void print(){
			// non static ������ ���� �Ұ���
			//System.out.println("a : "+a);
			System.out.println("b : "+b);
			System.out.println("c : "+c);
			System.out.println("d : "+d);
			System.out.println("e : "+e);
			System.out.println("f : "+f);
		} // print() end
	} // staticInnerClass end
	public static void main(String[] args) {
		StaticInnerClass sic = new StaticInnerClass(); // �ٷ� ���� ����
		sic.print();
	}
} // OuterClassEx2 end
