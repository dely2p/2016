package spring_app1;

public class HelloKr implements Hello{
	@Override
	public void sayHello(String name){
		System.out.println(name+" hello~~");
	}
}