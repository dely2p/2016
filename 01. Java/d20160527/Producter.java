package d20160527;

public class Producter implements Runnable{
	
	private Car car;				// car 클래스 
	public Producter(Car car) {		// 생성자
		this.car = car;
	}
	@Override
	public void run() {
		// 자동차 50대 생산해서 차고에 넣기
		
		for(int i=0;i<50;i++){
			try {
				Thread.sleep(1000);				//sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String carName = car.getCar();		// car의 이름 가져와서
			car.push(carName);					// push
		}
	}
}
