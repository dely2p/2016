package d20160527;

public class Producter implements Runnable{
	
	private Car car;				// car Ŭ���� 
	public Producter(Car car) {		// ������
		this.car = car;
	}
	@Override
	public void run() {
		// �ڵ��� 50�� �����ؼ� ���� �ֱ�
		
		for(int i=0;i<50;i++){
			try {
				Thread.sleep(1000);				//sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String carName = car.getCar();		// car�� �̸� �����ͼ�
			car.push(carName);					// push
		}
	}
}
