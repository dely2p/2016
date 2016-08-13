package d20160527;

import java.util.ArrayList;
import java.util.Random;

public class Car {
	Random rnd = new Random();			// 랜덤 생성
	ArrayList<String> list;				
	String[] carNameList = {
			"아우디","벤츠","붕붕이","타요"
	};
	
	Car(){
		list = new ArrayList<String>();		// ArrayLists 생성
	}
	public synchronized void push(String car){
		System.out.println("차고상태 : "+list);
		System.out.println("자동차가 생산되었습니다 "+car);
		list.add(car);
		// 기다리고 있는 호갱님 일어나세요
		//notify(); // 하나만 wait() 깨움(어떤 것은 계속 안깨우게 될 수도 있음)
		notifyAll(); //-> 모두 다깨워서 경쟁 
	}
	// 꺼내는 메서드 pop()
	//	a	b	c	d	==>	size() 4
	//	0	1	2	3
	
	public synchronized String pop(){
		if(list.size()==0){							// 차고에 아무것도 없으면
			System.out.println("호갱님 기다리세요");		// 기다리라는 메시지와 함께
			try {
				wait();								// wait() 함
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			String carName = list.remove(list.size()-1); // 맨 끝에 있는 요소 빼면서 삭제함
			System.out.println("출고합니다 : "+carName);
			
		return carName;
	}
	
	// 차량이름 얻어오기
	public synchronized String getCar(){
		// 랜덤하게 차량 이름 얻어오기
		int val = rnd.nextInt(carNameList.length);
		return carNameList[val];
	}

}
