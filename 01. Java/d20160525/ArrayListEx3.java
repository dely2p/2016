package d20160525;

import java.util.ArrayList;

public class ArrayListEx3 {
	public static void main(String[] args) {
		// String 객체만 담을 수 있는 전용 동적 성장형 배열
		// 제너릭(일반화)
		ArrayList<String> list = new ArrayList<String>();	// ArrayList 생성
		
		list.add("딸기");		// 값 추가
		int a = 30;
		Integer it = a;
		//list.add(it);
		list.add("우유");
		
		System.out.println(list);
		
		// ArrayList 안에 있는 값 꺼내서 출력하기
		for(int i=0;i<list.size();i++){
			Object obj = list.get(i);
			String str = (String)obj;
			System.out.println(str.substring(0,1)); // runtime성 에러			
		}
	}
}
