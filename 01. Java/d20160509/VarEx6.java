package d20160509;
// 6순위  논리연산자 : &&(and) ||(or), (!는 1순위, 부정으로 사용)
public class VarEx6 {
	// main method
	public static void main(String [] args){
		boolean b1 = true;									// b1에 true로 초기화
		boolean b2 = false;									// b2에 false로 초기화
		System.out.println("b1&&b2 : "+(b1&&b2));			// true && false -> false
		System.out.println("b1||b2 : "+(b1||b2));			// true || false -> true
		
		byte b3 = 10;										// 00001010
		byte b4 = 20;										// 00010100
		//System.out.println(b3&&b4); 여기에서 && 사용은 불가능
		System.out.println(b3&b4);							// 00000000 -> 0
		
		System.out.println("!b1 : "+ !b1);					// !true -> false
		
	}
}
