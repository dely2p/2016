package d20160520;

// API (Application Programming Interface)
import java.awt.Frame;
// �ڹپ��� ���� ���Ǵ� Ŭ������
// java.lang ��Ű���� ����
// ��������
//import java.lang.*;


public class MyWin extends Frame{
	public MyWin(){
		super("���� ���� ������");					// �θ�(Frame)�� �⺻������
		setVisible(true); 			// ȭ�鿡 ���̰� ����
		setSize(400, 300); 			// â�� ũ�⸦ ����(�ʺ�:400, ����:300)
		setLocation(300, 300);		// â�� ��ġ �̵�
		//Ÿ��Ʋ �ֱ�
		setTitle("���� ���� ������");
		//super("�������� ������")�� �����ϰ� �����
		
		
	}
}
