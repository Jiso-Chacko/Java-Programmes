
public class Q17Assig {
	
	public static void main(String[] args) {
		
		int n=6,p=1;
		
		for(int k=1;k<=4;k++) {
		int x=2;
		for(int i=1;i<=2;i++) {
			for(int z=1;z<=x;z++) {
				System.out.print("_ ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			n--;
			x--;
			System.out.println();
		}n++;
		for(int j=1;j<=p;j++) {
			System.out.println("* ");
		}
		p++;
		}
		//System.out.println("******************************");
		
		/*int p=1,n=2,k=1;
		for(int i=1;i<=3;i++) {
			
			for(int j=1;j<=p;j++) {
				System.out.println("*   ");
			}
			//System.out.println();
			
			
			for(int j=1;j<=p;j++) {
				System.out.print("_ ");
			}
			p++;
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			n=n*2;
			k++;
			System.out.println();
		}
		int j;
		for(int k=1;k<=5;k++) {
		
		for(j=1;j<=6;j++) {
			System.out.print("*   ");
		}
		
		System.out.println();
		}*/
		
	}
}
