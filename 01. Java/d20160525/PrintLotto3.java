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
		
		// 1. 6칸짜리 배열 선언
		int[] m = new int[6];
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size() != 6){ // 3. 중복제거	
			hs.add((int)(Math.random()*45+1));
		}
		
		//System.out.println("hs : "+hs);
		
		// 2. 랜덤하게 1부터 45사이의 숫자를 뽑아서 배열에 담는다.
		Iterator<Integer> it = hs.iterator();
		int i=0;
		while(it.hasNext()){
			m[i] = it.next();
			i++;
		}
		
		// 4. 정렬 시킨다.
		Arrays.sort(m);
		
		// 5. 출력
		for(int j=0;j<m.length;j++)
			System.out.print(m[j]+"\t");
	}
}
