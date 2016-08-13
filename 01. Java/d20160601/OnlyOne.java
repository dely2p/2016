package d20160601;
// �̱��� ������ ���� (Singleton Design Pattern)
// 1. �ϳ��� ��ü���� �����ϱ� ���� ����
// 2. ���Ǽ��迡�� �����ϴ� ��ü�� ������ ��ü
//	  ������ ���迡���� ������ ��ü�� �����ؼ� ����� �������� ����
public class OnlyOne {
	// 2. Ŭ�����ȿ��� �ڽ��� ��ü�� �����Ѵ�.
	static OnlyOne oo = new OnlyOne(); // ��ü�� ����鼭 ����
	// 1. �������� ���������ڸ� private
	private OnlyOne(){ 
		
	}
	// 3. �ܺο��� OnlyOne ��ü�� �����ϴ� �޼��带 �����Ѵ�.
	public static OnlyOne getInstance(){ // static ��ü�� ���� return 
		return oo;
	}
}
