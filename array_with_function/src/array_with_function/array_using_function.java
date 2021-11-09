package array_with_function;

import java.util.Scanner;

public class array_using_function {
	
	public static void main(String[] args) {
		
		int[][] array=new int[2][2];
		
		array_using_function arraymethod=new array_using_function();
		arraymethod.getArray();
		arraymethod.displayArray();

}


public void getArray() {

	System.out.println("Enter the array limit:\n");
	Scanner arrayLimit= new Scanner(System.in);
	int limit=arrayLimit.nextInt();
	int[][] array=new int[2][2];
	
	System.out.println("Enter the array values:");
	for (int i=0;i<limit;i++) {
		for(int j=0;j<limit;j++) {
			array[i][j]=arrayLimit.nextInt();
		}
	}
}
public void displayArray() {
	Scanner arrayLimit= new Scanner(System.in);
	int limit=arrayLimit.nextInt();
	int[][] array=new int[2][2];
	System.out.println("The array elements are:");
	for(int i=0;i<limit;i++) {
		for(int j=0;j<limit;j++) {
			System.out.println(array[i][j]);
		}
		
	}
}
}
