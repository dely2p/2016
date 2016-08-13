package d20160519;

public class 화염방사기 implements Weapon {

	int 연료;													// 멤버변수
	
	화염방사기(){												// 생성자
		연료 = 100;
	}
	
	@Override
	public void use() {										// use method
		if(연료>10){
			연료-=10;
			System.out.println("활활~~ 타올라라~~~ burn");
		}else{
			System.out.println("연료 부족..");
		}
	}

	@Override
	public void reuse() {									// reuse method
		System.out.println(" 연료 리필중...");
		연료 = 100;		
	}

	@Override
	public void drop() {									// drop method
		// TODO Auto-generated method stub
		
	}

	
	
	
}
