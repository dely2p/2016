package d20160524;

import java.util.Calendar;

public class UtilEx3 {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		//cal.set(2016, 4, 24);
		System.out.println(cal);
		
		// 일 ~ 토
		// 1 ~ 7
		int d = cal.get(Calendar.DAY_OF_WEEK);// 몇번째 요일인가?
		System.out.println(d); // 화요일
		
		//System.out.println("\t\t\t"+Calendar.DAY_OF_MONTH+"월");
		System.out.println("\t\t\t"+cal.get(Calendar.MONTH)+"월");
		System.out.println();
		System.out.println("일\t 월\t 화\t 수\t 목\t 금\t 토\t");
		System.out.println();
		int count = 0;
		for(int j=1;j<d;j++){			// 해당 월에 따라 시작하는 요일이 다르므로
			System.out.print("\t");
			count++;					// count를 두어 탭을 둔다.
		}
		for(int i=1;i<=31;i++){			// 31일까지 출력
			count++;					// count 한다.
			System.out.print(i+"\t");
			if(count%7==0)				// 7일씩 나누어 출력
				System.out.println();
		}
		
		
		
	}
}
