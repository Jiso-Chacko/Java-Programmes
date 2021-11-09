import java.util.Scanner;

public class Exta7 {

	public static void main(String[] args) {
		
		System.out.println("Enter the String:\n");
		
		Scanner input=new Scanner(System.in);
		
		String str=input.nextLine();
		
		int index=str.indexOf("is");
		
		System.out.println("The index of 'is' is:\n"+index);
	}
}
