package d20160517;

import java.util.Scanner;

public class StatementHw5 {
	
	static int maxsort(int[] m){						// maxsort method
		int maxid=0,maxval=0;							// max ���� �ε���, max ���� ���� int ���� �� �ʱ�ȭ
		for(int i=0;i<m.length;i++){					// �迭 ���̸�ŭ �ݺ��ϸ鼭
				if(maxval<m[i]){						// max���� ã��, 
					maxid = i;							// maxid�� max�� �ε��� ����
					maxval = m[i];						// maxval�� �� �迭���� ���Ͽ� ��Ե� max�� �����Ѵ�.
				}
		}			
		return maxid;									// max id�� ����Ѵ�.
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			// �Է¹ޱ����ؼ� Scanner ���
		int[] vals = new int[10];						// �迭 m����
		int mnum;										// max���� ���� int��  ����
		
		for(int i=0;i<10;i++){							// �迭�� 10�� �����鼭
			System.out.print("����"+(i+1)+"�Է� : ");		// �迭 ���� �Է¹���
			vals[i] = sc.nextInt();						// �Է¹޾Ƽ� �� vals�� ����
		}
		
		mnum = maxsort(vals);							// maxsort method�� ������ �� return ���� mnum�� ����
		
		for(int i=0;i<10;i++){						
			System.out.print(vals[i]+" ");				// �迭 �� ���
		}
		System.out.println();
		System.out.println("���� ū �� : "+vals[mnum]);		// ���� ū �� ���
		System.out.println("�� ��° �Է� ��  : "+(mnum+1));		// ���� ū ���� �ε��� ���
	}
}
