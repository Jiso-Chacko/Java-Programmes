package pattern;

import java.util.Scanner;

public class HollowSquare {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the limit:\n");
		Scanner input=new Scanner(System.in);
		
		int limit=input.nextInt();
		//int k;
		
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=limit;j++) {
				if(i==1 || i==limit) {
				System.out.print("* ");
				}else {
					if(j==1 || j==limit) {
						System.out.print("* ");
					}
						else{
							System.out.print("  ");
						}
					
				}
			}
			System.out.println();
		}
	}

}
