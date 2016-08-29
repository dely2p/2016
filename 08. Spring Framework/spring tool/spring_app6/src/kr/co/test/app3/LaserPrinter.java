package kr.co.test.app3;

public class LaserPrinter implements Printer{

	int red, green, blue; //카트리지 잔량
	
	public LaserPrinter(){}
	
	// 매개변수 있는 생성자
	public LaserPrinter(int red, int green, int blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	
	// setter 추가
	public void setRed(int red) {
		this.red = red;
	}	
	public void setGreen(int green) {
		this.green = green;
	}	
	public void setBlue(int blue) {
		this.blue = blue;
	}
	
	
	@Override
	public void print() {
		// r,g,b 0 이상일 때만 컬러로 출력합니다.
		// 카트리지를 갈아주세요 메세지 출력
		if(red>0 && green>0 && blue>0){
			System.out.println("컬러로 출력합니다.");
			System.out.println("R:"+red+" G:"+green+" B:"+blue);
		}else{
			System.out.println("카트리지를 갈아주세요");
			System.out.println("R:"+red+" G:"+green+" B:"+blue);
		}
		
	}



}
