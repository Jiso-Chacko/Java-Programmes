import java.util.Scanner;

public class Extra15 {
	
	public static void main(String[] args) {
		
		int i,j;
		System.out.println("Enter the limit:\n");
		
		Scanner input=new Scanner(System.in);
		int limit=input.nextInt();
		
		for(i=1;i<=limit;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(j=i;j<limit;j++) {
				System.out.print(" ");
			}
			for(j=i;j<limit;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
