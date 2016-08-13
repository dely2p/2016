package d20160526;

import java.util.Random;

public class ExceptionEx1 {
// 랜덤하게 0부터 100사이의 값 얻기	
	public static void main(String[] args) {
		// 1. Error : 치명적 오류
		// 2. Exception : 가벼운 오류
		//		1. try~~catch : case by case 정의
		//		2. 예외 전가
		
		Random rnd = new Random();
		int a = 100;
		try{
			for(int i=0;i<100;i++){
				int b = rnd.nextInt(10); //0~9까지 정수 반환 
				System.out.println("a/b : "+(a/b));
				System.out.println("하하하");
			}		
		}catch(ArithmeticException ae){ // 발생한 에러가 ArithmeticException
			System.out.println("0으로 나눌수는 없어요");
		}catch (Exception e) { // 작은 것에서 커지는 순으로 예외를 쓸 것
			System.out.println("나도 몰라 예외");
			e.getStackTrace(); // 지금까지 stack메모리를 추적
		}
		
	}
}
