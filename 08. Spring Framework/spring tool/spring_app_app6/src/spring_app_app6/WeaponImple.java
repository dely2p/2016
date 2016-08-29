package spring_app_app6;

public class WeaponImple implements Weapon{

	String type;
	
	
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void fire() {
		System.out.println(type+"총으로 빵하고 쏩니다.");
		
	}

	@Override
	public void reload() {
		System.out.println("reloading....철커덕");
		
	}
	
}
