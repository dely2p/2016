package d20160525;

import java.util.ArrayList;
// 미확정 타입 : T
// generic : 자료형을 컴파일시에 결정하는 것이 아니라
// runtime 시점에서 결정하도록 일반화 시켰다.
// 유지보수를 편하게 하기 위하여 사용함
public class GenEx1<T> {
	
	T[] str;					// 멤버변수 선언

	void setArray(T[] str){
		this.str = str;				// 받아온 값 대입
	}
	void print(){
		for(T x : str)
			System.out.println(x);	// 출력
	}
}
