package d20160526;

public class ExceptionEx3 {
	public static int plus(String a, String b) throws NumberFormatException{ // �� �޼���� numberformat ������ �Ͼ �� ���� (���� ó�� ����)
		int result=0;
		result = Integer.parseInt(a)+Integer.parseInt(b);
		return result;
		//ctrl+d : ���� ����
	}
	public static void main(String[] args) {
		String a = "100";
		String b = "x";
		try{
			System.out.println(plus(a,b)); // static method plus ȣ��
		}catch(NumberFormatException nfe){
			System.out.println("�޷�");
		}
	}
}
