package d20160525;
// ���ʸ�(�Ϲ�ȭ)
public class TestMain {
	public static void main(String[] args) {
		String[] str = {"�츮","����","����"};		
		// �� �迭�� ��������� �ϴ� GenEx1 Ŭ������ ����
		GenEx1<String> ge1 = new GenEx1<String>();	// String ��
		ge1.setArray(str);		
		// ���
		ge1.print();
		
		System.out.println("----------------");
		
		Integer[] m = {20,10,40,20,30};		
		GenEx1<Integer> ge2 = new GenEx1<Integer>(); // Integer ��
		ge2.setArray(m);
		ge2.print();
		
		System.out.println("----------------");
		Float[] f = {30.2f,33.3f,102.34f};
		GenEx1<Float> ge3 = new GenEx1<Float>();	// Float ��
		ge3.setArray(f);
		ge3.print();
		
		
	}
}
