package pattern;

import java.util.Scanner;

//import com.sun.tools.javac.code.Type.ForAll;

public class AlphabetPattern2 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the limit:\n");
		Scanner input=new Scanner(System.in);
		
		int limit=input.nextInt();
		
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=limit;j++) {
				System.out.print((char)(j+64)+" ");
			}
			for(int j=limit-i;j>=1;j--) {
				System.out.print((char)(j+64)+" ");
			}
			
			System.out.println();
		}
	}

}
