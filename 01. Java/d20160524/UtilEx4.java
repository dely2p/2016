package d20160524;

import java.util.Calendar;

public class UtilEx4 {
	public static void main(String[] args) {
		// static ����, static method��
		// instanceȭ ���� �ʰ��� �ٷ� ����� ����
			
		Calendar cal = Calendar.getInstance();		// �޷� ������
		int year = cal.get(Calendar.YEAR);			// ������� ������
		System.out.println("���ش� "+year+"�� �Դϴ�.");
		int month = cal.get(Calendar.MONTH)+1;		// �� ������
		System.out.println("������ "+month+"�� �Դϴ�.");
		int day = cal.get(Calendar.DAY_OF_MONTH);	// �� ������
		System.out.println("������ "+day+"�� �Դϴ�.");
	}
}