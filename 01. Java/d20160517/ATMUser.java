package d20160517;

public class ATMUser {
	public static void main(String[] args) {
		ATM a = new ATM();								// ATM Ŭ���� ����
		//a.balance = 999999999;						// ���ٱ���
		a.setBalance(9999); 							// ĸ��ȭ�� set
		a.deposit(100000);								// �Ա��� �ݾ��� ���� deposit method ����
		a.withDraw(130000);								// ����� �ݾ��� ���� withDraw method ����
	}
}
