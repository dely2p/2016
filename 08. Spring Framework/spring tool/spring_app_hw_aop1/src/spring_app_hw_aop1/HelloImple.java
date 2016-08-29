package spring_app_hw_aop1;

public class HelloImple implements Hello{
	String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public void sayHello(){
		System.out.println("안녕하세요 : "+name+" 님");
	}

}
