import java.util.Scanner;

public class Extra12 {
	public static void main(String[] args) {
		
		System.out.println("Enter the String:\n");
		
		Scanner input=new Scanner(System.in);
		
		String str=input.nextLine();
		int count1=0;
		int count2=0;
		int count3=0;
		
		for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		
		if(ch >='a' && ch<='z' || ch>='A' && ch<='Z') {
			count1=count1+1;
		}
		else if(ch>='0' && ch<='9') {
			count2=count2+1;
		}
		else {
			count3=count3+1;
		}
	  }
		System.out.println("The number of alphabets present is: "+count1+"\n"
	                        +"The number of Digits present is: "+count2+"\n"
	                        +"The number of Special Characters present is: "+count3);
	}

}
