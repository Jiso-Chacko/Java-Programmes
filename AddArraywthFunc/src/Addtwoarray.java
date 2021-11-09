import java.util.Scanner;

public class Addtwoarray {
	
	
	int[][] arr1;
	int[][] arr2;
	int[][] sum;
	void getarray() {
		
		System.out.println("Enter the array limit:");
		Scanner input=new Scanner(System.in);
		int limit=input.nextInt();
		
		int[][]  arr1=new int[limit][limit];
		int[][] arr2=new int[limit][limit];
		int[][] sum=new int[limit][limit];		
		this.arr1=arr1;
		this.arr2=arr2;
		this.sum=sum;
		System.out.println("Enter the elements of array1:\n");
		
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
	
	void addArray() {
		
		
		for(int i=0;i<sum.length;i++) {
			for(int j=0;j<sum.length;j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
	}
	
	 void displayArray() {
		
		System.out.println("The array sum is:\n");
		
		for(int i=0;i<sum.length;i++) {
			for(int j=0;j<sum.length;j++) {
				System.out.print(" "+sum[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Addtwoarray ob=new Addtwoarray();
		ob.getarray();
		ob.addArray();
		ob.displayArray();
	}
	

}
