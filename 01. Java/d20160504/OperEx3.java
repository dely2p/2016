package d20160504;
// 3. shift연산자
// >> , << , >>> (빈공간을 0으로 채우는 대신 부호자리로 채운다)
// cf, 1001 0100 -> 1110 0101
public class OperEx3 {
	public static void main(String[] args) {
		byte b = 20; // 0001 0100
		
		System.out.println("b>>3 : "+(b>>3)); //0000 0101
		System.out.println("b<<2 : "+(b<<2)); //0001 0100
	}
}
