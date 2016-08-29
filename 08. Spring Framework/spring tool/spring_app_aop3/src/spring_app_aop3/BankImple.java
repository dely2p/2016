package spring_app_aop3;

public class BankImple implements Bank{

	@Override
	public void transfer() {
		System.out.println("이체합니다~~");
		
	}

}
