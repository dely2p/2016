package d20160517;

import java.util.Scanner;

public class StatementHw5 {
	
	static int maxsort(int[] m){						// maxsort method
		int maxid=0,maxval=0;							// max 값의 인덱스, max 값을 담을 int 선언 및 초기화
		for(int i=0;i<m.length;i++){					// 배열 길이만큼 반복하면서
				if(maxval<m[i]){						// max값을 찾고, 
					maxid = i;							// maxid에 max의 인덱스 값과
					maxval = m[i];						// maxval에 각 배열값과 비교하여 얻게된 max를 대입한다.
				}
		}			
		return maxid;									// max id를 출력한다.
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			// 입력받기위해서 Scanner 사용
		int[] vals = new int[10];						// 배열 m선언
		int mnum;										// max값을 넣을 int형  선언
		
		for(int i=0;i<10;i++){							// 배열을 10번 돌리면서
			System.out.print("숫자"+(i+1)+"입력 : ");		// 배열 값을 입력받음
			vals[i] = sc.nextInt();						// 입력받아서 각 vals에 대입
		}
		
		mnum = maxsort(vals);							// maxsort method를 실행한 후 return 값을 mnum에 대입
		
		for(int i=0;i<10;i++){						
			System.out.print(vals[i]+" ");				// 배열 값 출력
		}
		System.out.println();
		System.out.println("가장 큰 값 : "+vals[mnum]);		// 가장 큰 값 출력
		System.out.println("몇 번째 입력 값  : "+(mnum+1));		// 가장 큰 값의 인덱스 출력
	}
}
