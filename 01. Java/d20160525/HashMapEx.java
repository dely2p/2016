package d20160525;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("반장", "은주띠");
		hm.put("부반장", "사라진그사람");
		hm.put("실", "바늘");
		hm.put("치킨", "맥주"); // key값 중복할 수 없음
		hm.put("치킨", "소콜");
		hm.put("치킨", "소백산맥");
		hm.put("파전", "막걸리");
		hm.put("감자튀김", "맥주");
		
		System.out.println(hm);
		
		String data = hm.get("파전");
		System.out.println(data);
		
		// 키 얻어오기 
		Set<String> key = hm.keySet(); // key값을 Set으로 넘겨줌
		
		// iterator 값 꺼내기
		
		Iterator<String> it = key.iterator();
		while(it.hasNext()){
			String value = it.next();
			System.out.println(value + " : " + hm.get(value));
		}
		
	}
}
