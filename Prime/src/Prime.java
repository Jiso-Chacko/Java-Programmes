import java.util.Scanner;

public class Prime {

	public static void main(String ar[]) {
		
		System.out.println("Enter the number:\n");
		Scanner primeNumber=new Scanner(System.in);
		
		int number =primeNumber.nextInt();
		int flag=0;
		if(number==1||number==0){
		System.out.println("The number is nonprime.");
		}else {
			
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				System.out.println("The number is non prime.");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("The number is prime.");
		}
		
	}
}
}
