package d20160517;

public class ATM {
	private String account;										// ������� ���¸� ����
	// ����������, ����������, ���ټ�����
	private int balance;										// ������� �ܾ� ����
	
	// account ������ private�� ����
	// setter, getter �߰�	
	public void setAccount(String a){							// account setter
		account = a;											// account �� �޾ƿ� String ����
	}
	public String getAccout(){									// account getter
		return account;											// account String return 
	}
	
	// balance ������ private�� ����
	// setter, getter �߰�	
	public void setBalance(int b){								// balance setter
		balance = b;											// balance�� �޾ƿ� �� ����
	}
	public int getBalance(){									// balance getter
		return balance;											// balance int �� return 
		
	}
	// �Ա�
	public void deposit(int money){								// �Ա� method
		balance += money;										// �ܾ׿� �Աݱݾ��� �����ش�.
		System.out.println(money+"�� �ԱݵǾ����ϴ�.");				// �Աݾ� ���
		System.out.println("���� �ܾ��� "+balance+"�� �Դϴ�.");			// �ܾ� ���
	}
	// ���
	public void withDraw(int money){							// ��� method
		if(money>balance)										// ��ݾ��� �ܾ׺��� ũ��
			System.out.println("�ܾ��� �����մϴ�.");					// �ܾ� �����̶�� ���ڿ� ���
		else{													// �׷��� ������
			balance -= money;									// �ܾ׿� ��ݱݾ��� ���ش�.
			System.out.println(money+"�� ��ݵǾ����ϴ�.");			// ��ݾ� ���
		}
		System.out.println("���� �ܾ��� "+balance+"�� �Դϴ�.");			// �ܾ� ���	
	}
}
