package Arrrayselection;

import java.util.Scanner;

public class ArrayRepCount {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the array limit:\n");
		
		Scanner input=new Scanner(System.in);
		
		int limit=input.nextInt();
		
		System.out.println("Enter the array values:\n");
		int[] array1=new int[limit];
		for(int i=0;i<limit;i++) {
			array1[i]=input.nextInt();
		}
		System.out.print("The repeating numbers are:\n");
		for(int i=0;i<limit;i++) {
			for(int j=i+1;j<limit;j++) {
				if(array1[i]==array1[j]) {
					System.out.print(array1[j]+" ");
				}
			}
		}
		
	}
}
