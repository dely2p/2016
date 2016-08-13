package d20160527;

import java.util.Random;

public class ATMThread extends Thread{
	
	ATM atm;
	Random rnd = new Random();			// ���� ����
	
	public ATMThread(ATM atm) {
		this.atm = atm;					// ������
	}
	
	@Override
	public void run() {
		// �Ա������ �ݺ��ؼ� 10ȸ ����
		boolean flag = true;
		for(int i=0;i<10;i++){
			if(flag)					// flag�� ture��
				atm.deposit(rnd.nextInt(5)*1000);
			else						// false��
				atm.withdraw(rnd.nextInt(5)*1000);
			flag = !flag;				// flag�� t,f�� �����Ƽ� �������� �Ѵ�.
		}
	}
}
