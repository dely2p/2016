package spring_app12_javaconf;

public class HelloImple implements Hello{

	
	
	@Override
	public void printHello(String msg) {
		System.out.println("Hello : "+msg);
		
	}
	
}
