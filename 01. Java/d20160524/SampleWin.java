package d20160524;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SampleWin extends Frame{
	public SampleWin(){
		setBounds(100, 100, 800, 600);
		/*class Handle extends WindowAdapter{
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}
		Handle hd = new Handle();
		addWindowListener(hd);
		*/
		/*WindowAdapter wa = new WindowAdapter(){			// wa ��� �ٷ� ��
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};*/
		// window â ����
		addWindowListener(new WindowAdapter(){			// �߻�޼��� �θ� �͸�innerŬ������ �ٷ� ��
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new SampleWin();
	}
}
