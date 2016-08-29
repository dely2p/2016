package kr.co.test.app;

public class MonsterBall implements Weapon{

	int ball;
	
	public MonsterBall() {
		ball=3;
	}
	
	public void throwball(){
		if(ball>0){
			System.out.println("몬스터볼을 던졌습니다.");
		}else{
			System.out.println("몬스터볼이 없습니다.");
		}
	}
	
	@Override
	public void use() {
		throwball();
	}

	@Override
	public void drop() {
		ball=0;
		System.out.println("포켓몬 잘가~~~~");
	}

	@Override
	public void reuse() {
		
	}

}
