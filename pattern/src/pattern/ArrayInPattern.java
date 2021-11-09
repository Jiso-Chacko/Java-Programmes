package pattern;

import java.util.Scanner;

public class ArrayInPattern {
	public static void main(String[] args) {
		
		System.out.println("Enter the array limit:\n");
		Scanner input= new Scanner(System.in);
		
		int limit=input.nextInt();
        int[] arr=new int[limit];
		
		System.out.println("Enter the array elements:\n");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int z=arr[i];
			
			for(int j=1;j<=z;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
