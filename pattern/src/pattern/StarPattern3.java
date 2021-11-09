package pattern;

import java.util.Scanner;

public class StarPattern3 {
	public static void main(String[] args) {
		
		int k=1;
		System.out.println("Enter the limit:\n");
		Scanner input=new Scanner(System.in);
		
		int limit=input.nextInt();
		
		for(int i=0;i<=limit;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=limit-i;j>=1;j--) {
				
				
				System.out.print("* ");
				
				
			}
			
			System.out.println();
		}
	}

}
