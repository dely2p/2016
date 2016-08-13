package d20160526;

import java.util.Random;

import javax.swing.JButton;

public class Horse extends Thread{
	JButton jbtn;
	public Horse(JButton jbtn){
		this.jbtn = jbtn;
	}
	@Override
	public void run() {
		Random rnd = new Random();			// 랜덤
		for(int i=1;i<=300;i++){
			int x = jbtn.getX();			
			int y = jbtn.getY();
			x+=rnd.nextInt(10);				// 0~9까지 랜덤
			if(x>=1100){
				x=1100;
			}
			jbtn.setLocation(x,y);			// 위치 변경
			try {
				Thread.sleep(10);			// thread를 두어 느리게
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
