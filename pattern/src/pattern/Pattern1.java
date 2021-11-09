package pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		int k=1,p=1;
		/*System.out.println("Enter the limit:\n");
		Scanner input= new Scanner(System.in);
		
		int limit=input.nextInt();*/
		
		for(int i=1;i<=10;i++) {
			
				if(i%2!=0) {
					System.out.print("* ");
				}
				else {
					System.out.print("*\n*");
				}
			System.out.println();
			if(i%2!=0) {
			for(int j=1;j<=2*k;j++) {
				System.out.print("* ");
			 }
			k=k+2;
			}
			if(i%2==0) {
				for(int j=1;j<=4*p;j++) {
					System.out.print("* ");
				 }
				p++;
			}
			System.out.println();	
			}
			
			
		}
	}



