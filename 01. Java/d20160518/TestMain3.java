package d20160518;

public class TestMain3 {
	public static void main(String[] args) {
		마린 m1 = new 마린();							// 마린 클래스 m1 생성
		마린 m2 = new 마린();							// 마린 클래스 m2 생성
		SiegeTank st = new SiegeTank();				// 시즈탱크 클래스 st 생성
		//Ghost g1 = new Ghost();						// Ghost 클래스 g1 생성
		Medic me = new Medic();						// Medic 클래스 me 생성
		
		m1.공격(m2);									// m1이 m2 공격
		m1.공격(st);									// m1이 st 공격
		//m1.공격(g1);
		
		System.out.println("===============");		// 구분선
		
		me.힐(m1);									// medic이 m1 치료
		me.힐(me);									// medic이 me치료

	}
}
