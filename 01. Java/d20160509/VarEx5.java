package d20160509;
// 5순위 연산자 : 비트연산자
// and=&, or= |
public class VarEx5 {
	public static void main(String [] args){
		byte a = 10 ; 									// 00001010 
		byte b = 22 ; 									// 00010110
		System.out.println("a&b : " + (a&b));			// 00000010 -> 2
		System.out.println("a|b : " + (a|b));			// 00011110 -> 30
		
		boolean b1 = true;								// boolean b1에 true로 초기화
		boolean b2 = false;								// boolean b2에 false로 초기화
		System.out.println("b1&b2 : " + (b1&b2));		// true&false -> false	
		System.out.println("b1|b2 : " + (b1|b2));		// true|false -> true
	}
	

}

// 단축키 : 복사 ctl+c 붙여넣기Ctl+v 잘라내기ctl+x 저장ctl+s 
// 드래그 한 부분 전체 이동 드래그+alt+방향키
// boolean : true = 1 false =0