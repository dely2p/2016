package d20160513;
//버블 정렬
public class StatementHw7 {
	
	static void bubblesort(int[] m){		
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m.length-i-1;j++){
				if(m[j]>m[j+1]){
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
			}
		}		
	}

	public static void main(String[] args) {
		int[] m = { 3, 2, 1, 5, 4, 7, 8, 0, 6 };
		
		for(int i=0;i<m.length;i++){
			System.out.print(m[i]+" ");
		}
		System.out.println();
		bubblesort(m);
		
		for(int i=0;i<m.length;i++){
			System.out.print(m[i]+" ");
		}
	}
}
