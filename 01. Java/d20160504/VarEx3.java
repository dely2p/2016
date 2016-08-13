package d20160504;

public class VarEx3 {
	public static void main(String[] args) {
		//int 이하 크기의 자료형끼리 연산할 때는 
		//자동으로 int로 형변환 한다.
		
		byte b1 = 10;
		byte b2 = 20;
		short sh1 = 30;
		
		int i = b1+b2;
		System.out.println("i : "+i);
		int sh2 = sh1 + b2;
		System.out.println("sh2 : "+sh2);
		
		int a = 200; //상수 200에 대입
		long c = 300L; //long형 상수는 뒤에 L을 붙임		
		long d = a+c;
		System.out.println("d : "+ d);
		
		float f1 = 300.2f;		
		double d1 = 3090.20;
		double k1 = f1 + d1;
		
		System.out.println(k1);
		
	}
}
