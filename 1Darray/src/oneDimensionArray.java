import java.util.Scanner;

public class oneDimensionArray {

	public static void main(String[] args) {
		Scanner arrayLimit= new Scanner(System.in);
		System.out.println("Enter the array limit:\n");
		int limit=arrayLimit.nextInt();
		
		int[] array = new int[10];
		System.out.println("Enter the array values:\n");
		for(int i=0;i<limit;i++) {
			array[i]=arrayLimit.nextInt();
		}
		System.out.println("The array values are:\n");
		for(int i=0;i<limit;i++) {
			System.out.print(array[i]);
		}

	}

}
