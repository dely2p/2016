package spring_app_aop1;

public class CustomerServiceImple implements CustomerService{

	String name;
	String email;
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void printName() {
		System.out.println("당신의 이름은 : "+name);
		
	}

	@Override
	public void printEmail() {
		System.out.println("이메일 : "+email);
		
	}
	

}