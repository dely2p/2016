package d20160525;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Cal extends Frame implements ActionListener{
	
	
	Button[] num;
	Button[] oper;
	Label lb;
	int firstgetval, secondgetval, result;
	String operator;
	
	public Cal() {
		num = new Button[11];
		oper = new Button[5];
		lb = new Label();
		
	
			num[0] = new Button("0");
			num[1] = new Button("1");
			num[2] = new Button("2");
			num[3] = new Button("3");
			num[4] = new Button("4");
			num[5] = new Button("5");
			num[6] = new Button("6");
			num[7] = new Button("7");
			num[8] = new Button("8");
			num[9] = new Button("9");
			num[10] = new Button("00");
			oper[0] = new Button("+");
			oper[1] = new Button("-");
			oper[2] = new Button("*");
			oper[3] = new Button("/");
			oper[4] = new Button("=");

		setBounds(100, 100, 350, 400);
		setLayout(null);
		setTitle("계산기");
		
		lb.setBounds(50, 60, 250, 40);
		lb.setBackground(Color.green);
		add(lb);
		
		num[0].setBounds(50, 300, 50, 50);
		num[1].setBounds(50, 240, 50, 50);
		num[2].setBounds(115, 240, 50, 50);
		num[3].setBounds(180, 240, 50, 50);
		num[4].setBounds(50, 180, 50, 50);
		num[5].setBounds(115, 180, 50, 50);
		num[6].setBounds(180, 180, 50, 50);
		num[7].setBounds(50, 120, 50, 50);
		num[8].setBounds(115, 120, 50, 50);
		num[9].setBounds(180, 120, 50, 50);
		num[10].setBounds(115, 300, 50, 50);
		oper[0].setBounds(245, 120, 50, 50);
		oper[1].setBounds(245, 180, 50, 50);
		oper[2].setBounds(245, 240, 50, 50);
		oper[3].setBounds(245, 300, 50, 50);
		oper[4].setBounds(180, 300, 50, 50);
		
		for(int i=0;i<num.length;i++){
			add(num[i]);
			num[i].addActionListener(this);
		}
		for(int i=0;i<oper.length;i++){
			add(oper[i]);
			oper[i].addActionListener(this);
		}
		
		
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){			// 추상메서드 부모를 익명inner클래스로 바로 씀
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new Cal();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String in = e.getActionCommand();	// 버튼 라벨을 가져온다.
		Object obj = e.getSource();
		System.out.println(in);
		
		if(obj==oper[0]){		// +이면
			getValue(in);
			lb.setText(in);
		}
		else if(obj==oper[1]){	// -이면
			getValue(in);
			lb.setText(in);
		}
		else if(obj==oper[2]){	// *이면
			getValue(in);
			lb.setText(in);
		}
		else if(obj==oper[3]){	// /이면
			getValue(in);
			lb.setText(in);
		}
		else if(obj==oper[4]){ // =이면
			// 두번째 받은갑 저장 후
			String txt = lb.getText().trim();	// 입력라벨의 지금까지의 값을 읽어와서 공백없이 txt에 저장
			secondgetval = Integer.parseInt(txt);	// 두번째 입력값으로 저장
						
			//계산
			if(operator=="+")
				result = firstgetval+secondgetval;
			else if(operator=="-")
				result = firstgetval-secondgetval;
			else if(operator=="*")
				result = firstgetval*secondgetval;
			else if(operator=="/")
				result = firstgetval/secondgetval;
			lb.setText(""+result);
		}else{
			//숫자 입력받고, 합쳐서출력
			//lb.setText("");
			String data = lb.getText()+in;
			lb.setText(data);
			Integer.parseInt(in);
		}
			
	}
	private void getValue(String in) {
		// 처음받음값 저장
		String txt = lb.getText().trim();	// 입력라벨의 지금까지의 값을 읽어와서 공백없이 txt에 저장
		firstgetval = Integer.parseInt(txt);	// 첫번째 입력값으로 저장
		operator = in;						// 연산자 저장
		lb.setText("");						// 입력라벨 화면 reset설정
		System.out.println("입력받음");
	}
}
