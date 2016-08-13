package d20160525;
// 제너릭(일반화)
public class TestMain {
	public static void main(String[] args) {
		String[] str = {"우리","나라","만세"};		
		// 이 배열을 멤버변수로 하는 GenEx1 클래스를 생성
		GenEx1<String> ge1 = new GenEx1<String>();	// String 형
		ge1.setArray(str);		
		// 출력
		ge1.print();
		
		System.out.println("----------------");
		
		Integer[] m = {20,10,40,20,30};		
		GenEx1<Integer> ge2 = new GenEx1<Integer>(); // Integer 형
		ge2.setArray(m);
		ge2.print();
		
		System.out.println("----------------");
		Float[] f = {30.2f,33.3f,102.34f};
		GenEx1<Float> ge3 = new GenEx1<Float>();	// Float 형
		ge3.setArray(f);
		ge3.print();
		
		
	}
}
