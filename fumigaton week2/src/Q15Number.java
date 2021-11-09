
public class Q15Number {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			int n=1;
			for(int j=1;j<=i;j++) {
				if(j==1) {
					System.out.print("*  ");
				}
				else {
					System.out.print(n+"  ");
					n++;
				}
			}
		    
			for(int j=2;j<=i;j++) {
				n=i;
				if(j==i) {
					System.out.print("*  ");
				}
				else {
					n=i-j;
					System.out.print(n+"  ");
				}
			}
			System.out.println();
		}
		
		for(int i=3;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(j==1) {
					System.out.print("*  ");
				}
				else {
					System.out.print(j-1+"  ");
				}
			}
			for(int j=1;j<=i-1;j++) {
				if(j==i-1) {
					System.out.print("*  ");
				}
				else {
					System.out.print(j+"  ");
				}
			}
			System.out.println();
		}
	}

}
