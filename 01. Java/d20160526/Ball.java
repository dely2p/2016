package d20160526;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ball extends Thread{
	JButton jbtn;
	ImageIcon[] ic;
	int v;
	
	public Ball(JButton jbtn,ImageIcon[] ic, int v){		// 생성자
		this.jbtn = jbtn;
		for(int i=0;i<ic.length;i++)
			this.ic = ic;
		this.v = v;
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++)						// 100번 반복
		{
			Random rnd = new Random();				// 랜덤 생성
			int b = (int)(rnd.nextInt(45));			// 랜덤 값을 하나씩 받아서

			try {
				Thread.sleep(1000);					// 1초의 주기로
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jbtn.setIcon(ic[b]);					// 버튼위에 이미지를 출력한다.
		}
		jbtn.setIcon(ic[v]);
	}
	
}
