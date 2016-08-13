package d20160510;

import java.util.Scanner;

/*1. 사용자로부터 숫자를 입력받는다. 

동전을입력하세요 : 50000

1. 콜라       : 1200원
2. 사이다     : 2500원
3. 구공탄라면 : 120원

2. 메뉴를 선택하세요 :  2
3. 몇개? 3 
4. 사이다 3개 
잔돈 : 42500입니다. 
만원   : 4장
천원   : 2장
오백원 : 1개
*/
public class Day20150510hw3_VendingMachine {
	public static void main(String[] args) {
		String menuname = "";									// 메뉴 이름을 담을 String형 menuname 선언
		int menuval = 0;										// 메뉴의 값을 담을 int형 menuval 선언
		int man=0, chun=0, obak=0;								// 만원, 천원, 오백원의 수를 담을 변수 선언
		Scanner sc = new Scanner(System.in);					// 스캐너 생성
		System.out.print("동전을 입력하세요 : ");						// 동전 입력하는 문자열 출력
		int money = sc.nextInt();								// 사용자로부터 값 입력받음
		
		System.out.println("1. 콜라\t\t: 1200원");					// 메뉴 1 콜라, 가격 문자열 출력
		System.out.println("2. 사이다\t\t: 2500원");				// 메뉴 2 사이다, 가격 문자열 출력
		System.out.println("3. 구공탄라면\t: 120원");				// 메뉴 3 콜라, 가격 문자열 출력		
		System.out.print("메뉴를 선택하세요 : ");						// 메뉴 선택 문자열 출력
		
		int menu = sc.nextInt();								// 사용자로부터 메뉴 번호 입력받음
		switch(menu){											// switch문을 사용해서 메뉴 별로 해당 사항을 실행시킴
		case 1:													// menu=1이라면
			menuname = "콜라";									// menuname에 콜라 문자열 대입
			menuval = 1200;										// menuval에 1200 가격 대입
			break;												// 실행했으면 break
		case 2:
			menuname = "사이다";									// menuname에 사이다 문자열 대입
			menuval = 2500;										// menuval에 2500 가격 대입
			break;												// 실행했으면 break
		case 3:
			menuname = "구공탄라면";								// menuname에 구공탄라면 문자열 대입
			menuval = 120;										// menuval에 120 가격 대입
			break;												// 실행했으면 break
		default:												// 그 외에는
			System.out.println("입력값 오류!");	// 입력 오류 시
		}		
		System.out.print("몇개? ");								// 몇 개를 선택할지 문자열 출력
		int num = sc.nextInt();									// 몇 개 선택인지 입력받음
		System.out.println(menuname+" "+num+"개");				// 선택한 메뉴이름과 갯수 출력
		
		int change = money - (menuval*num);						// 잔돈 계산
		System.out.println("잔돈 : " + change + "입니다.");			// 잔돈 출력
		
		if(change/10000>0){										// 만원 자리값이 있으면
			man = change/10000;									// 만원 장수를 변수 man에 대입
		}
		if(change%10000/1000>0){								// 천원 자리값이 있으면
			chun = change%10000/1000;							// 천원 장수를 변수 chun에 대입
		}
		if(change%1000/500>0){									// 오백원 자리값이 있으면
			obak = change%1000/500;								// 오백원 갯수를 obak에 대입
		}
		
		System.out.println("만원 : "+man+"장");					// 만원 장수 출력
		System.out.println("천원 : "+chun+"장");					// 천원 장수 출력
		System.out.println("오백원 : "+obak+"개");					// 오백원 장수 출력		
	}
}
