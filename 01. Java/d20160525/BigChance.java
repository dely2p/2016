package d20160525;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashSet;
import java.util.Iterator;

public class BigChance extends Frame implements ActionListener{
	
	
	static void bubblesort(int[] m){		// bubblesort
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m.length-i-1;j++){
				if(m[j]>m[j+1]){
					int tmp = m[j];
					m[j] = m[j+1];
					m[j+1] = tmp;
				}
			}
		}
	}	
	
	Button btn;
	Label[] lb;
	
	public BigChance() {
		btn = new Button("인생은 한방!");	// 버튼 생성
		lb = new Label[6];				// 라벨 생성
		for(int i=0;i<lb.length;i++)
			lb[i] = new Label();
		
		setBounds(100, 100, 800, 600);	// Frame 생성
		setLayout(null);
		setTitle("대박");
		
		for(int i=0;i<lb.length;i++){
			lb[i].setBounds(120+(i*100), 200, 50, 50);
			lb[i].setBackground(Color.yellow);
			lb[i].setAlignment(Label.CENTER);	// 가운데 정렬
			add(lb[i]);
		}
		btn.setBounds(100, 400, 600, 80);
		btn.addActionListener(this);
		add(btn);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){			// 추상메서드 부모를 익명inner클래스로 바로 씀
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	
	public static void main(String[] args) {
		new BigChance();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		int[] arr = new int[6];
		HashSet<Integer> hs = new HashSet<Integer>();	// HashSet 생성
		while(hs.size()!=6){							// 6보다 작을 때
			int a = (int)(Math.random()*45+1);			// 랜덤값 뽑아냄
			hs.add(a);									// HashSet에 넣어줌
		}
		
		Iterator<Integer> it = hs.iterator();			// iterator로 값뽑아서
		for(int i=0;i<arr.length;i++){
			arr[i]=it.next();							// 배열에 넣고,
			System.out.print(arr[i]+" ");				// 출력
		}
		
		bubblesort(arr);
		
		for(int i=0;i<arr.length;i++){
			lb[i].setText(Integer.toString(arr[i]));	// 라벨에 출력
	//		lb[i].setText(it.next().toString());
		}
		
		
		
		
		
	}
}
