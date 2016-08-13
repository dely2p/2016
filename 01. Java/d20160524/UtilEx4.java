package d20160524;

import java.util.Calendar;

public class UtilEx4 {
	public static void main(String[] args) {
		// static 변수, static method는
		// instance화 하지 않고도 바로 사용이 가능
			
		Calendar cal = Calendar.getInstance();		// 달력 가져옴
		int year = cal.get(Calendar.YEAR);			// 몇년인지 가져옴
		System.out.println("올해는 "+year+"년 입니다.");
		int month = cal.get(Calendar.MONTH)+1;		// 월 가져옴
		System.out.println("오늘은 "+month+"월 입니다.");
		int day = cal.get(Calendar.DAY_OF_MONTH);	// 일 가져옴
		System.out.println("오늘은 "+day+"일 입니다.");
	}
}
