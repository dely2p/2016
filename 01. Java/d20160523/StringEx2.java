package d20160523;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "java oracle";
		
		char ch = str.charAt(3);				// �ش� ��ġ�� ���� �̾Ƴ�
		System.out.println("ch : "+ch);
		
		String str2 = "������";
		System.out.println(str.concat(str2)); 	// ���ڿ��� ���̴� method
		
		String s1 = "��";						// String ������ �ʱ�ȭ
		String s2 = "ȭ";
		String s3 = "��";
		String s4 = "��";
		String s5 = "��";
		String s6 = "��";
		String s7 = "��";
		
		// �� ȭ �� �� �� �� ��
		String[] sstr = {s1,s2,s3,s4,s5,s6,s7};			// sstr�� �� �ʱ�ȭ
		
		for(int i=0;i<sstr.length;i++)					
			System.out.print(sstr[i].concat(" "));		// concat�� �̿��ؼ� �ϳ��� ���
		
		// method chain
		System.out.println(
				s1.concat(s2)
				.concat(s3)
				.concat(s4)
				.concat(s5)
				.concat(s6)
				.concat(s7));
		System.out.println();
		String t = str.concat(str2);					// str�� str2�� ����
		System.out.println("t : " +t);					// ���
		// contains(���ڿ�) :
		// �ش� ���ڿ��� �����ϸ� t, �ƴϸ� false ����
		System.out.println(str.contains("java"));		// �ش簪�� ���ԵǾ��ִ��� boolean���� return����
		
		if(str.equalsIgnoreCase("JAVA ORACLE"));			// ��ҹ��ڸ� �����ϰ� ������ ������?
			System.out.println("��ҹ��� �����ϰ� ������ ����");
		// r�̶�� ���ڰ� ���° ��ġ���� ��ȯ�ϴ� �޼���
		System.out.println(str.indexOf('r')); // 6
	
		// ���ڿ��� �κ����� : 2������ 6��������
		System.out.println(str.substring(2, 6)); // va o
		
		char[] chArray = str.toCharArray();
		// �Ѱ��� ������ ���
		// ���� for�� ���
		
		for (char c : chArray) {		// ���� for��
			System.out.println(c);
		}
		// int���� String���� �ٲ��ش�.
		int a = 20;
		String value = String.valueOf(a);		// int���� String���� ����ȯ
		System.out.println(value);
		System.out.println("-------------------------------");
		
		String email = "dagda@hanafos.com";
		
		// id@���ϼ���
		// id�����ؼ� ���
		System.out.println(email.substring(0, email.indexOf('@')));
		// 0���� @������(id) ����ϱ�
		String txt = "������,������,������,ȭ����";
		// ,�� �������� �ɰ��� ���
		// ������
		// ������
		// ������
		// ȭ����
		
		String[] d = txt.split(",");	// ,�������� �߶�
		for(String x : d){				// ���� for������ 
			System.out.println(x);		// �迭�� ��� �� ���
		}
		
	}
	
}
