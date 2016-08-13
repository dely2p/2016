package d20160519;

public class TestMain4 {
	public static void main(String[] args) {
		// 클래스 생성
		SmartPhone sp1 = new SmartPhone("ios","012345678","sk","apple","3g","아이폰6s", 1234,2345561);		
		SmartPhone sp2 = new SmartPhone("안드로이드","0113555678","kt","삼숭","6G","갤럭시 S7", 4313,2244245);
		
		System.out.println(sp1.제조사);
		System.out.println(sp2.제조사);
		System.out.println("---------------");
		System.out.println("인수합병");
		
		sp1.제조사 = "小米";				// static때문에 sp1, sp2 둘다 바뀜
		//sp2.제조사 = "小米";
		
		System.out.println(sp1.제조사);
		System.out.println(sp2.제조사);
		
		sp1.전화걸기("0102356789");		// sp1 출력
		sp1.전화받기();
		sp1.getApp();
		sp1.game();
	}
}
