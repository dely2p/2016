package d20160516;

public class StatementHw4 {
	public static void main(String[] args) {
		Medic md = new Medic(50,0,0,50);		// Medic 클래스 생성(hp, x, y, 이동속도)
		md.Medic정보();							// 정보 출력
		System.out.println("저기요!");				// 저기요 문자열 출력
		md.물어보기(7,2,100);						// medic의 물어보기 method 출력 후 위치 변화, 이동속도 변화
		md.Medic정보();							// 정보 출력
		System.out.println("치료해주세요~~");		// 치료해주세요 문자열 출력
		md.치료하기();								// 임무중 문자열 출력, hp 갑소, 이동속도 0으로 변화
		md.Medic정보();							// 정보 출력
		System.out.println("상태가 어떤가요?");		// 상태가 어떤가요 문자열 출력
		md.상태말하기(false);						// false를 두어 사망을 알림
		
	}
}
