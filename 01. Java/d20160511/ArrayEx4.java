package d20160511;

public class ArrayEx4 {
	public static void main(String[] args) {
		// main method�� �迭 ����ϱ�
		
/*		System.out.println("args[0]"+args[0]);
		System.out.println("args[1]"+args[1]);*/
		
		
/*		char[] ch = new char[10];									// �� �ٸ� �迭 �����
		ch[0] = 'j';
		ch[1] = 'a';*/
		char[] ch = {'j','a','v','a',' ','w','o','r','l','d'};		// char�� ch�迭�� ���� �ʱ�ȭ��Ŵ
		
		for(int i=0;i<ch.length;i++)								// ch�� ���̸�ŭ �ݺ�����
			System.out.print(ch[i]);								// ch�迭 ���
		System.out.println();
		
		String str = "java world";									// String�� Ŭ������, ���������δ� �迭ó�� ó��
		System.out.println(str);									// str ���
	}
}
