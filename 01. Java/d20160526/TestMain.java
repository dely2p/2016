package d20160526;

import java.io.IOException;

public class TestMain {
	public static void main(String[] args) {
		try{
			int k = System.in.read();	// throws IOException���� ó�� ���� ����
		}catch(IOException ie){
			System.out.println("����� ���� ���ܹ߻�");
		}
		
		try { // ����ó��
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
