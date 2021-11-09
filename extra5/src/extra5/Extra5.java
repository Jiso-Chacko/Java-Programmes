package extra5;

import java.util.Scanner;

public class Extra5 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string:\n");
		
		Scanner input=new Scanner(System.in);
		
		String str=input.nextLine();
		char[] strArray=str.toCharArray();
		
		System.out.println("Enter the position of character to be changed:\n");
		
		int position=input.nextInt();
		System.out.println("Enter the character you desire:\n");
		char c=input.next().charAt(0);
		strArray[position-1]=c;
		str=String.valueOf(strArray);
		System.out.println("The replaced String:\n"+str);
	}

}
