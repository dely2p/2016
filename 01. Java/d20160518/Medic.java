package d20160518;

public class Medic extends Terran{

	String ����, �̸�;									// �������
	boolean isHeal;
	
	Medic() {										// ������
		�̸� = "�������";
		���ݼӵ� = 3;
		���� = "��";
		hp = 80;
		mp = 80;
		�̵��ӵ� = 4;
		�����Ÿ� = 2;
		x = 0;
		y = 0;
	}
	
	Medic(int  HP, int MP , int �����Ÿ�){				// �Ű������� 3���� ������
	// �⺻�����ڸ� ȣ���� 
		this();
		this.hp = HP;
		this.mp= MP;
		this.�����Ÿ� = �����Ÿ�;
	}
	// hp, ��Ÿ� ,  �̸� , mp
	Medic(int hp, int �����Ÿ�, String �̸�, int mp){	// �Ű������� 4���� ������
		this(hp,mp,�����Ÿ�);
		this.�̸� = �̸�;

	}
	
	void ��(Terran t) {								// �� method(�׶��� ��� �ļ� ġ�� ����)
		if (t.mp > 10) {							// mp�� 10���� ũ�� 
			t.mp -= 10;								// mp -10
			System.out.println("ġ�����Դϴ�.");			// ġ��
		} else {									// 10���� ������
			System.out.println("������..������..");		// ���� ���� ���
		}

	}

	
	

}
