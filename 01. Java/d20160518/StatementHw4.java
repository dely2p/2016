package d20160518;

public class StatementHw4 {
	public static void main(String[] args) {
		Phone p = new Phone();							// Phone Ŭ���� ����
		CellPhone c = new CellPhone();					// CellPhone Ŭ���� ����
		SmartPhone s = new SmartPhone();				// SmartPhone Ŭ���� ����
		
		System.out.println("====== Cellphone ======");	// Cellphone 
		c.���ں�����("Hello Cellphone");
		c.��ȣ����("0101234567");
		c.���ۺ��۰���();
		c.�������();
		c.����();
		
		System.out.println();
		System.out.println("====== Smartphone ======");	// Smartphone
		s.���ôٿ�("�ν�Ÿ�׷�");
		s.�������();
		s.�����ϱ�();
		s.��ȭ�ɱ�("01023456789");
		s.����();
		
		
	}
}
