package d20160523;

public class StringBufferEx {
	public static void main(String[] args) {
		String str = "Hello java World";
		// �Ųٷ� ����ϱ�
		char[] s = str.toCharArray();			// ���ڿ��� ���ڷ� �ٲ㼭 �迭�� ����
		StringBuffer sb1 = new StringBuffer(str);	
		System.out.println(sb1.reverse());		// StringBuffer�� �̿��� ������ ���
		for(int i=s.length-1;i>=0;i--){			// ���ٷ� ���
			System.out.print(s[i]);
		}
		System.out.println();					
		
		StringBuffer sb = new StringBuffer();	// StringBuffer ����
		
		sb.append("SELECT empno, ename, sal ");	// ������ �̾ ������ �� ����
		sb.append("FROM emp ");
		sb.append("Where empno = 7788;");
		
		System.out.println(sb);					// ���
		System.out.println(sb.reverse());		// �Ųٷ� ���
	}
	
}
