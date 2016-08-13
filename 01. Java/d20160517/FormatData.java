package d20160517;

public class FormatData {
	int inum;									// 멤버변수 선언
	int[] arr;
	float fnum;
		
	void print(int inum){						// method print(int형 매개변수)
		this.inum = inum;						// 값 대입
		System.out.println(inum);				// 값 출력
	}
	void print(int[] arr){						// method print(int형 배열 매개변수)
		this.arr = arr;							// 값 대입
		System.out.print("[ ");
		for(int i=0;i<arr.length;i++)			// 배열 길이만큼 반복
			System.out.print(arr[i]+" ");		// 배열 값 출력
		System.out.println(" ]");
	}
	void print(float fnum){						// method print(float형 매개변수)
		this.fnum = fnum;						// 값 대입
		System.out.println(fnum);				// 값 출력
	}
}
