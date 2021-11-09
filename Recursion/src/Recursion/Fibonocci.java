package Recursion;

import java.util.Scanner;

public class Fibonocci {
	
	static int n1=0,n2=1,n3=0;
	static int fib(int n) {
		
		if(n<1) {
			return 0;
		}
		else {	
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
			return fib(n-1);
			
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the nth number:\n");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.print("The nth fibonacci series is :\n"+n1+" "+n2+" ");
		fib(n-2);
	}
}
