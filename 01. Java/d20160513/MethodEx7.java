package d20160513;

public class MethodEx7 {
	
	static int maxMethod(int[] m){
		int result = 0;								// ���� ū ���� ���� result ���� �� 0���� �ʱ�ȭ
		for(int i=0;i<m.length;i++){				// �迭�� ũ�⸸ŭ �ݺ��ϸ�
			if(m[i]>result){						// �� �迭���� result���� ���ؼ� �迭���� ũ��
				result = m[i];						// �� �迭�� ���� result�� �����Ѵ�. 
			}
		}
		return result;								// �ִ밪 return 
	}
	public static void main(String[] args) {
		int[] m = {200,900,2000,140,299,500};		// �迭 m�� �� �ʱ�ȭ
		System.out.println("����ū�� ����ϱ�");			// ���ڿ� ���
		
		System.out.println(maxMethod(m));			// �ִ밪 ���
		
		
	}
}
