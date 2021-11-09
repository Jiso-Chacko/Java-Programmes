import java.util.Scanner;

public class WithoutLoop {
	
	public static void main(String[] args) {
		System.out.println("Enter the word crossroads:\n");
		Scanner input=new Scanner(System.in);
		String word=input.nextLine();
		
		String s=word+"\n";
		
		String s1=s +s +s;
		String s2=s1+s1+s;
		System.out.println(s2);
	}

}
