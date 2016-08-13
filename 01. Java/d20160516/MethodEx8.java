package d20160516;

public class MethodEx8 {
	
	static int add(int ... arrs){							// add method
		System.out.println("add 메소드 내부 : "+arrs);			// add 메소드 내부 주소값 출력
		int sum = 0;										// 더한 값 저장해 둘 sum변수 생성
		for(int i=0;i<arrs.length;i++){						// arrs의 length만큼 반복
			sum+=arrs[i];									// arrs의 값들을 모두 더함
		}
		return sum;											// 모두 더한 값 return 
	}
	public static void main(String[] args) {
		int a = 10;											// 변수 a를 10으로 초기화
		int b = 20;											// 변수 b를 20으로 초기화	
		int c = 30;											// 변수 c를 30으로 초기화
		
		int k = add(a,b);									// 매개변수가 2개인 add 실행
		int m = add(a,b,c);									// 매개변수가 3개인 add 실행
		
		System.out.println("k : "+k);						// k값 출력
		System.out.println("m : "+m);						// m값 출력
		
		System.out.println("=====================");		// 사이 띄기
		
		// 가변인수
		int n = add(100,200,500,1000);						// 매개변수 값이 많아도 method에서 
		int n2 = add(2000,1000,2000,3000,10,20,30,40);		// 가변 매개변수로 add함수 실행가능
		
		System.out.println("n : "+n);						// n값 출력
		System.out.println("n2 : "+n2);						// n2값 출력
	}
}
