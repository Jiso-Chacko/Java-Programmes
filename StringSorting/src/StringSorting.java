import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {
	
	public static void main(String[] args) {
		
		System.out.println("Enter any five malayalam movies:\n");
		Scanner input=new Scanner(System.in);
		
		String s1=input.nextLine();
		String s2=input.nextLine();
		String s3=input.nextLine();
		String s4=input.nextLine();
		String s5=input.nextLine();
		
		String[] s6= {s1,s2,s3,s4,s5};
		
		Arrays.sort(s6);
		System.out.println(Arrays.toString(s6));
	}

}
