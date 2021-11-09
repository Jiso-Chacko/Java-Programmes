import java.util.Scanner;

public class Mathematicaloperation {
 public static void main(String ar[]) {
	 
	 Scanner mathematicalOperation=new Scanner(System.in);
	 System.out.println("Enter the mathematical operation to be performed:\n1-Addition\n2-Substraction\n3-Multiplication\n4-Division\n");
	 int choice=mathematicalOperation.nextInt();
	 System.out.println("Enter two numbers:");
	 
	 int num1=mathematicalOperation.nextInt();
	 int num2=mathematicalOperation.nextInt();
	 
	 Operation ob=new Operation();
	 
	 if(choice==0||choice>4) {
		 System.out.println("Invalid Entry.");
	 }
	 
	 if(choice==1) {
		 ob.Addition(num1, num2);
		 
	 }
	 
	 if(choice==2) {
		 ob.Subtraction(num1, num2);
	 }
	 
	 if(choice==3) {
		 ob.Multiplication(num1, num2);
	 }
	 
	 if(choice==4) {
		 ob.Division(num1, num2);
	 }
 
 }
}
