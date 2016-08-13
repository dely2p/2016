package d20160509;

public class Test2 {
	public static void main (String [] args){
		byte b1 = 20;								// 00010100
		byte b2 = 32;							    // 00100000
		
		System.out.println("b1|b2 : "+ (b1|b2));	// 00110100 -> 52
		System.out.println("b1&b2 : "+ (b1&b2));	// 00000000 -> 0
		
	}

}
