package d20160524;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilEx2 {
	public static void main(String[] args) {
		Date d = new Date();			// ��¥ �̾Ƴ��� Ŭ���� day ����
		System.out.println("d : "+d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");	// format ����
		System.out.println("sdf : "+sdf.format(d));	// format�� �°� ���
	}
}
