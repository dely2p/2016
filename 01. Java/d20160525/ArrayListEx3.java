package d20160525;

import java.util.ArrayList;

public class ArrayListEx3 {
	public static void main(String[] args) {
		// String ��ü�� ���� �� �ִ� ���� ���� ������ �迭
		// ���ʸ�(�Ϲ�ȭ)
		ArrayList<String> list = new ArrayList<String>();	// ArrayList ����
		
		list.add("����");		// �� �߰�
		int a = 30;
		Integer it = a;
		//list.add(it);
		list.add("����");
		
		System.out.println(list);
		
		// ArrayList �ȿ� �ִ� �� ������ ����ϱ�
		for(int i=0;i<list.size();i++){
			Object obj = list.get(i);
			String str = (String)obj;
			System.out.println(str.substring(0,1)); // runtime�� ����			
		}
	}
}
