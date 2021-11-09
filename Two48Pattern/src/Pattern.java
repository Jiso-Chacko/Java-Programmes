import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		System.out.println("Enter the limit:\n");
		Scanner input=new Scanner(System.in);
		int limit=input.nextInt();
		
		for(int i=1;i<=limit;i++) {
			if(i%2!=0) {
				System.out.println("* ");
			}
			//System.out.println();
			//for(int k=i;k<=2*i;k++) {
			//System.out.print("* ");
			//}
			if(i%2!=0) {
				for(int k=1;k<=2*i;k++) {
				System.out.print("* ");
				}
			}
			if(i%2==0) {
				System.out.println("*\n* ");
			}
			if(i%2==0) {
				for(int k=1;k<=2*i;k++) {
				System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
