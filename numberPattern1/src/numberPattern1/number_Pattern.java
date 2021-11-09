package numberPattern1;

import java.util.Scanner;

public class number_Pattern {
	public static void main(String[] args) {
		int flag=1;
		Scanner patternLimit=new Scanner(System.in);
		System.out.println("Enter the limit:\t");
		int limit=patternLimit.nextInt();
		for(int i=1;i<=limit+1;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(flag+" ");
				flag=++flag;
			}
			System.out.print("\n");
		}
		
	}

}
