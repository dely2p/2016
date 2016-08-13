package d20160524;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Robot4 extends Frame implements KeyListener{
	Button[] btn;
	Button u;
	int key;

	
	Robot4(){
		btn = new Button[6];
		u = new Button();
		for(int i=0;i<btn.length;i++){
			btn[i] = new Button();
		}
				
		setBounds(200, 50, 1000, 800);
		setLayout(null);
		setTitle("Contol");
		btn[0].setBounds(100, 100, 100, 50);
		btn[1].setBounds(100, 170, 100, 100);
		btn[2].setBounds(50, 170, 40, 30);
		btn[3].setBounds(210, 170, 40, 30);
		btn[4].setBounds(100, 300, 40, 50);
		btn[5].setBounds(160, 300, 40, 50);
		u.setBounds(377,150,200,400);
		
		for(int i=0;i<btn.length;i++){
			btn[i].setBackground(Color.yellow);
			btn[i].addKeyListener(this);
	
			add(btn[i]);
			add(u);
		}
		setVisible(true);
		
		// 창 종료
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new Robot4();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i=0;i<btn.length;i++){
			int x = btn[i].getX();
			int y = btn[i].getY();
			if(key==37) // 왼쪽
				x-=3;
			if(key==38) // 위쪽
				y-=3;
			if(key==39) // 오른쪽
				x+=3;
			if(key==40) // 아래
				y+=3;
			btn[i].setLocation(x, y);
		}			
					
		if(key==88){ // x 누르면 오른쪽 팔로 권투
			int rhx = btn[3].getX();
			int rhy = btn[3].getY();
			
			for(int i=0;i<130;i++){
				rhx+=1;
				btn[3].setLocation(rhx, rhy);
				if(btn[3].getX() >= 340) // 장애물에 오른팔이 닫으면 장애물 날아감
					u.setLocation(1000, 1000);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			for(int i=0;i<130;i++){
				rhx-=1;
				btn[3].setLocation(rhx, rhy);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
		if(key==32){ // space 누르면 jump
			// 포물선 : x^2 = 4py
			for(int j=0;j<50;j++){
				for(int i=0;i<btn.length;i++){
					double x = btn[i].getX();
					double y = btn[i].getY();
						y-=1;
						x+=1;
						//x+=((Math.sqrt((double)y-1))-1); // 포물선을 만들려고 했지만 실패..ㅠ
						try {
							Thread.sleep(5);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						btn[i].setLocation((int)x, (int)y);
						System.out.println(x+" , "+y );
				}
				
			}
			for(int j=0;j<50;j++){
				for(int i=0;i<btn.length;i++){
					double x = btn[i].getX();
					double y = btn[i].getY();
						y+=1;
						x+=1;
						//x+=2*((Math.sqrt((double)y))-1); // 포물선을 만들려고 했지만 실패..ㅠ
						try {
							Thread.sleep(5);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						btn[i].setLocation((int)x, (int)y);
						System.out.println(x+" , "+y );
				}				
			}
		}
		if(key==89){ // y 누르면 5단분리 후 복귀
			for(int j=0;j<50;j++){
				for(int i=0;i<btn.length;i++){
					System.out.println(key);
					int x = btn[i].getX();
					int y = btn[i].getY();
					int[] rox = new int[6];
					int[] roy = new int[6];
					if(i==0){ // 머리
						rox[0] = x;
						roy[0] = y;
						roy[0]-=1;
					}
					if(i==1){ // 몸통
						rox[1] = x;
						roy[1] = y;
					}
					if(i==2){ // 왼팔
						rox[2] = x;
						roy[2] = y;
						rox[2]-=1;
					}
					if(i==3){ // 오른팔
						rox[3] = x;
						roy[3] = y;
						rox[3]+=1;
					}
					if(i==4){ // 왼발
						rox[4] = x;
						roy[4] = y;
						roy[4]+=1;
					}
					if(i==5){ // 오른발
						rox[5] = x;
						roy[5] = y;
						roy[5]+=1;
					}
					btn[i].setLocation(rox[i], roy[i]);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			for(int j=0;j<50;j++){
				for(int i=0;i<btn.length;i++){
					System.out.println(key);
					int x = btn[i].getX();
					int y = btn[i].getY();
					int[] rox = new int[6];
					int[] roy = new int[6];
					if(i==0){ // 머리
						rox[0] = x;
						roy[0] = y;
						roy[0]+=1;
					}
					if(i==1){
						rox[1] = x;
						roy[1] = y;
					}
					if(i==2){ // 왼팔
						rox[2] = x;
						roy[2] = y;
						rox[2]+=1;
					}
					if(i==3){ 
						rox[3] = x;
						roy[3] = y;
						rox[3]-=1;
					}
					if(i==4){
						rox[4] = x;
						roy[4] = y;
						roy[4]-=1;
					}
					if(i==5){
						rox[5] = x;
						roy[5] = y;
						roy[5]-=1;
					}
					btn[i].setLocation(rox[i], roy[i]);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
}
