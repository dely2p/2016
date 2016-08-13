package d20160525;

public class FloatArray {
	float[] farr;
	
	void setArray(float[] farr){	// float형 arr 값 받아옴
		this.farr = farr;
	}
	void print(){
		for(float x : farr)
			System.out.println(x);	// 출력
	}
	
}
