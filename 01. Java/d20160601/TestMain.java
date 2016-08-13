package d20160601;

public class TestMain {
	public static void main(String[] args) {
		// OnlyOne 클래스를 통해서는 1개의 객체만 갖게 하기
		OnlyOne one = OnlyOne.getInstance();
		OnlyOne two = OnlyOne.getInstance();
		
		System.out.println("one : "+one);
		System.out.println("two : "+two);
	}
}
