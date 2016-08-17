package kr.co.test.app;

import java.util.Calendar;

public class NowTime {
	Calendar cal;
	
	public NowTime(){
		cal = Calendar.getInstance();
	}
	
	public int getHour(){
		int hour = cal.getTime().getHours();
		return hour;
	}
}
