package pattern;

import java.util.Scanner;

public class HollowTriangle {
	public static void main(String[] args) {
		
		System.out.println("Enter the limit:\n");
		
		Scanner input=new Scanner(System.in);
		int limit=input.nextInt();
		
		for(int i=1;i<=limit;i++) {
			for(int j=i;j<limit;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1 || i==limit) {
					if(i==2 && i<limit) {
					 if(j==i){
						System.out.print(" ");
					}
					}
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}				
			}
			for(int j=2;j<=i;j++) {
				if(j==i || i==limit) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}		
		}		
		System.out.println();
		}
	}
}
