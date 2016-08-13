package d20160513;
/*int[]   m = new int[ 9];

for(int i = o; i<=10; i++){
	System.out.println("i : "+ i );
}

ArrayIndexOutofBoundExcdeption : 10    이라는 에러가 발생했다 왜? 이런 예외가 발생했겠는가? */
public class StatementHw5 {
	public static void main(String[] args) {
		int[] m = new int[9];					// int형 9개 공간을 가진 배열 m 선언

		for(int i = 0; i<=10; i++){				// 공간이 9개인데, 반복이 10번이므로 메모리 범위를 나갔다고 에러남
			m[i]=i*100;							// 배열m에 i*100을 대입
			System.out.println("i : "+ i );		// i값 출력
		}
	}
}
