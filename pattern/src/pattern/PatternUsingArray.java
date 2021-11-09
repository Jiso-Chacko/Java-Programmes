package pattern;

import java.util.Scanner;

public class PatternUsingArray {
	
	public static void main(String[] args) {
		
		int p=1,q=1,r=0;
		System.out.println("Enter the array limit:\n");
		Scanner input= new Scanner(System.in);
		
		int limit= input.nextInt();
		
		int[] arr=new int[limit];
		
		System.out.println("Enter the array elements:\n");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		/*System.out.println("Array is:\n");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
		
		
		for(int i=0;i<(arr.length-2);i++) {
			int z=arr[i];
			if((i+1)%2!=0) {
				System.out.print(z);
				
			}
			if((i+1)%2==0) {
				System.out.print(z);
			}
			System.out.println();
			z=arr[i+1];
			if((i+1)%2!=0) {
				for(int j=1;j<=2*p;j++) {
					System.out.print(z);
				}
				p=p+2;
			}
			if((i+1)%2==0) {
				for(int j=1;j<=4*q;j++) {
					System.out.print(z);
				}
				q++;
			}
			System.out.println();
		}
	}

}
