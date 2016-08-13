package d20160526;

public class ExceptionEx2 {
	public static int plus(String a, String b){
		int result=0;
		try{ // ����ó��
			result = Integer.parseInt(a)+Integer.parseInt(b);
		}catch(NumberFormatException nfe){ // �������� ����ó��
			System.out.println("���������� �ƴմϴ�.");
			return -1;
		}catch(ArithmeticException ae){ // 0���� ������ �� ����ó��
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(Exception e){ // �� ū ����ó��
			System.out.println("���� ���� ����");
		}finally { // ������ ����Ǵ� �ڵ� 
			System.out.println("���ܰ� �߻��ϴ� ���� �ʴ� �ݵ�� ����Ǵ� �ڵ�");
		}
		return result;
	}
	public static void main(String[] args) {
		String a = "100";
		String b = "30";
	
		System.out.println(plus(a,b)); // static method plus ȣ��
		
	}
}
