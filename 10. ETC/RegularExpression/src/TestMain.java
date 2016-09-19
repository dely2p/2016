

public class TestMain {
	public static void main(String[] args){
		String[] strArray = {"Hello", "World", "H1o", "H2o"};
		int leng = 3;
		char pre = 'H';
		char suf = 'o';
		
		// Hxo라는 문자열을 가지고 있다면 화면에 출력
		/*for(String str : strArray){
			if(str.length()==leng && str.charAt(0)==pre && str.charAt(2)==suf){
				System.out.println(str);
			}			
		}*/
		
		String str = "H1o";
		String p = "^H.o$"; // 패턴(형식) : 정규표현식
		for(String x : strArray){
			if(x.matches(p)) System.out.println(x);
		}
		System.out.println(str.matches(p));
		
		
		
	}

}
