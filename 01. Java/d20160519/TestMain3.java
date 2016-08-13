package d20160519;

public class TestMain3 {
	public static void main(String[] args) {
		
		//Gun g = new Gun();
		화염방사기 g = new 화염방사기();			// 화염방사기 클래스 생성
		Police p = new Police(g);			// Police 클래스 생성
		
		p.fire();							// 무기바꾸기 가능
		
		
	}	
}
