package d20160517;

public class GuGuDan {			
	int dan;												// 멤버변수 dan 선언
	
	GuGuDan(){												// 구구단 생성자
		dan = 2;											// dan에 2 대입(기본값으로)
	}
	GuGuDan(int dan){										// 매개변수가 있는 구구단 생성자
		this.dan = dan;										// 구구단의 단 전역변수에 지역변수 입력
	}
	
	void print(){											// 출력 method
		// 1. for문 출력		
		for(int i=1;i<=9;i++)								// 9번 반복 실행하며
			//System.out.println(dan+" * "+i+" = "+dan*i);	// 구구단 출력
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);// printf 사용가능 
								
	}
}
