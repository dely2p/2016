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
		
		
		// 1. 6칸짜리 배열 선언
		int[] arr = new int[6];
		HashSet<Integer> hs = new HashSet<Integer>();
		
		
		// 2. 랜덤하게 1부터 45사이의 숫자를 뽑아서 배열에 담는다.
		while(hs.size()<6){		
			// 3. 중복제거			
			int val = (int)(Math.random()*45+1);
			hs.add(val);
		}
		
		Iterator<Integer> it = hs.iterator();  // HashSet를 하나씩 나눔
		for(int i=0;i<arr.length;i++)
			arr[i]=it.next();				// 배열에 대입		 		 		
		/*int k=0;
		while(it.hasNext()){
			arr[k] = it.next();
			k++;
		}*/
		System.out.println("hs : "+hs);
		
		
		// 4. 정렬 시킨다.
		bubblesort(arr);
		
		
		// 5. 출력
		System.out.print("      ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+", ");

	}
}
