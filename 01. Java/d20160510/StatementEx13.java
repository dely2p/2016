package d20160510;
// break : ���� ����� �ݺ����� Ż��
// continue : �̹��� ����

// break �󺧸� : �󺧸��� ���� �ݺ����� Ż��
// continue �󺧸� : �󺧸��� ���� �ݺ����� �̹��� ����

public class StatementEx13 {
	public static void main(String[] args) {	
		outer: // ��
		for(int j=1;j<=3;j++){											// ���⼭����~~
			for(int i=1;i<=4;i++){										// 4�� �ݺ� ���� (for��) -> �������� i�� for���� ����� �����
				if(i==j) break outer;									// break�� �ƿ� ���� ���ϰ� Ż��, continue�� �̹��� ���� ����(���� ����for�� ������ Ż���̳� �ѹ����� ���ϱ� ����)
				System.out.println("j : " + j + "," + " i : "+ i);		// i,j���� �����	
			}
		}																// ~~~������� 3�� �ݺ�
		
		System.out.println("------------------");
		
		for(int j=1;j<=4;j++){											// 4x4 �����
			for(int i=1;i<=4;i++){										// ��,�� 4�� �ݺ��� ���
				System.out.print("*");									// �� ���
				if(i>=j) break;											// i(��)�� j(��)���� ũ�� break
			}
			System.out.println();										// �� �� ���
		}
	}
}
