package d20160513;
//1. ������ 3����  2���� �迭�� ��� ��� �ϼ���   9�� 3��¥�� �迭 
public class StatementHw1 {
	public static void main(String[] args) {
		int[][] trd = new int[9][3];
		
		for(int i=0;i<trd.length;i++){			
				trd[i][0] = 3;							// trd�迭 ù��° ���� 3�� ����
				trd[i][1] = i+1;						// trd�迭 �ι�° ���� ����+1 ���� ����
				trd[i][2] = (i+1)*3;					// trd�迭 ����° ���� ���� �� ���� ���� ����
		}
		
		for(int i=0;i<trd.length;i++){					// trd�迭�� �ุŭ �ݺ�
			System.out.println(trd[i][0] + " * " + trd[i][1] + " = " + trd[i][2]);
														// ������ ���
		}
	}
}
