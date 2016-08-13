package d20160524;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilEx2 {
	public static void main(String[] args) {
		Date d = new Date();			// 날짜 뽑아내는 클래스 day 생성
		System.out.println("d : "+d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");	// format 생성
		System.out.println("sdf : "+sdf.format(d));	// format에 맞게 출력
	}
}
