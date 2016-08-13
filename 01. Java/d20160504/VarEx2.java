package d20160504;

public class VarEx2 {
	//자바의 모든 변수는 반드시 초기화 해서 사용해야 합니다.
	public static void main(String[] args) {
		//변수를 선언하면서 값을 지정
	 	byte b1 = 0; //(127까지 가능 128은 overflow)
	 	
	 	b1 = 10;
	 	byte b2 = 20;

	 	System.out.println(b1+b2);
		
	 	short sh1 = 150;
	 	//sh1 = b1;		//암시적 형변환
	 	b1 = (byte)sh1; //명시적 형변환
	 	
	 	System.out.println(b1);
	}
}
