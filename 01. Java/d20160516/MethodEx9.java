package d20160516;

public class MethodEx9 {
	
	static String mergeWord(String ... arrs){						// ���� �Ű����� 
		String word = "";											// String ���� �� �ʱ�ȭ
		/*for(int i=0;i<arrs.length;i++){
			str += arrs[i];
		}*/
		
		// ���� for��, ������ for��
		// for(�ڷ��� ������ : �迭��){
		
		//}
		for(String x : arrs){										// ���� for���� �̿��ؼ� 
			word += x;												// ���ڿ��� ����
		}
		return word;												// ���� ���ڿ� return 
	}
	public static void main(String[] args) {				
		String str = mergeWord("������","������");						// mergeWord method ����
		System.out.println("str : "+str); 							// ������ ������ ���ڿ� ���
		System.out.println(mergeWord("����","�α�","����")); 			// ���ѹα����� ���ڿ� ���
		System.out.println(mergeWord("�ڹ�","����","�μ�","�޼���")); 		// �ڹٰ����μ��޼��� ���ڿ� ���
	}
}
