package d20160526;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ball2 extends Thread{
	JButton jbtn;
	ImageIcon[] ic;
	int v;
	
	public Ball2(JButton jbtn,ImageIcon[] ic, int v){	// 생성자
		this.jbtn = jbtn;
		for(int i=0;i<ic.length;i++)
			this.ic = ic;
		this.v = v;
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++)
		{
			Random rnd = new Random();			// 랜덤 생성
			int b = (int)(rnd.nextInt(45));		// 랜덤 값으로 하나씩 뽑아냄

			try {
				Thread.sleep((int)(Math.random()*500));		// 주기를 각 thread마다 랜덤으로 돌린다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jbtn.setIcon(ic[b]);						// 랜덤으로 초기에 돌린다.
		}	
		jbtn.setIcon(ic[v]);							// 랜덤으로 선택된 값들을 보여준다.
	}
	
}
