package d20160524;

import java.util.Calendar;

public class UtilEx3 {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		//cal.set(2016, 4, 24);
		System.out.println(cal);
		
		// �� ~ ��
		// 1 ~ 7
		int d = cal.get(Calendar.DAY_OF_WEEK);// ���° �����ΰ�?
		System.out.println(d); // ȭ����
		
		//System.out.println("\t\t\t"+Calendar.DAY_OF_MONTH+"��");
		System.out.println("\t\t\t"+cal.get(Calendar.MONTH)+"��");
		System.out.println();
		System.out.println("��\t ��\t ȭ\t ��\t ��\t ��\t ��\t");
		System.out.println();
		int count = 0;
		for(int j=1;j<d;j++){			// �ش� ���� ���� �����ϴ� ������ �ٸ��Ƿ�
			System.out.print("\t");
			count++;					// count�� �ξ� ���� �д�.
		}
		for(int i=1;i<=31;i++){			// 31�ϱ��� ���
			count++;					// count �Ѵ�.
			System.out.print(i+"\t");
			if(count%7==0)				// 7�Ͼ� ������ ���
				System.out.println();
		}
		
		
		
	}
}
