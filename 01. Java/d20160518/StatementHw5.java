package d20160518;

public class StatementHw5 {
	public static void main(String[] args) {
		Zealot z = new Zealot();				// Zealot Ŭ���� ����
		Dragon d = new Dragon();				// Dragon Ŭ���� ����
		DarkTempler dt = new DarkTempler();		// DarkTempler Ŭ���� ����
		
		d.��������();								// ���� �� Dragon ��������
		z.����(d);								// Zealot�� Dragon ����
		d.��������();								// ���� �� Dragon ��������
		
		System.out.println("=============");
		
		dt.��������();								// ���� �� DarkTempler ��������
		d.����(dt);								// Dragon�� DarkTempler ����
		dt.��������();								// ���� �� DarkTempler ��������
		
		System.out.println("=============");
		
		z.��������();								// ���� �� Zealot ��������
		dt.����(z);								// DarkTempler�� Zealot ����
		z.��������();								// ���� �� Zealot ��������
	}
}
