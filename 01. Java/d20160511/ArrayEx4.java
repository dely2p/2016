package d20160511;

public class ArrayEx4 {
	public static void main(String[] args) {
		// main method의 배열 사용하기
		
/*		System.out.println("args[0]"+args[0]);
		System.out.println("args[1]"+args[1]);*/
		
		
/*		char[] ch = new char[10];									// 또 다른 배열 사용방법
		ch[0] = 'j';
		ch[1] = 'a';*/
		char[] ch = {'j','a','v','a',' ','w','o','r','l','d'};		// char형 ch배열에 글자 초기화시킴
		
		for(int i=0;i<ch.length;i++)								// ch의 길이만큼 반복실행
			System.out.print(ch[i]);								// ch배열 출력
		System.out.println();
		
		String str = "java world";									// String은 클래스임, 내부적으로는 배열처럼 처리
		System.out.println(str);									// str 출력
	}
}
