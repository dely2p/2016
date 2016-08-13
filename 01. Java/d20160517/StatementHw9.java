package d20160517;

public class StatementHw9 {
	public static void main(String[] args){
		int a = 20;							// int형 a에 20 대입
		int[] b = {10,20,50,30};			// int형 배열 b에 값 대입
		float f = 240.3f;					// float형 f에 값 대입
		
		FormatData fd = new FormatData();	// FormatData 클래스 생성

		fd.print(a);						// overloading method인 print에 int형 출력
		fd.print(b);						// overloading method인 print에 int형 배열 출력
		fd.print(f);						// overloading method인 print에 float형 출력
	}
}
