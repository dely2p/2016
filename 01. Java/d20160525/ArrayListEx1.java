package d20160525;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();		// ArrayList ����
		
		al.add("����");				// ArrayList�� �߰�
		al.add("�ٳ���");
		al.add("����");
		al.add("����");
		al.add("����");
		al.add("����");
		al.add("����");
		al.add("����");
		al.add("����");
		al.add("����");
		al.add("����");
		al.add("����");
		System.out.println("ArrayList : "+al);
		
		
		for(int i=0;i<al.size();i++){		// ArrayList ���� ���
			System.out.println(al.get(i));
		}
	}
}
