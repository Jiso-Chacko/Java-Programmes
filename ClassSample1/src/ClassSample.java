import java.util.Scanner;

public class ClassSample {

	public static void main(String ar[]) {
		 
		System.out.println("Enter two numbers");
		
		Scanner var=new Scanner(System.in);
		
		int a=var.nextInt();
		int b=var.nextInt();
		ForObject s1=new ForObject();
		s1.sum(a,b);
		
		
		
	}
}
