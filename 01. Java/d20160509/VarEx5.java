package d20160509;
// 5���� ������ : ��Ʈ������
// and=&, or= |
public class VarEx5 {
	public static void main(String [] args){
		byte a = 10 ; 									// 00001010 
		byte b = 22 ; 									// 00010110
		System.out.println("a&b : " + (a&b));			// 00000010 -> 2
		System.out.println("a|b : " + (a|b));			// 00011110 -> 30
		
		boolean b1 = true;								// boolean b1�� true�� �ʱ�ȭ
		boolean b2 = false;								// boolean b2�� false�� �ʱ�ȭ
		System.out.println("b1&b2 : " + (b1&b2));		// true&false -> false	
		System.out.println("b1|b2 : " + (b1|b2));		// true|false -> true
	}
	

}

// ����Ű : ���� ctl+c �ٿ��ֱ�Ctl+v �߶󳻱�ctl+x ����ctl+s 
// �巡�� �� �κ� ��ü �̵� �巡��+alt+����Ű
// boolean : true = 1 false =0