package d20160518;

public class SiegeTank extends Terran {
	int		���ݷ�;							// �������
	boolean	siegeMod;

	SiegeTank() {							// �⺻������
		hp = 150;
		x = 0;
		y = 0;
		���ݷ� = 30;
		���ݼӵ� = 1;
		�̵��ӵ� = 2;
		���� = 1;
		�����Ÿ� = 3;
		�ܰ� = 150;
	}

	void siegeMode() {						// ���� ��� method
		if (!siegeMod) {					// �������
			���ݷ� = 70;						// ���ݷ� -70
			�����Ÿ� = 5;						// �����Ÿ��� 5
		}
		else {								// ������ �ƴϸ�
			���ݷ� = 30;						// ���ݷ� 30
			�����Ÿ� = 3;						// �����Ÿ� 3
		}
	}

	void ����(Terran t) {						// ���� method
		t.hp -= ���ݷ�;						// ���ݷ¸�ŭ ����
	}

}
