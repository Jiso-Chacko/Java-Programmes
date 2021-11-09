import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string 1:\n");
		
		String s1=input.nextLine();
		System.out.println("Enter the string 2:\n");
		
		String s2=input.nextLine();
		
		//System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		
		
	}
}
