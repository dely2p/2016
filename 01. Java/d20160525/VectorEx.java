package d20160525;

import java.util.Stack;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector v = new Vector();	// ���������� �迭
		
		System.out.println(v.capacity()); // �⺻�����ڰ� 10ĭ �������
		System.out.println(v.size()); // �� �� ����� 
		
		v.add("����");	// String str = "����"; Object o = str;
		v.add("������");
		v.add("���");
		v.add("����");
		v.add("��");
		v.add("����");		// �ߺ��ǵ� ������� �� ��
		v.add("����");
		v.add("����");
		v.add("����");		
		v.add("����");
		v.add("����");		// 10�� �̻��̸� �ڵ����� �þ
		
		System.out.println("v : "+v);
		
/*		System.out.println(v.capacity()); // �⺻�����ڰ� 10ĭ �������
		System.out.println(v.size()); // �� �� ����� (�迭�� length)
*/
		
		// vector : ���� ������ Object �迭
		for(int i=0;i<v.size();i++){
			Object obj = v.get(i);		// vector�� i��° ���� obj�� ���,
			String str = (String)obj;	// obj�� str�� ����(heap�� string������ ����Ȱ�)
			System.out.println(str.substring(0, 1));	// �ѱ��� �̾Ƴ��� ���
			System.out.println("obj[0] : "+ obj.toString()); // obj.toString() ���
		}
		///////////////////////////////////////////////////////////
		/*Object obj3 = new Object();
		System.out.println(obj3);
		System.out.println(obj3.toString()); // ���������δ� �̷��� ����
		
		String str = new String("java");
		System.out.println(str);
		System.out.println(str.toString()); // object�� �ִ� �� string�� �������̵� �ϱ� ������ 
		*/
		
	}

}
