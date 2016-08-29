package spring_app_hw_aop1;

public class hijackGuGu {
	public hijackGuGu() {
		for(int i=2;i<10;i++){
			for(int j=1;j<10;j++){
				System.out.print(i+"x"+j+"="+i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
