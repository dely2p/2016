package d20160509;

public class hw {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i+1;j++){
				if(j<=i)
					System.out.print(j);
			}
			System.out.println();
		}
	}
}
