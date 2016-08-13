package d20160517;

public class ATMUser {
	public static void main(String[] args) {
		ATM a = new ATM();								// ATM 클래스 생성
		//a.balance = 999999999;						// 접근금지
		a.setBalance(9999); 							// 캡슐화로 set
		a.deposit(100000);								// 입금할 금액을 넣은 deposit method 실행
		a.withDraw(130000);								// 출금할 금액을 넣은 withDraw method 실행
	}
}
