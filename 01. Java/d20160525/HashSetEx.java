package d20160525;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("규동");
		hs.add("스시");
		hs.add("육쌈냉면");
		hs.add("냉면");
		hs.add("스시"); // 중복제거효과 있음
		hs.add("스시");
		hs.add("스시");
		hs.add("스시");
		
		System.out.println("hs : "+hs);	// 출력
		
		Iterator<String> it = hs.iterator();  // HashSet를 하나씩 나눔
		
		while(it.hasNext()){	// 다음값이 있으면 true, 아니면 false		
			String data = it.next();
			System.out.println(data);
			if(data=="스시")
				it.remove();	// 스시 지우기
		}		
		
		System.out.println("hs : "+hs);	// 출력
		
		
		
		// 스시
	}
}
