package d20160517;

public class FormatData {
	int inum;									// ������� ����
	int[] arr;
	float fnum;
		
	void print(int inum){						// method print(int�� �Ű�����)
		this.inum = inum;						// �� ����
		System.out.println(inum);				// �� ���
	}
	void print(int[] arr){						// method print(int�� �迭 �Ű�����)
		this.arr = arr;							// �� ����
		System.out.print("[ ");
		for(int i=0;i<arr.length;i++)			// �迭 ���̸�ŭ �ݺ�
			System.out.print(arr[i]+" ");		// �迭 �� ���
		System.out.println(" ]");
	}
	void print(float fnum){						// method print(float�� �Ű�����)
		this.fnum = fnum;						// �� ����
		System.out.println(fnum);				// �� ���
	}
}
