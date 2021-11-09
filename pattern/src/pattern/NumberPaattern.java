package pattern;

public class NumberPaattern {
	public static void main(String[] args) {
		int p=0;
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			//p++;
			for(int j=0;j<i;j++) {
				System.out.print(j);
				//p=p+1;
			}
			
			System.out.println();
	
		
		}

	}
}	
