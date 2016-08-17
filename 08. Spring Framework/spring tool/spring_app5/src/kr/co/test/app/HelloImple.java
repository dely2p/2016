package kr.co.test.app;

public class HelloImple implements Hello{

	NowTime nt;
	String msg;
	Hello hi;
	
	public HelloImple(NowTime nt) {
		this.nt = nt;
	}
	
	@Override
	public void sayHello() {
		// 지금이 몇시인지 알아오기
		int hours = nt.getHour();
		/*msg변수에 대입*/		
		if(hours>5 && hours<11){
			msg = "좋은 아침~~~~~ㅎㅎ";
		}else if(hours>11 && hours<15){
			msg = "점심 맛있게 먹었니???";
		}else{
			msg = "잘자~~~~";
		}
		
		System.out.println(hours+" : "+msg);
		
	}

}
