package d20160526;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ball extends Thread{
	JButton jbtn;
	ImageIcon[] ic;
	int v;
	
	public Ball(JButton jbtn,ImageIcon[] ic, int v){		// ������
		this.jbtn = jbtn;
		for(int i=0;i<ic.length;i++)
			this.ic = ic;
		this.v = v;
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++)						// 100�� �ݺ�
		{
			Random rnd = new Random();				// ���� ����
			int b = (int)(rnd.nextInt(45));			// ���� ���� �ϳ��� �޾Ƽ�

			try {
				Thread.sleep(1000);					// 1���� �ֱ��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jbtn.setIcon(ic[b]);					// ��ư���� �̹����� ����Ѵ�.
		}
		jbtn.setIcon(ic[v]);
	}
	
}
