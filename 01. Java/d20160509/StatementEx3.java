package d20160509;

public class StatementEx3 {
	public static void main(String[] args){
		int i = 1;												// i를 1로 초기화
		do{														// 무조건 한번은 실행
			System.out.println(" 3 * " + i + " = " + 3*i);		// 구구단 3단 출력
			i++;												// i값 1증가
		}while(i<10);											// i가 10보다 작으면 반복실행, 아니면 do~while문을 나감
	}
}
