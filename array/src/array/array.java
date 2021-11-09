package array;

import java.util.Scanner;

public class array {
	
void getArray(int[][] array) {
	
	System.out.println("Enter the array values");
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array.length;j++) {
			Scanner input=new Scanner(System.in);
			array[i][j]=input.nextInt();
		}
	}
}
void displayArray(int[][] array) {
	System.out.println("The array values are:");
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array.length;j++) {
			System.out.print(array[i][j]+" ");
		}
		System.out.println();
   }
	
}


public static void main(String[] args) {
	
	System.out.println("Enter the array limit:");
	Scanner arrayLimit=new Scanner(System.in);
	int limit=arrayLimit.nextInt();
	int[][] array=new int[limit][limit];
	
	array ob= new array();
	ob.getArray(array);
	ob.displayArray(array);
}
}

