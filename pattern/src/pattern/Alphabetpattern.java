package pattern;

import java.util.Scanner;

public class Alphabetpattern {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the limit:\n");
		
		Scanner input=new Scanner(System.in);
		int limit=input.nextInt();
		
		for(int i=1;i<=limit;i++) {
			for(int j=i;j<=limit;j++) {
				System.out.print("   ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print((char)(j+65)+"  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64)+"  ");
			}
			System.out.println();
		}
	}

}
