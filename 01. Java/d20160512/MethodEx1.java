package d20160512;

import java.util.Scanner;

public class MethodEx1 {
	static void prtStar(){							// prtStar ����
		// �����
		for(int i=0;i<5;i++){						// ����ڷκ��� �Է¹��� ����ŭ �� ���
			for(int j=0;j<=i;j++){					// ���� ���κ��� �۰� �� �ݺ�
				System.out.print("*");				// �� ���
			}
			System.out.println();					// �� �� ��� 
		} // for end
	} // prtStar() end
	
	static void prtHello(){							// prtHello ����
			System.out.println("�ȳ� �ڹ�");			// �ȳ� �ڹ� ���
	}
	public static void main(String[] args) {
	// ���� ���Ǵ� �ڵ��� �̸��� �ο��س��� �� : method
	// function
		prtStar();
		
		prtStar();									// prtStar method�� �����ϰ� ���ƿ�
		
		prtHello();									//  "�ȳ� �ڹ�" �޼����� ���
	}
}
