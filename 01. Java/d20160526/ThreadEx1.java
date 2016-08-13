package d20160526;
// Thread : 프로세스내에서 실행되는 흐름의 단위

// 자바는 멀티테스크, 멀티쓰레드를 지원
// Multi-Thread
// 1. Thread 상속		== 1. 상속
//					== 2. run() Override
//					== 3. start() 호출

// 2. Runnable Interface를 구현
public class ThreadEx1 extends Thread{
	public ThreadEx1(String name){
		// super(); 부모 기본생성자를 호출, 없으면 에러남 
		// 부모 String 매개변수를 갖는 생성자를 호출
		super(name); // 현재 쓰래드에 이름을 부여
		
	}
	@Override
	public void run() {
		// 동시에 처리하고자하는 로직
		// 현재 실행중인 쓰레드의 이름
		Thread th = Thread.currentThread();
		String name = th.getName();
		for(int i=1;i<=100;i++){
			System.out.println(name+" : " +i+"미터 달리는 중");
		}// for문  end
	}// run() end
	public static void main(String[] args) {
		ThreadEx1 th1 = new ThreadEx1("천둥이");
		ThreadEx1 th2 = new ThreadEx1("번개");
		System.out.println("중비~~~");
		System.out.println("시~~~");
		System.out.println("작~~~");
		th1.start();
		th2.start();
		System.out.println("짝짝 축하합니다!!");
	}
}
