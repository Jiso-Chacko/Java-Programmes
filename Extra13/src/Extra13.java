import java.util.Scanner;

public class Extra13 {

	public static void main(String[] args) {
		
		Extra13 ob=new Extra13();
		int i,j;
		System.out.println("Enter the limit of array:\n");
		
		Scanner input=new Scanner(System.in);
		
		int limit=input.nextInt();
		int[] arr=new int[limit];
		
		System.out.println("Enter the list of numbers:\n");
		
		for(i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		int maxValue=ob.maxValue(arr);
		System.out.println("The maximum value is: "+maxValue);
	}
	
	 int maxValue(int[] arr) {
		
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int maxValue=arr[arr.length-1];
		return(maxValue);
	}
}
