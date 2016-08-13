package d20160518;

public class StatementHw4 {
	public static void main(String[] args) {
		Phone p = new Phone();							// Phone 클래스 생성
		CellPhone c = new CellPhone();					// CellPhone 클래스 생성
		SmartPhone s = new SmartPhone();				// SmartPhone 클래스 생성
		
		System.out.println("====== Cellphone ======");	// Cellphone 
		c.문자보내기("Hello Cellphone");
		c.번호저장("0101234567");
		c.보글보글게임();
		c.사진찍기();
		c.정보();
		
		System.out.println();
		System.out.println("====== Smartphone ======");	// Smartphone
		s.어플다운("인스타그램");
		s.사진찍기();
		s.충전하기();
		s.전화걸기("01023456789");
		s.정보();
		
		
	}
}
