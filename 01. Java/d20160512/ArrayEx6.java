package d20160512;

public class ArrayEx6 {
	public static void main(String[] args){
		//int[] a = new int[3];
		int[] a = {3,9,2};							// 선언과 동시에 값 초기화
		
		System.out.println("a : "+a); 				// a 참조값
		
		// 배열의 크기
		System.out.println("길이 : "+ a.length);		// 배열의 길이 출력
		
		// 배열에 값 담기
/*		a[0] = 10;									 
		a[1] = 20;
		a[3] = 30;*/
		
		// 배열 요소 출력
		// 반복문 사용 해서 출력
		for(int i=0;i<a.length;i++){				// 배열의 길이만큼 반복
		//	a[i] = (1+i)*10;
			System.out.println(a[i]);				// 배열 a값 출력
		}
	}
}
