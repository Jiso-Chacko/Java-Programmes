import java.util.Scanner;

public class SampleThis {
	
	public static void main(String[] args) {
		
		System.out.println("Enter two numbers:\n");
	     
		Scanner var=new Scanner(System.in);
		
		int a=var.nextInt();
		int b=var.nextInt();
		
		This s=new This(a,b);
		
	}
	
}
