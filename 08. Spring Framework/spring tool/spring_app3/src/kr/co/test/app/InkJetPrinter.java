package kr.co.test.app;

public class InkJetPrinter implements Printer{

	@Override
	public void printing(String msg) {
		System.out.println("잉크잉크~~~~"+msg);
		
	}
	
}
