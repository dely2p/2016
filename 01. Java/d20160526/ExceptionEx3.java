package d20160526;

public class ExceptionEx3 {
	public static int plus(String a, String b) throws NumberFormatException{ // 이 메서드는 numberformat 에러가 일어날 수 있음 (에러 처리 전가)
		int result=0;
		result = Integer.parseInt(a)+Integer.parseInt(b);
		return result;
		//ctrl+d : 한줄 삭제
	}
	public static void main(String[] args) {
		String a = "100";
		String b = "x";
		try{
			System.out.println(plus(a,b)); // static method plus 호출
		}catch(NumberFormatException nfe){
			System.out.println("메롱");
		}
	}
}
