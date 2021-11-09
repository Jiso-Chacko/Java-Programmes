import java.util.Scanner;

public class Extra8 {

	public static void main(String[] args) {
		
		System.out.println("Enter the array limit:\n");
		
		Scanner input=new Scanner(System.in);
		int limit=input.nextInt();
		
		int[] array=new int[limit];
		System.out.println("Enter the array elemnts:\n");
		
		for(int i=0;i<limit;i++) {
			array[i]=input.nextInt();
		}
		//sorting begins
		int temp=0;
		for(int i=0;i<limit;i++) {
			for(int j=i+1;j<limit;j++) {
				if(array[i]<array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}	
			}
		}
		System.out.println("The sorted array is:\n");
		
		for(int i=0;i<limit;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
