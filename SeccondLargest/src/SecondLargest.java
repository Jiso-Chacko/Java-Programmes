import java.util.Scanner;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the array limit:\n");
		Scanner input=new Scanner(System.in);
		
		int limit=input.nextInt();
		int[] arr=new int[limit];
		System.out.println("Enter the array values:\n");
		
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		int firstLarge=arr[0];
	    
		for(int i=0;i<arr.length;i++) {
			if(firstLarge<arr[i]) {
				firstLarge=arr[i];
			}
		}
		System.out.println("The first Largest element is:\n"+firstLarge);
		int secondLarge=arr[0];
		
		System.out.println("The Second Largest element is:\n");
		for(int i=0;i<arr.length;i++) {
			if(secondLarge<arr[i] &&  arr[i]!=firstLarge) {
				secondLarge=arr[i];
			}
			
		}
		System.out.println(secondLarge);
		
	}

}
