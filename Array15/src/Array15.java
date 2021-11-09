import java.util.Scanner;

public class Array15 {

	public static void main(String[] args) {
		
		System.out.println("Enter the limit of array:\n");
		Scanner input=new Scanner(System.in);
		int limit=input.nextInt();
		int[] arr=new int[limit];
		
		Array15 ob=new Array15();
		
		ob.getArray(arr);
		ob.displayArray(arr);
	}
	
	 void getArray(int[] arr) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array elements:\n");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
	}
	
	void displayArray(int[] arr) {
		
		System.out.println("Your entered array is :\n");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
	}
}
