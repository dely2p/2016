package d20160516;

import java.util.Arrays;

public class TestMain2 {
	public static void main(String[] args) {
		Person p = new Person();						// ������ ȣ��
		p.�̸� = "������";									// p.�̸� �ʱ�ȭ
		p.���� = 19;										// p.���� �ʱ�ȭ
		p.Ű = 180.0f;									// p.Ű �ʱ�ȭ
		p.������ = 41.0f;									// p.������ �ʱ�ȭ
		System.out.println(p.�̸�);						// �̸� ���
		
		System.out.println("=====================");
		Person p2 = new Person(900, "���");				// ��������� �ʱ�ȭ�� �����ϰ� �� �� ����
		
		System.out.println(p2.����);						// p2.���� ���
		System.out.println(p2.�̸�);						// p2.�̸� ���
		System.out.println(p2.����);						// null��
		
		
		
		// ���� 
/*		int[] m = {1232,5146,8215,1056,2435};
		Arrays.sort(m);
		for(int x : m){
			System.out.print(x+ "\t");
		}*/
		
	}
}
