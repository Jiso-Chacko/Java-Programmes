package pattern;

import java.util.Scanner;

public class three612pattern {

	public static void main(String[] args) {
		
		int flag1=0;
	    int flag2=1;
	    int a=3;
	    int r=2;
		System.out.println("Enter the limit:\n");
		Scanner input=new Scanner(System.in);
		int limit=input.nextInt();
		
		for(int i=1;i<=limit;i++) {
			
			int term=a*(int)Math.pow(r,flag1);
			if(i%2!=0) {
				
				//int p=3*flag1;
				for(int k=1;k<=term;k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			if(i%2!=0) {
				System.out.print("*\n*");
			}
			//System.out.println();
			if(i%2==0) {
				for(int k=1;k<=term;k++) {
					System.out.print("* ");
				}
				flag1++;
				System.out.println();
			if(i%2==0) {
				System.out.print("*\n*");
			}
			//System.out.println();
		}
		System.out.println();
	   }
	}
}
	
 

