package d20160509;
// 6����  �������� : &&(and) ||(or), (!�� 1����, �������� ���)
public class VarEx6 {
	// main method
	public static void main(String [] args){
		boolean b1 = true;									// b1�� true�� �ʱ�ȭ
		boolean b2 = false;									// b2�� false�� �ʱ�ȭ
		System.out.println("b1&&b2 : "+(b1&&b2));			// true && false -> false
		System.out.println("b1||b2 : "+(b1||b2));			// true || false -> true
		
		byte b3 = 10;										// 00001010
		byte b4 = 20;										// 00010100
		//System.out.println(b3&&b4); ���⿡�� && ����� �Ұ���
		System.out.println(b3&b4);							// 00000000 -> 0
		
		System.out.println("!b1 : "+ !b1);					// !true -> false
		
	}
}
