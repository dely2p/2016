package d20160525;

public class FloatArray {
	float[] farr;
	
	void setArray(float[] farr){	// float�� arr �� �޾ƿ�
		this.farr = farr;
	}
	void print(){
		for(float x : farr)
			System.out.println(x);	// ���
	}
	
}
