package d20160519;

public class Gun implements Weapon{				// �߻�Ŭ���� ��üȭ ��
	
	int MAX_BULLET = 8;						
	int bullet;

	Gun(){										// ������
		bullet = MAX_BULLET;					// �Ѿ˿� max�� �����
	}
	public void �߻�(){							// �߻� method

	}
	public void ������(){							// ������ method

	}
	@Override
	public void use() {							// �߻� method ��üȭ
		if(bullet>0){							// �Ѿ��� 0���� ũ��
			System.out.println("����~~����~~");	// ���� ���ڿ� ���
			bullet --;							// �Ѿ�--
		}else{									// 0���� ������
			System.out.println("ƽ~~");			// �ȳ���
		}		
	}
	@Override
	public void reuse() {						// �߻� method ��üȭ
		System.out.println("reload");
		bullet = MAX_BULLET;
		
	}
	@Override
	public void drop() {						// �߻� method ��üȭ
		// TODO Auto-generated method stub
		
	}
}
