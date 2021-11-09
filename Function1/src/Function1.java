import java.util.Scanner;

public class Function1 {
	
	public static void main(String ar[]) {
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=sum(a,b);
		System.out.println("The sum is :\n"+result);
	}
	
	static int sum(int num1,int num2) {
		int c=num1+num2;
		return c;
	}

}
