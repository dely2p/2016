package d20160526;

import java.util.Random;

public class ExceptionEx1 {
// �����ϰ� 0���� 100������ �� ���	
	public static void main(String[] args) {
		// 1. Error : ġ���� ����
		// 2. Exception : ������ ����
		//		1. try~~catch : case by case ����
		//		2. ���� ����
		
		Random rnd = new Random();
		int a = 100;
		try{
			for(int i=0;i<100;i++){
				int b = rnd.nextInt(10); //0~9���� ���� ��ȯ 
				System.out.println("a/b : "+(a/b));
				System.out.println("������");
			}		
		}catch(ArithmeticException ae){ // �߻��� ������ ArithmeticException
			System.out.println("0���� �������� �����");
		}catch (Exception e) { // ���� �Ϳ��� Ŀ���� ������ ���ܸ� �� ��
			System.out.println("���� ���� ����");
			e.getStackTrace(); // ���ݱ��� stack�޸𸮸� ����
		}
		
	}
}
