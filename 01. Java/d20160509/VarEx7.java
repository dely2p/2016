package d20160509;
//7순위 : 삼항 연산자
public class VarEx7 {
	public static void main(String [] args){
		int a = 10;										// a에 10으로 초기화
		int b = 5;										// b에 5으로 초기화
														// (조건)? "참":"거짓"
		System.out.println((a>b)?"참":"거짓");				// a가 더 크므로 참 출력
		System.out.println((a<b)?"참":"거짓");				// b가 더 크므로 거짓 출력
	}

}