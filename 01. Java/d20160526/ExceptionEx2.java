package d20160526;

public class ExceptionEx2 {
	public static int plus(String a, String b){
		int result=0;
		try{ // 예외처리
			result = Integer.parseInt(a)+Integer.parseInt(b);
		}catch(NumberFormatException nfe){ // 숫자형식 예외처리
			System.out.println("숫자형식이 아닙니다.");
			return -1;
		}catch(ArithmeticException ae){ // 0으로 나눴을 때 예외처리
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(Exception e){ // 더 큰 예외처리
			System.out.println("나도 몰라 예외");
		}finally { // 무조건 실행되는 코드 
			System.out.println("예외가 발생하던 하지 않던 반드시 실행되는 코드");
		}
		return result;
	}
	public static void main(String[] args) {
		String a = "100";
		String b = "30";
	
		System.out.println(plus(a,b)); // static method plus 호출
		
	}
}
