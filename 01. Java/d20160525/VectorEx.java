package d20160525;

import java.util.Stack;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector v = new Vector();	// 동적성장형 배열
		
		System.out.println(v.capacity()); // 기본생성자가 10칸 만들어짐
		System.out.println(v.size()); // 몇 개 썼는지 
		
		v.add("딸기");	// String str = "딸기"; Object o = str;
		v.add("복숭아");
		v.add("사과");
		v.add("포도");
		v.add("배");
		v.add("딸기");		// 중복되도 상관없이 잘 들어감
		v.add("딸기");
		v.add("딸기");
		v.add("딸기");		
		v.add("딸기");
		v.add("딸기");		// 10개 이상이면 자동으로 늘어남
		
		System.out.println("v : "+v);
		
/*		System.out.println(v.capacity()); // 기본생성자가 10칸 만들어짐
		System.out.println(v.size()); // 몇 개 썼는지 (배열의 length)
*/
		
		// vector : 동적 성장형 Object 배열
		for(int i=0;i<v.size();i++){
			Object obj = v.get(i);		// vector의 i번째 값을 obj에 담고,
			String str = (String)obj;	// obj를 str에 담음(heap에 string값으로 저장된것)
			System.out.println(str.substring(0, 1));	// 한글자 뽑아내서 출력
			System.out.println("obj[0] : "+ obj.toString()); // obj.toString() 출력
		}
		///////////////////////////////////////////////////////////
		/*Object obj3 = new Object();
		System.out.println(obj3);
		System.out.println(obj3.toString()); // 내부적으로는 이렇게 사용됨
		
		String str = new String("java");
		System.out.println(str);
		System.out.println(str.toString()); // object에 있는 걸 string은 오버라이드 하기 때문에 
		*/
		
	}

}
