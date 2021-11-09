package week2q3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		System.out.println("Enter the limit\n");
		Scanner input=new Scanner(System.in);
		
		int limit=input.nextInt();
		int[] arr=new int[limit];
		System.out.println("Enter the array");
		
		for(int i=0;i<limit;i++) {
			arr[i]=input.nextInt();
		}
		int temp1=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>temp1) {
				temp1=arr[i];
			}
		}
		int temp2=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=temp1) {
			if(arr[i]>temp2) {
				temp2=arr[i];
			  }
			}
		}
		System.out.println("The second largest element is: "+temp2);
	}
}
