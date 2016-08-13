package d20160510;

import java.util.Scanner;										// 다른패키지에 있는 Scanner를 가져옴

// 변환하고자 하는 초를 입력 : 54321
// 출력 : 15시간 5분 21초
public class StatementHw13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);					// 스캐너 생성	
		int time = sc.nextInt();								// 받아온 값을 time에 초기화						
		
		int hour = time/3600;									// 입력받은 전체 초에서 60분*60초 인 3600을 나누어 시간을 구한다. 
		int min = time%3600/60;									// 입력받은 전체 초에서 3600 나눈 나머지를 구하고 그것을 분단위로 만들기 위해 60으로 나눈다.
		int sec = time%60;										// 입력받은 전체 초에서 60으로 나눈 나머지를 구하여 초를 구한다.
		
		System.out.println(hour+"시간"+min+"분"+sec+"초");			// 시간, 분, 초를 나누어 출력한다.
	}
}
