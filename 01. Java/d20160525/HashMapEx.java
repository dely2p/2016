package d20160525;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("����", "���ֶ�");
		hm.put("�ι���", "������׻��");
		hm.put("��", "�ٴ�");
		hm.put("ġŲ", "����"); // key�� �ߺ��� �� ����
		hm.put("ġŲ", "����");
		hm.put("ġŲ", "�ҹ���");
		hm.put("����", "���ɸ�");
		hm.put("����Ƣ��", "����");
		
		System.out.println(hm);
		
		String data = hm.get("����");
		System.out.println(data);
		
		// Ű ������ 
		Set<String> key = hm.keySet(); // key���� Set���� �Ѱ���
		
		// iterator �� ������
		
		Iterator<String> it = key.iterator();
		while(it.hasNext()){
			String value = it.next();
			System.out.println(value + " : " + hm.get(value));
		}
		
	}
}
