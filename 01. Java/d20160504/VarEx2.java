package d20160504;

public class VarEx2 {
	//�ڹ��� ��� ������ �ݵ�� �ʱ�ȭ �ؼ� ����ؾ� �մϴ�.
	public static void main(String[] args) {
		//������ �����ϸ鼭 ���� ����
	 	byte b1 = 0; //(127���� ���� 128�� overflow)
	 	
	 	b1 = 10;
	 	byte b2 = 20;

	 	System.out.println(b1+b2);
		
	 	short sh1 = 150;
	 	//sh1 = b1;		//�Ͻ��� ����ȯ
	 	b1 = (byte)sh1; //����� ����ȯ
	 	
	 	System.out.println(b1);
	}
}
