package d20160517;

public class PrintStar {
	int num;							// ������� ����
	String s;
	
	PrintStar(){						// �����ڿ���
		s = "*";						// String �� �ʱ�ȭ
	}
	PrintStar(int num){					// �Ű������� �ִ� �����ڿ���
		this();							// �⺻�������� ���� ȣ���ϰ�
		this.num = num;					// �Է¹޾ƿ� num ���� ����
	}
	
	void print(){						// method print
		for(int i=0;i<num;i++){			// 5���̰�
			for(int j=0;j<=i;j++){		// ������ ���� �� Ŭ ��
				System.out.print(s);	// �� ���
			}
			System.out.println();		// �� �� ��� 
		}
	}
	
}
