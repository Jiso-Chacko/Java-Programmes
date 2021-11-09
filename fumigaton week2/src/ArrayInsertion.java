import java.util.Scanner;

public class ArrayInsertion {
	public static void main(String[] args) {
		
		int i=0;
		System.out.println("Enter the limit:\n");

		Scanner input=new Scanner(System.in);
		
		///System.out.println("Enter the number of elements to be inserted:\n");
		///nt n=input.nextInt();

		int limit=input.nextInt();
		int[] arr=new int[limit+1];
		System.out.println("Enter the array values:\n");
		for(i=0;i<limit;i++) {
			arr[i]=input.nextInt();
		}
		
		System.out.println("Enter the position of x:\n");
		int pos=input.nextInt();
		
		System.out.println("Enter the x :\n");
		int x= input.nextInt();
		
		for(i=0;i<pos;i++){
			if(i==pos-1) {
				
				//System.out.println(limit);
				for(int j=limit;j>i;j--) {
					arr[j]=arr[j-1];
				}
				arr[i]=x;
			}
		}
		
		System.out.println("The new array:\n");
		for(i=0;i<=limit;i++) {
			System.out.println(arr[i]);
		}
	}
}
