import java.util.Scanner;

public class AddTwoArray {

	public static void main(String[] args) {
		
		System.out.println("Enter the  size of array:\n");
		Scanner input=new Scanner(System.in);
		int limit=input.nextInt();
		
		int[][] arr1=new int[limit][limit];
		int[][] arr2=new int[limit][limit];
		int[][] sum=new int[limit][limit];
		
		getArray(arr1,arr2);
		addArray(arr1,arr2,sum);
		displayArray(sum,limit);
		
	}
	
	static void getArray(int[][] arr1,int[][] arr2) {
		
		System.out.println("Enter the elements of array1:");
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				arr1[i][j]=input.nextInt();
			}
		}
		
		System.out.println("Enter the elements of arr2:\n");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				arr2[i][j]=input.nextInt();
			}
		}
	}
	static void addArray(int[][] arr1,int arr2[][],int[][] sum) {
		
		for(int i=0;i<sum.length;i++) {
			for(int j=0;j<sum.length;j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
	}
	
	static void displayArray(int[][] sum,int limit) {
		
		System.out.println("The array Sum is :\n");
		
		for(int i=0;i<sum.length;i++) {
			for(int j=0;j<sum.length;j++) {
				System.out.print(" "+sum[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}


}

