package d20160525;

public class IntArray {
	int[] arr;							// 멤버변수 선언
	
	void setArray(int[] arr){
		this.arr = arr;					// 받아온 int형 array 값 대입
	}
	void print(){
		for(int x : arr)
			System.out.println(x);		// 출력
	}
}
