package d20160527;

public class ATM {
	String account;							// �������
	int balance;
	
	// �⺻������
	ATM(){
		
	}
	// �Ű����� �ִ� ������
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
	// �Ա�
	public synchronized void deposit(int money){
		balance += money;
		System.out.println(money+"�� �ԱݵǾ����ϴ�.");
		System.out.println("�ܾ� : "+ balance + "�Դϴ�.");
	}
	// ���ÿ� ���� ���� �۾��ϴٺ��� �߻��Ǵ� ����
	// lock ==> sysnchronized
	
	
	
	// ���
	public synchronized void withdraw(int money){ // Thread �ϳ��� �� �� ������ lock �� �� ���� (����ȭ)
		if(balance >= money){
			balance -= money;
			System.out.println(money+"�� ��ݵǾ����ϴ�.");
			
		}else{
			System.out.println("�ܾ��� �����մϴ�.");
		}
		System.out.println("�ܾ� : "+ balance + "�Դϴ�.");
	}
}
