package d20160504;

public class Hw01 {
	public static void main(String[] args) {
		int m1 = 100;
		byte b1 = 20;
		short sh1 = 200;
		int	k = m1 + b1; 						// k의 자료형을 작성안함 -> m1+b1에서 m1이 int이므로 int에 맞추어 자료형을 결정
		System.out.println("k : "+ (m1+b1));
		
		byte b2 = (byte)k;						// k는 int로 자료형을 두었는데, byte인 b2에 넣으려니 에러남 -> k값이 127보다 작으므로 byte가능하니 byte로 형변환 함
		
		int b3 = 300; 							// 상수인 300은 b3의 자료형인 byte 최대값인 127보다 크므로  -> b3의 자료형을 int로 바꿈
		k = k + 1; 								// k를 앞에서 이미 초기화 했으므로 -> 자료형 int를 지우거나 변수명을 다른 것으로 바꿈
		System.out.println("k : "+ k);
	}
}
