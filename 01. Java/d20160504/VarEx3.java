package d20160504;

public class VarEx3 {
	public static void main(String[] args) {
		//int ���� ũ���� �ڷ������� ������ ���� 
		//�ڵ����� int�� ����ȯ �Ѵ�.
		
		byte b1 = 10;
		byte b2 = 20;
		short sh1 = 30;
		
		int i = b1+b2;
		System.out.println("i : "+i);
		int sh2 = sh1 + b2;
		System.out.println("sh2 : "+sh2);
		
		int a = 200; //��� 200�� ����
		long c = 300L; //long�� ����� �ڿ� L�� ����		
		long d = a+c;
		System.out.println("d : "+ d);
		
		float f1 = 300.2f;		
		double d1 = 3090.20;
		double k1 = f1 + d1;
		
		System.out.println(k1);
		
	}
}
