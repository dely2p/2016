package d20160527;

import java.util.Random;

public class Customer implements Runnable{

	private Car car;
	Random rnd = new Random();
	public Customer(Car car) {
		this.car=car;
	}
	@Override
	public void run() {
		// ���� 50�� ����
		// ������ 50�� ������
		for(int i=0;i<20;i++){
			// 3�����Ͽ� 1�뾿 ����

			try {
				Thread.sleep(rnd.nextInt(3)*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String carName = car.pop();
			
		}
	}
}
