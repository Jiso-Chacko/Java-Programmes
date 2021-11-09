import java.util.Scanner;

public class Sumofoddnumbers {

	public static void main(String ar[]){
		System.out.println("Enter the limit :\n");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		int sum=0;
		for(int i=0;i<limit;i++) {
			if(i%2!=0) {
				sum =sum+i;
			}
		}
		System.out.println("The sum is : "+sum);				
	}
}
