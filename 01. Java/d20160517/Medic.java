package d20160517;

public class Medic 
{
	int ���ݼӵ�, HP, MP, �̵��ӵ�, ��Ÿ�, x, y;					// ������� ����
	String ����, �̸�;
	boolean isHeal;
	
	Medic()	{												// ������ -> ������� �ʱ�ȭ
		�̸� = "�������";
		���ݼӵ� = 3;
		���� = "��";
		HP = 80;
		MP = 80;
		�̵��ӵ� = 4;
		��Ÿ� = 2;
		x = 0;
		y = 0;
	}	
	
	Medic(int HP, int MP, int ��Ÿ�){ 						// (a=ü��, b=����, c=��Ÿ�) �Ű����� 3�� �ִ�  ������ 
	
		this();				// �⺻�����ڸ� ȣ��
		this.HP = HP;
		this.MP = MP;
		this.��Ÿ� = ��Ÿ�;	
	}
	Medic(int HP, int ��Ÿ�, String �̸�, int MP){ 			// �Ű����� 4�� �ִ� ������
		
		this(HP,MP,��Ÿ�);									// Medic(int HP, int MP, int ��Ÿ�) ������ ȣ��
		this.�̸� = �̸�;										// �̸� ���� �ʱ�ȭ

	}
	
		
	void ��(){												// �� method
		if(MP>10){											// mp�� 10���� ũ��
			MP -= 10;										// mp�� 10�� ����
			System.out.println("ġ�����Դϴ�.");					// ġ���� ���
		} else{												// �ƴϸ�
			System.out.println("������..������..");				// ������ ���� ���
		}
		
	}
	
	void ��������(){											// �������� method
		System.out.println("===��������===");
		System.out.println("�̸� = "+ �̸�);
		System.out.println("HP = " + HP);
		System.out.println("MP = " + MP);
		System.out.println("���� = "+ ����);
		System.out.println("�̵� �ӵ� = " + �̵��ӵ�);
		System.out.println("��Ÿ� = " + ��Ÿ�);	
		System.out.println("==========");
	}

}
