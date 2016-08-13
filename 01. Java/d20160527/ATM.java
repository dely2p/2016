package d20160527;

public class ATM {
	String account;							// 멤버변수
	int balance;
	
	// 기본생성자
	ATM(){
		
	}
	// 매개변수 있는 생성자
	ATM(String account, int balace){
		this.account = account;
		this.balance = balance;
	}
	// setter, getter
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	// 입금
	public synchronized void deposit(int money){
		balance += money;
		System.out.println(money+"원 입금되었습니다.");
		System.out.println("잔액 : "+ balance + "입니다.");
	}
	// 동시에 서로 같이 작업하다보면 발생되는 문제
	// lock ==> sysnchronized
	
	
	
	// 출금
	public synchronized void withdraw(int money){ // Thread 하나가 다 쓸 때까지 lock 걸 수 있음 (동기화)
		if(balance >= money){
			balance -= money;
			System.out.println(money+"원 출금되었습니다.");
			
		}else{
			System.out.println("잔액이 부족합니다.");
		}
		System.out.println("잔액 : "+ balance + "입니다.");
	}
}
