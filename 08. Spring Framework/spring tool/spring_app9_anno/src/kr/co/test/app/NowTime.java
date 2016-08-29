package kr.co.test.app;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NowTime {
	
	Calendar c;
	
	public String getTime(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(" HH 시 mm 분");
		return sdf.format(d);
	}
	
	public static void main(String[] args) {
		NowTime nt = new NowTime();
		System.out.println(nt.getTime());
	}
}
