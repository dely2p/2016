package d20160519;

public class ȭ������ implements Weapon {

	int ����;													// �������
	
	ȭ������(){												// ������
		���� = 100;
	}
	
	@Override
	public void use() {										// use method
		if(����>10){
			����-=10;
			System.out.println("ȰȰ~~ Ÿ�ö��~~~ burn");
		}else{
			System.out.println("���� ����..");
		}
	}

	@Override
	public void reuse() {									// reuse method
		System.out.println(" ���� ������...");
		���� = 100;		
	}

	@Override
	public void drop() {									// drop method
		// TODO Auto-generated method stub
		
	}

	
	
	
}
