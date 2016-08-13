package d20160516;

public class MethodEx9 {
	
	static String mergeWord(String ... arrs){						// 가변 매개변수 
		String word = "";											// String 선언 및 초기화
		/*for(int i=0;i<arrs.length;i++){
			str += arrs[i];
		}*/
		
		// 향상된 for문, 개선된 for문
		// for(자료형 변수명 : 배열명){
		
		//}
		for(String x : arrs){										// 향상된 for문을 이용해서 
			word += x;												// 문자열을 만듦
		}
		return word;												// 만든 문자열 return 
	}
	public static void main(String[] args) {				
		String str = mergeWord("오늘은","월요일");						// mergeWord method 실행
		System.out.println("str : "+str); 							// 오늘은 월요일 문자열 출력
		System.out.println(mergeWord("대한","민국","만세")); 			// 대한민국만세 문자열 출력
		System.out.println(mergeWord("자바","가변","인수","메서드")); 		// 자바가변인수메서드 문자열 출력
	}
}
