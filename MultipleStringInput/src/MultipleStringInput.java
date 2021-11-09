import java.util.Arrays;
import java.util.Scanner;

public class MultipleStringInput {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of strings you want to enter:\n");
		Scanner input=new Scanner(System.in);
		
		
		String[] str=new String[input.nextInt()];
		input.nextLine();
		System.out.println("Enter the name of malayalam movies:\n");
		for(int i=0;i<str.length;i++) {
			str[i]=input.nextLine();
		}
		
		Arrays.sort(str);
		System.out.println("The sorted list is :\n"+Arrays.toString(str));
	}
}
