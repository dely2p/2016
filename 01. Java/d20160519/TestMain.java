package d20160519;

public class TestMain {
	public static void main(String[] args) {
		//������ mu = new ������();							// �߻�Ŭ������ new �� �� ����
		//System.out.println("mu : "+mu);
		
		�䳢 r = new �䳢();								// �䳢 Ŭ���� ����
		�� w = new ��();								// �� Ŭ���� ����
		�ٶ��� m = new �ٶ���();								// �ٶ��� Ŭ���� ����
		Horse h1 = new Horse();
		// mu = r 										// ��Ӱ���� ������ ����
		
		
		System.out.println("--------�䳢--------");
		r.�Ա�();											// �䳢 Ŭ���� �Ա� method 
		r.�ڱ�();											// �䳢 Ŭ���� �ڱ� method 
		r.����();											// �䳢 Ŭ���� ���� method 
		
		System.out.println("--------��--------");
		w.�Ա�();											// �� Ŭ���� �Ա� method
		w.�ڱ�();											// �� Ŭ���� �ڱ� method 
		w.���ġ��();										// �� Ŭ���� ���ġ�� method 
		
		System.out.println("--------�ٶ���-------");
		m.�Ա�();											// �ٶ��� Ŭ���� �Ա� method
		m.�ڱ�();											// �ٶ��� Ŭ���� �ڱ� method
		m.������������();									// �ٶ��� Ŭ���� ������������ method
		
		System.out.println("---------��---------");
		h1.�Ա�();
		h1.�ڱ�();
		h1.�޸���();
	}
}
