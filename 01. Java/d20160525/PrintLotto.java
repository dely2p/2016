package d20160525;

import java.util.HashSet;
import java.util.Iterator;


public class PrintLotto {
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
		int[] arr = new int[6];
		HashSet<Integer> hs = new HashSet<Integer>();
		
		
		// 2. �����ϰ� 1���� 45������ ���ڸ� �̾Ƽ� �迭�� ��´�.
		while(hs.size()<6){		
			// 3. �ߺ�����			
			int val = (int)(Math.random()*45+1);
			hs.add(val);
		}
		
		Iterator<Integer> it = hs.iterator();  // HashSet�� �ϳ��� ����
		for(int i=0;i<arr.length;i++)
			arr[i]=it.next();				// �迭�� ����		 		 		
		/*int k=0;
		while(it.hasNext()){
			arr[k] = it.next();
			k++;
		}*/
		System.out.println("hs : "+hs);
		
		
		// 4. ���� ��Ų��.
		bubblesort(arr);
		
		
		// 5. ���
		System.out.print("      ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+", ");

	}
}
