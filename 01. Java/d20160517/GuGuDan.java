package d20160517;

public class GuGuDan {			
	int dan;												// ������� dan ����
	
	GuGuDan(){												// ������ ������
		dan = 2;											// dan�� 2 ����(�⺻������)
	}
	GuGuDan(int dan){										// �Ű������� �ִ� ������ ������
		this.dan = dan;										// �������� �� ���������� �������� �Է�
	}
	
	void print(){											// ��� method
		// 1. for�� ���		
		for(int i=1;i<=9;i++)								// 9�� �ݺ� �����ϸ�
			//System.out.println(dan+" * "+i+" = "+dan*i);	// ������ ���
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);// printf ��밡�� 
								
	}
}
