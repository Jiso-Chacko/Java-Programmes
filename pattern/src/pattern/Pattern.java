package pattern;

import java.util.Scanner;

public class Pattern {
	
	public static void main(String ar[]) {
		System.out.println("Enter the limit");
		Scanner sc=new Scanner(System.in);
		
	 int limit=sc.nextInt();
	 for(int i=0;i<limit;i++) {
		 for(int j=0;j<=i;j++) {
			 System.out.println("* ");
		 }
		 System.out.println();
	 }
	}

}
