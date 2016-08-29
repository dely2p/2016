package kr.co.test.app;

public class Jiwoo implements Character{
	
	Weapon w;
	
	public Jiwoo() {
		
	}	

	public Jiwoo(Weapon w) {
		super();
		this.w = w;
	}

	@Override
	public void walk() {
		System.out.println("지우가 터벅터벅 걸어요~~");		
	}

	@Override
	public void eat(String it) {
		System.out.println("지우가 몬스터볼을 득템했어요~~");	
	}

	@Override
	public void attack(Object obj) {
		w.use();
		System.out.println(obj+"를 잡았습니다.");
		
	}

	@Override
	public void get(Object obj) {

		System.out.println(obj+"을/를 획득합니다.");
	}

}
