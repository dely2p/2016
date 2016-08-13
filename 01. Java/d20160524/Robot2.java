package d20160524;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class Robot2 extends Frame implements KeyListener,MouseMotionListener{
	Button[] btn;
	Button u;
	int key;
	
	
	Robot2(){
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
			btn[i].addMouseMotionListener(this);
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
		new Robot2();
	}
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyPressed(KeyEvent e) { // 키보드 누를 때
		int x;
		int y;
		key = e.getKeyCode();
		System.out.println("key : "+key);
		for(int j=0;j<btn.length;j++){
			x = btn[j].getX();
			y = btn[j].getY();
			System.out.println("x : "+x+"y : "+y);
			
			if(key==37)
				x-=3;
			if(key==38)
				y-=3;
			if(key==39)
				x+=3;
			if(key==40)
				y+=3;
			btn[j].setLocation(x, y);
		}
		if(key==89){
			// 머리, 팔다리 나갔다가 들어오기
		}
			if(key==88){
				int shotx = btn[3].getX();
				int shoty = btn[3].getY();
				for(int k=0;k<130;k++){
					shotx+=1;
					btn[3].setLocation(shotx, shoty);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println(shotx);
					if(btn[3].getX() >= 340)
						u.setLocation(1000, 1000);
				}
				for(int k=0;k<130;k++){
					shotx-=1;
					btn[3].setLocation(shotx, shoty);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				Color c = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
				btn[3].setBackground(c);
			}
			if(key==32){ // 스페이스 누르면 점프
			//+= sin(Angle * 3.14 / 180) + Power - ( 0.98 * Time * Time) / 2
				
				for(int i=0;i<50;i++){
					for(int j=0;j<btn.length;j++){
						x = btn[j].getX();
						y = btn[j].getY();
						System.out.println("x : "+x+"y : "+y);
						
						x+=1;
						y-=1;
						btn[j].setLocation(x, y);			
						try {
							Thread.sleep(2);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				for(int i=0;i<50;i++){
					for(int j=0;j<btn.length;j++){
						x = btn[j].getX();
						y = btn[j].getY();
						//System.out.println("x : "+x+"y : "+y);
						x+=1;
						y+=1;						
						btn[j].setLocation(x, y);			
						try {
							Thread.sleep(2);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			
			
		}
	}
	@Override
	public void keyReleased(KeyEvent e) { // 키보드 눌렀다 뗄때
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		//System.out.println("x : "+e.+"y : "+e.getY());
/*		int[] addx = {0,0,-50,110,0,60};
		int[] addy = {0,70,70,70,200,200};
		for(int j=0;j<btn.length;j++){
			
			btn[j].setLocation(e.getX()+addx[j], e.getY()+addy[j]);
		}*/
	}

}
