package d20160519;

public class ���� extends Terran implements Flyable{
 
	int   ���ݷ�;												// �������  , ��������
	boolean isSteamPack;
	
	����(){													// ���� ������								
		// super();
		hp = 100;  x =0 ; y = 0;
		���ݷ� = 5; ���� = 3; 
		���ݼӵ� = 5; �̵��ӵ� = 4;
		�����Ÿ� = 5; �ܰ� = 50;
	}
	����(int hp){												// �Ű����� 1�� �ִ� ������
		// super();
		this.hp = hp;
		// �ڱ� �ڽ��� ����Ű�� ��������
		  this.x =0 ; y = 0;
		���ݷ� = 5; ���� = 3; 
		���ݼӵ� = 5; �̵��ӵ� = 4;
		�����Ÿ� = 5; �ܰ� = 50;
	}	
	
	@Override
	public void ����() {										// ���� method
		System.out.println("���ƶ� ����~~~~");
		
	}
	void ����(){												// ���� method
		System.out.println("�ѶѶѶѤ��ѶѶѶѶ�");
	}
	
	void ����(Terran t){										// Terran�� �ļ��̸� ��� ���ݰ���
		System.out.println("���� �Ű������� �ִ� �޼���");
		System.out.println("t : " + t);
		t.hp -= ���ݷ�;
		System.out.println("�ѶѶѶѤ��ѶѶѶѶ�");
	}


	void ������(){												// ������ method
		if(isSteamPack==false && hp > 5){					// isSteamPack�� false�� hp�� 5���� ũ��
			isSteamPack = true;								// isSteamPack�� true�� �ٲٰ�
			System.out.println("��~~~~ ���Ͷ� ������~~~ ");		// ���ڿ� ���
			���ݷ�+=3;											// ���ݷ� +3
			���ݼӵ� +=3;										// ���ݼӵ� +3
			hp -= 5;										// hp -5
		}		
	}		
}
