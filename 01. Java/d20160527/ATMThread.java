package d20160527;

import java.util.Random;

public class ATMThread extends Thread{
	
	ATM atm;
	Random rnd = new Random();			// 랜덤 생성
	
	public ATMThread(ATM atm) {
		this.atm = atm;					// 생성자
	}
	
	@Override
	public void run() {
		// 입금출금을 반복해서 10회 실행
		boolean flag = true;
		for(int i=0;i<10;i++){
			if(flag)					// flag가 ture면
				atm.deposit(rnd.nextInt(5)*1000);
			else						// false면
				atm.withdraw(rnd.nextInt(5)*1000);
			flag = !flag;				// flag가 t,f를 번갈아서 나오도록 한다.
		}
	}
}
