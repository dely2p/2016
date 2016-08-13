package d20160527;

public class ProductCustomer {
	public static void main(String[] args) {
		Car car = new Car();				// Car 클래스 생성
		
		Producter p = new Producter(car);	// 제작사 생성
		
		Customer c1 = new Customer(car);	// 고객 1,2,3 생성
		Customer c2 = new Customer(car);
		Customer c3 = new Customer(car);
		
		Thread th1 = new Thread(p);			// 쓰레드 생성
		Thread th2 = new Thread(c1);
		Thread th3 = new Thread(c2);
		Thread th4 = new Thread(c3);
		
		th1.start();						// 쓰레드 4개 각각 start
		th2.start();
		th3.start();
		th4.start();
	}
}
