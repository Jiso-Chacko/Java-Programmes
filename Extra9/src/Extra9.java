import java.util.Scanner;

public class Extra9 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the character to find the ASCII value:\n");
		Scanner input=new Scanner(System.in);
		
		char ch=input.next().charAt(0);
		int ascii=ch;
		
		System.out.println("The ASCII value is :\n"+ascii);	
	}
}
