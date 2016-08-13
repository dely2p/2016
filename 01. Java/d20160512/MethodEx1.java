package d20160512;

import java.util.Scanner;

public class MethodEx1 {
	static void prtStar(){							// prtStar 선언
		// 별찍기
		for(int i=0;i<5;i++){						// 사용자로부터 입력받은 값만큼 행 출력
			for(int j=0;j<=i;j++){					// 행의 라인보다 작게 열 반복
				System.out.print("*");				// 별 찍기
			}
			System.out.println();					// 한 줄 띄기 
		} // for end
	} // prtStar() end
	
	static void prtHello(){							// prtHello 선언
			System.out.println("안녕 자바");			// 안녕 자바 출력
	}
	public static void main(String[] args) {
	// 자주 사용되는 코드의 이름을 부여해놓은 것 : method
	// function
		prtStar();
		
		prtStar();									// prtStar method를 실행하고 돌아옴
		
		prtHello();									//  "안녕 자바" 메세지를 출력
	}
}
