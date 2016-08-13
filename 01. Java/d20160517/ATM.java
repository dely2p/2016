package d20160517;

public class ATM {
	private String account;										// 멤버변수 계좌명 선언
	// 접근지정자, 접근한정자, 접근수정자
	private int balance;										// 멤버변수 잔액 선언
	
	// account 변수에 private로 변경
	// setter, getter 추가	
	public void setAccount(String a){							// account setter
		account = a;											// account 에 받아온 String 대입
	}
	public String getAccout(){									// account getter
		return account;											// account String return 
	}
	
	// balance 변수에 private로 변경
	// setter, getter 추가	
	public void setBalance(int b){								// balance setter
		balance = b;											// balance에 받아온 값 대입
	}
	public int getBalance(){									// balance getter
		return balance;											// balance int 값 return 
		
	}
	// 입금
	public void deposit(int money){								// 입금 method
		balance += money;										// 잔액에 입금금액을 더해준다.
		System.out.println(money+"원 입금되었습니다.");				// 입금액 출력
		System.out.println("현재 잔액은 "+balance+"원 입니다.");			// 잔액 출력
	}
	// 출금
	public void withDraw(int money){							// 출금 method
		if(money>balance)										// 출금액이 잔액보다 크면
			System.out.println("잔액이 부족합니다.");					// 잔액 부족이라는 문자열 출력
		else{													// 그렇지 않으면
			balance -= money;									// 잔액에 출금금액을 빼준다.
			System.out.println(money+"원 출금되었습니다.");			// 출금액 출력
		}
		System.out.println("현재 잔약은 "+balance+"원 입니다.");			// 잔액 출력	
	}
}
