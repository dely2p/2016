package kr.co.test.app;

public class MessageImple2 implements Message{

	String name;
	
	// setter DI
	public void setName(String name) {
		this.name = name;
	}
	
	
	public MessageImple2() {
		System.out.println("기본생성자");
	}
	
	public void init(){
		System.out.println("초기화 메서드");
	}

	public void destroy(){
		System.out.println("종료 메서드");
	}
	
	@Override
	public void printMsg() {
		System.out.println(name);
		
	}


}
