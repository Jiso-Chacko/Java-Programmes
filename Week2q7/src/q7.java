import java.util.Scanner;

public class q7 {
	
	public static void main(String[] args) {
		
		int flag=0;
		System.out.println("Enter the limit:\n");
		
		Scanner input=new Scanner(System.in);
		
		int limit=input.nextInt();
		
		System.out.println("The prime numbers are:");
		for(int n=2;n<=limit;n++) {
			flag=0;
			for(int i=2;i<n/2;i++) {
				if(n%i==0) {
				flag=1;
				break;
				}
			}
			if(flag==0) {
				
					System.out.print(n+" ");
					
				
				
			}
		}
		
		
	}

}
