package d20160509;
// 특정 목적에 의해 문장의 흐름을 변경 시키는 문장 : 제어문
// 반복문 : for 문
// for (초기식; 조건식; 증감식){

// } 이렇게 사용
public class StatementEx1 {
	public static void main(String [] args){
																// 구구단 3단 출력
																// int su = 1;
		for (int i = 1; i <= 9; i++){							// 1~9까지 구구단
			System.out.println("3*" + i + " = "+ i*3);			// 3을 곱해서 구구단 출력
			//System.out.println("su : " +su+ " i : " + i);
			//su++;
		}
	}

}