package d20160525;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public class PrintLotto2 {
	static void bubblesort(int[] arr) {		// bubble sort
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		
		
		// 1. 6ĭ¥�� �迭 ����
		int[] m = new int[6];

		
		// 2. �����ϰ� 1���� 45������ ���ڸ� �̾Ƽ� �迭�� ��´�.
		for(int i=0;i<m.length;i++){
			m[i] = (int)(Math.random()*45+1);
			for(int j=0;j<i;j++){
				// 3. �ߺ�����	
				if(m[j]==m[i]){
					i--;
					break;
				}
			}
		}		

		// 4. ���� ��Ų��.
		Arrays.sort(m);
		
		// 5. ���
		for(int i=0;i<m.length;i++)
			System.out.print(m[i]+"\t");

	}
}
