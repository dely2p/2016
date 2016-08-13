package d20160513;

public class MethodEx7 {
	
	static int maxMethod(int[] m){
		int result = 0;								// 가장 큰 값을 담을 result 선언 후 0으로 초기화
		for(int i=0;i<m.length;i++){				// 배열의 크기만큼 반복하며
			if(m[i]>result){						// 각 배열값과 result값을 비교해서 배열값이 크면
				result = m[i];						// 그 배열의 값을 result에 대입한다. 
			}
		}
		return result;								// 최대값 return 
	}
	public static void main(String[] args) {
		int[] m = {200,900,2000,140,299,500};		// 배열 m에 값 초기화
		System.out.println("가장큰값 출력하기");			// 문자열 출력
		
		System.out.println(maxMethod(m));			// 최대값 출력
		
		
	}
}
