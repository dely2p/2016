package d20160526;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ball2 extends Thread{
	JButton jbtn;
	ImageIcon[] ic;
	int v;
	
	public Ball2(JButton jbtn,ImageIcon[] ic, int v){	// ������
		this.jbtn = jbtn;
		for(int i=0;i<ic.length;i++)
			this.ic = ic;
		this.v = v;
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++)
		{
			Random rnd = new Random();			// ���� ����
			int b = (int)(rnd.nextInt(45));		// ���� ������ �ϳ��� �̾Ƴ�

			try {
				Thread.sleep((int)(Math.random()*500));		// �ֱ⸦ �� thread���� �������� ������.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jbtn.setIcon(ic[b]);						// �������� �ʱ⿡ ������.
		}	
		jbtn.setIcon(ic[v]);							// �������� ���õ� ������ �����ش�.
	}
	
}
