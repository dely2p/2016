package d20160525;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("�Ե�");
		hs.add("����");
		hs.add("���ӳø�");
		hs.add("�ø�");
		hs.add("����"); // �ߺ�����ȿ�� ����
		hs.add("����");
		hs.add("����");
		hs.add("����");
		
		System.out.println("hs : "+hs);	// ���
		
		Iterator<String> it = hs.iterator();  // HashSet�� �ϳ��� ����
		
		while(it.hasNext()){	// �������� ������ true, �ƴϸ� false		
			String data = it.next();
			System.out.println(data);
			if(data=="����")
				it.remove();	// ���� �����
		}		
		
		System.out.println("hs : "+hs);	// ���
		
		
		
		// ����
	}
}
