package extra5;

import java.util.Scanner;

public class StringExchange {

	public static void main(String[] args) {
		
		System.out.println("Enter the String:\n");
		
		Scanner input=new Scanner(System.in);
		
		String str1=input.nextLine();
		
		char[] str1Array=str1.toCharArray();
		char[] str2Array=new char[20];
		
		for(int i=0;i<str1Array.length;i++) {
			str2Array[i]=str1Array[i];
		}
		String str=String.valueOf(str2Array);
		
		System.out.println("The exchanged array is:\n"+str);
	}
}
