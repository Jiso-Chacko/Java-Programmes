import java.util.Scanner;

public class Q19 {
	
	public static void main(String[] args) {
		
		int i=0;
		char a = 0;
		System.out.println("Enter the limit:\n");

		Scanner input=new Scanner(System.in);
		
		int limit=input.nextInt();
		String[] arr=new String[limit];
		System.out.println("Enter the array values:\n");
		for(i=0;i<limit;i++) {
			arr[i]=input.nextLine();
		}
		
		/*for(i=0;i<limit;i++) {
			if(arr[i]%2!=0) {
				arr[i]=9733;
			}
			else {
				continue;
			}
		}*/
		System.out.println("The new array:\n");
		for(i=0;i<limit;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
