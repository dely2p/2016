package d20160525;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public class PrintLotto3 {
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
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size() != 6){ // 3. �ߺ�����	
			hs.add((int)(Math.random()*45+1));
		}
		
		//System.out.println("hs : "+hs);
		
		// 2. �����ϰ� 1���� 45������ ���ڸ� �̾Ƽ� �迭�� ��´�.
		Iterator<Integer> it = hs.iterator();
		int i=0;
		while(it.hasNext()){
			m[i] = it.next();
			i++;
		}
		
		// 4. ���� ��Ų��.
		Arrays.sort(m);
		
		// 5. ���
		for(int j=0;j<m.length;j++)
			System.out.print(m[j]+"\t");
	}
}
