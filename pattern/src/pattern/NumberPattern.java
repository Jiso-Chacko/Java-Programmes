package pattern;

public class NumberPattern {
	
	public static void main(String[] args) {
		
		int limit=5;
		
		for(int i=1;i<=limit;i++) {
		
		for(int j=limit-i;j>=1;j--) {
			System.out.print("  ");
		}
		int p=i;
		for(int j=1;j<=i;j++) {
			System.out.print(p+" ");
			p++;
		}
		for(int j=i-1;j>=1;j--) {
			System.out.print(i+j-1+" ");
		}
		
		System.out.println();
	}
		
	}
}
