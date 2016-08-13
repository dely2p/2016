package d20160517;

public class PrintStar {
	int num;							// 멤버변수 선언
	String s;
	
	PrintStar(){						// 생성자에서
		s = "*";						// String 값 초기화
	}
	PrintStar(int num){					// 매개변수가 있는 생성자에서
		this();							// 기본생성자의 값을 호출하고
		this.num = num;					// 입력받아온 num 값을 대입
	}
	
	void print(){						// method print
		for(int i=0;i<num;i++){			// 5행이고
			for(int j=0;j<=i;j++){		// 열보다 행이 더 클 때
				System.out.print(s);	// 별 찍기
			}
			System.out.println();		// 한 줄 띄기 
		}
	}
	
}
