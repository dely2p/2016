package d20160519;

public class TestMain4 {
	public static void main(String[] args) {
		// Ŭ���� ����
		SmartPhone sp1 = new SmartPhone("ios","012345678","sk","apple","3g","������6s", 1234,2345561);		
		SmartPhone sp2 = new SmartPhone("�ȵ���̵�","0113555678","kt","���","6G","������ S7", 4313,2244245);
		
		System.out.println(sp1.������);
		System.out.println(sp2.������);
		System.out.println("---------------");
		System.out.println("�μ��պ�");
		
		sp1.������ = "�ڷ";				// static������ sp1, sp2 �Ѵ� �ٲ�
		//sp2.������ = "�ڷ";
		
		System.out.println(sp1.������);
		System.out.println(sp2.������);
		
		sp1.��ȭ�ɱ�("0102356789");		// sp1 ���
		sp1.��ȭ�ޱ�();
		sp1.getApp();
		sp1.game();
	}
}
