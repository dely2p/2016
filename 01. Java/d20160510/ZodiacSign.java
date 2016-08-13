package d20160510;

import java.util.Scanner;
public class ZodiacSign {
	public static void main(String[] args) {
		// 태어난 년도를 입력받아
		// 어떤 띠인지를 출력하는 코드 작성
		
		// 자	축	인	묘	진	사	오	미	신	유	술	해
		// 쥐	소	호	토	용	뱀	말	양	원	닭	개	돼
		// 4	5	6	7	8	9	10	11	0	1	2	3
		
		Scanner sc = new Scanner(System.in);				// 스캐너 생성
		System.out.println("태어난 년도 입력 : ");					// 태어난 년도 입력 문자열 출력
		int year = sc.nextInt();							// 태어난 년도 입력받음
		System.out.println(year);							// 입력받은 년도 출력
		
		if(year%12==0){										// 입력받은 년도를 12로 나눈 나머지 값이 0이면
			System.out.println("당신은 원숭이띠입니다.");			// 원숭이띠라고 출력
		}else if(year%12==1){
			System.out.println("당신은 닭띠입니다.");				// 입력받은 년도를 12로 나눈 나머지 값이 1이면
		}else if(year%12==2){								// 닭띠라고 출력
			System.out.println("당신은 개띠입니다.");				// 입력받은 년도를 12로 나눈 나머지 값이 2이면
		}else if(year%12==3){								// 개띠라고 출력
			System.out.println("당신은 돼지띠입니다.");			// 입력받은 년도를 12로 나눈 나머지 값이 3이면
		}else if(year%12==4){								// 돼지띠라고 출력
			System.out.println("당신은 쥐띠입니다.");				// 입력받은 년도를 12로 나눈 나머지 값이 4이면
		}else if(year%12==5){								// 쥐띠라고 출력
			System.out.println("당신은 소띠입니다.");				// 입력받은 년도를 12로 나눈 나머지 값이 5이면
		}else if(year%12==6){								// 소띠라고 출력
			System.out.println("당신은 호랑이띠입니다.");			// 입력받은 년도를 12로 나눈 나머지 값이 6이면
		}else if(year%12==7){								// 호랑이띠라고 출력
			System.out.println("당신은 토끼띠입니다.");			// 입력받은 년도를 12로 나눈 나머지 값이 7이면
		}else if(year%12==8){								// 토끼띠라고 출력
			System.out.println("당신은 용띠입니다.");				// 입력받은 년도를 12로 나눈 나머지 값이 8이면
		}else if(year%12==9){								// 용띠라고 출력
			System.out.println("당신은 뱀띠입니다.");				// 입력받은 년도를 12로 나눈 나머지 값이 9이면
		}else if(year%12==10){								// 뱀띠라고 출력
			System.out.println("당신은 말띠입니다.");				// 입력받은 년도를 12로 나눈 나머지 값이 10이면
		}else if(year%12==11){								// 말띠라고 출력
			System.out.println("당신은 양띠입니다.");				// 입력받은 년도를 12로 나눈 나머지 값이 11이면
		}													// 양띠라고 출력	

	}
}
