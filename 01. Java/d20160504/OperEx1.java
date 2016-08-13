package d20160504;
//연산자 : 자료 가공을 위해 정해진 방식으로 계산하고
//그 결과를 얻기 위한 행위를 의미하는 기호들의 총칭

//1. 순위  : 증감연산자
public class OperEx1 {
	public static void main(String[] args) {
		int a = 100;
		int b = 20;
		
		// a의 변수에 값을 1증가 시키고 싶다.
		a = a + 1;
		System.out.println(" a : " + a);
		
		// a의 변수에 값을 1증가 시키고 싶다. 위에꺼보다 훨씬 빠름 
		a++; // 증감연산자
		System.out.println(" a : " + a);
		
		b = a++;
		//( b = a;
		// a = a + 1;)
		
		//b = ++a;
		//( a = a + 1;
		// b = a;)
		
		System.out.println(" a : " + a + " b : " + b);
		
		int k = 20;
		int m = 10;
		k = m++;
		System.out.println(" k :" + k + " m : " +m);
		
	}
}
