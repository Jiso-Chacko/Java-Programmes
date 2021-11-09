import java.util.Arrays;
import java.util.Scanner;

public class StringCompare {
	
	public static void main(String[] args) {
		
		int flag=0;
		int length;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string1:\n");
		String s1=input.nextLine();
		System.out.println("Enter the string2:\n");
		String s2=input.nextLine();
		
		
		char[] ch1=new char[s1.length()];
		for(int i=0;i<s1.length();i++) {
			ch1[i]=s1.charAt(i);
		}
		
		char[] ch2=new char[s2.length()];
		for(int i=0;i<s2.length();i++) {
			ch2[i]=s2.charAt(i);
		}
		if(ch1.length!=ch2.length) {
			flag=1;
		}else {
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=ch2[i]) {
					flag=1;
				}
				
			}
		}
		if(flag==1) {
			System.out.println("not equal");
		}else {
			System.out.println("equal");
		}
	}

}
