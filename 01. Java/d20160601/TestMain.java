package d20160601;

public class TestMain {
	public static void main(String[] args) {
		// OnlyOne Ŭ������ ���ؼ��� 1���� ��ü�� ���� �ϱ�
		OnlyOne one = OnlyOne.getInstance();
		OnlyOne two = OnlyOne.getInstance();
		
		System.out.println("one : "+one);
		System.out.println("two : "+two);
	}
}
