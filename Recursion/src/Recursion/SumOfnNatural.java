package Recursion;

import java.util.Scanner;

public class SumOfnNatural {

	public static void main(String[] args) {
		
		System.out.println("Enter the limit:\n");
		Scanner input=new Scanner(System.in);
		int limit=input.nextInt();
		
		System.out.println("The sum of " + limit + " numbers is:"+sum(limit));
	}
	
	static int sum(int n) {
		
		if(n==1) {          //base case
			
			return 1;
		}
		return n+sum(n-1);  //recursion function
	}
}
