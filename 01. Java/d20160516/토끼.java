package d20160516;

public class �䳢 {
	String ��;						// �� ������� ����
	int ��, ��;
	
	�䳢(){							// �䳢 ������
		�� = "������";					// �ʱⰪ �Է�
		�� = 1;
		�� = 1;
	}
	�䳢(String color){				// �Ű������� 1�� �ִ� �䳢 ������
		�� = color;					// �Ű������� String���� ���� ���� ����
		�� = 1;
		�� = 1;
	}
	�䳢(String color, int nose){		// �Ű������� 2�� �ִ� �䳢 ������
		�� = color;					// �Ű������� String���� ���� ���� ����
		�� = nose;					// �Ű������� int ������ ���� ���� ����
		�� = 1;
	}
	
	void �䳢����(){					// �䳢 ���� ��� method
		System.out.println(��+", ��"+��+"��, �� "+��+"��");
	}
	void �Ա�(){						// �Ա� method
		System.out.println("�ȳȳȳȳ�~~");
	}
	void �޸���(){						// �޸��� method
		System.out.println("���ѱ���~~~");
	}
	void ����(String bob){			// ���� method
		System.out.println(bob+" �߰�! ����!!!!");
	}
}
