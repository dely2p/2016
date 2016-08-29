package kr.co.test.app;

public class Gun implements Weapon{

	int bullet;
	
	// 기본생성ㅇ자 총알 수를 지정
	public Gun() {
		bullet = 6;	
	}
	
	public void reload(){
		System.out.println("철커덕!!");
		bullet=6;
	}
	public void fire(){
		if(bullet>0){
			bullet--;
			System.out.println("빵야!!");
		}else{
			System.out.println("틱..");
		}
	}	
	
	@Override
	public void use() {
		fire();
	}

	@Override
	public void drop() {
		bullet=0;		
	}

	@Override
	public void reuse() {
		reload();
	}
}
