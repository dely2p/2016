package d20160519;

public class TestMain {
	public static void main(String[] args) {
		//포유류 mu = new 포유류();							// 추상클래스는 new 할 수 없음
		//System.out.println("mu : "+mu);
		
		토끼 r = new 토끼();								// 토끼 클래스 생성
		고래 w = new 고래();								// 고래 클래스 생성
		다람쥐 m = new 다람쥐();								// 다람쥐 클래스 생성
		Horse h1 = new Horse();
		// mu = r 										// 상속관계기 때문에 가능
		
		
		System.out.println("--------토끼--------");
		r.먹기();											// 토끼 클래스 먹기 method 
		r.자기();											// 토끼 클래스 자기 method 
		r.점프();											// 토끼 클래스 점프 method 
		
		System.out.println("--------고래--------");
		w.먹기();											// 고래 클래스 먹기 method
		w.자기();											// 고래 클래스 자기 method 
		w.헤엄치기();										// 고래 클래스 헤엄치기 method 
		
		System.out.println("--------다람쥐-------");
		m.먹기();											// 다람쥐 클래스 먹기 method
		m.자기();											// 다람쥐 클래스 자기 method
		m.나무에오르기();									// 다람쥐 클래스 나무에오르기 method
		
		System.out.println("---------말---------");
		h1.먹기();
		h1.자기();
		h1.달리다();
	}
}
