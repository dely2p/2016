package d20160525;

import java.util.ArrayList;
// ��Ȯ�� Ÿ�� : T
// generic : �ڷ����� �����Ͻÿ� �����ϴ� ���� �ƴ϶�
// runtime �������� �����ϵ��� �Ϲ�ȭ ���״�.
// ���������� ���ϰ� �ϱ� ���Ͽ� �����
public class GenEx1<T> {
	
	T[] str;					// ������� ����

	void setArray(T[] str){
		this.str = str;				// �޾ƿ� �� ����
	}
	void print(){
		for(T x : str)
			System.out.println(x);	// ���
	}
}
