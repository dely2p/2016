package d20160518;

public class StatementHw5 {
	public static void main(String[] args) {
		Zealot z = new Zealot();				// Zealot 클래스 생성
		Dragon d = new Dragon();				// Dragon 클래스 생성
		DarkTempler dt = new DarkTempler();		// DarkTempler 클래스 생성
		
		d.상태정보();								// 공격 전 Dragon 상태정보
		z.공격(d);								// Zealot의 Dragon 공격
		d.상태정보();								// 공격 후 Dragon 상태정보
		
		System.out.println("=============");
		
		dt.상태정보();								// 공격 전 DarkTempler 상태정보
		d.공격(dt);								// Dragon의 DarkTempler 공격
		dt.상태정보();								// 공격 후 DarkTempler 상태정보
		
		System.out.println("=============");
		
		z.상태정보();								// 공격 전 Zealot 상태정보
		dt.공격(z);								// DarkTempler의 Zealot 공격
		z.상태정보();								// 공격 후 Zealot 상태정보
	}
}
