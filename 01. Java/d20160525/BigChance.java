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
		btn = new Button("�λ��� �ѹ�!");	// ��ư ����
		lb = new Label[6];				// �� ����
		for(int i=0;i<lb.length;i++)
			lb[i] = new Label();
		
		setBounds(100, 100, 800, 600);	// Frame ����
		setLayout(null);
		setTitle("���");
		
		for(int i=0;i<lb.length;i++){
			lb[i].setBounds(120+(i*100), 200, 50, 50);
			lb[i].setBackground(Color.yellow);
			lb[i].setAlignment(Label.CENTER);	// ��� ����
			add(lb[i]);
		}
		btn.setBounds(100, 400, 600, 80);
		btn.addActionListener(this);
		add(btn);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){			// �߻�޼��� �θ� �͸�innerŬ������ �ٷ� ��
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
		HashSet<Integer> hs = new HashSet<Integer>();	// HashSet ����
		while(hs.size()!=6){							// 6���� ���� ��
			int a = (int)(Math.random()*45+1);			// ������ �̾Ƴ�
			hs.add(a);									// HashSet�� �־���
		}
		
		Iterator<Integer> it = hs.iterator();			// iterator�� ���̾Ƽ�
		for(int i=0;i<arr.length;i++){
			arr[i]=it.next();							// �迭�� �ְ�,
			System.out.print(arr[i]+" ");				// ���
		}
		
		bubblesort(arr);
		
		for(int i=0;i<arr.length;i++){
			lb[i].setText(Integer.toString(arr[i]));	// �󺧿� ���
	//		lb[i].setText(it.next().toString());
		}
		
		
		
		
		
	}
}
