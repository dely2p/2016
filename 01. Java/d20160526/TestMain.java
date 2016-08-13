package d20160526;

import java.io.IOException;

public class TestMain {
	public static void main(String[] args) {
		try{
			int k = System.in.read();	// throws IOException으로 처리 전가 가능
		}catch(IOException ie){
			System.out.println("입출력 관련 예외발생");
		}
		
		try { // 예외처리
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
