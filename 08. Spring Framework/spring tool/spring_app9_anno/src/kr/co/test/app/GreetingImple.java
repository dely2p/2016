package kr.co.test.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GreetingImple implements Greeting{
	// 스프링 니가 찾아서 넣어줘!!
	// type : 자료형으로 검색
	
	@Autowired
	@Qualifier("nt1")
	NowTime nt;
	String msg;
	
	public GreetingImple(){}
	
	public GreetingImple(NowTime nt, String msg) {
		super();
		this.nt = nt;
		this.msg = msg;
	}
	@Override
	public void printMsg() {
		System.out.println("지금 시간은"+nt.getTime()+"전달 메세지 : "+msg);
		
	}
	public void setNt(NowTime nt) {
		this.nt = nt;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
