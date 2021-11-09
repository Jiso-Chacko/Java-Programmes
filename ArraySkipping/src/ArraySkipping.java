import java.util.Scanner;

public class ArraySkipping {
	public static void main(String[] args) {
		
		int i=0;
		System.out.println("Enter the array limit:\n");
		Scanner input= new Scanner(System.in);
		
		int limit=input.nextInt();
		int[] arr=new int[limit];
		System.out.println("Enter the array values:\n");
		
		for(i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		int j=0;
		System.out.println("The skipped array is:\n");
		while(j<limit) {
			if(arr[j]%2!=0) {
				System.out.println(arr[j]);
				j=j+3;
			}
			else {
				System.out.println(arr[j]);
				j++;
			}
		}
		/*System.out.println("The skipped array is:\n");
		for(i=0;i<limit;i++) {
			System.out.println(arr[i]);
		}*/
	}

}
