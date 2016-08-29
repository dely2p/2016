package kr.co.test.app;

public class Police implements Character{

	int hp;
	Weapon w;
	
	
	// 생성자를 통해서 참조값 전달
	public Police(int hp, Weapon w) {
		super();
		this.hp = hp;
		this.w = w;
	}
	
	
	@Override
	public void walk() {
		System.out.println("경찰이 아장아장 걸어요~~");		
	}


	@Override
	public void eat(String it) {
		System.out.println(it+"을/를 맛있게 먹습니다.");
	}

	@Override
	public void attack(Object obj) {
		w.use();
		System.out.println(obj+"을/를 공격합니다.");
	}

	@Override
	public void get(Object obj) {
		System.out.println(obj+"을/를 획득합니다.");
	}
	
}
