package d20160525;

public class IntArray {
	int[] arr;							// ������� ����
	
	void setArray(int[] arr){
		this.arr = arr;					// �޾ƿ� int�� array �� ����
	}
	void print(){
		for(int x : arr)
			System.out.println(x);		// ���
	}
}
