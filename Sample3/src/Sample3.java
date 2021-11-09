import java.util.Scanner;

public class Sample3 {
	public static void main(String ar[]) {
		System.out.println("Enter two numbers :\n");
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a*b;
		
		System.out.println("The product is : "+c);		
	}
}
