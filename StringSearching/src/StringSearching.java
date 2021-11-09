import java.util.Scanner;

public class StringSearching {

	public static void main(String[] args) {
		
		int startfrom=0;
		int count=0;
		
		System.out.println("Enter the String:\n");
		
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		
		
		
		for(;;) {
			
			int index=str.indexOf('j',startfrom);
			
			if(index>=0) {
				
				count=count+1;
				startfrom=index+1;
			}
			else 
				break;
			
		}
		
		System.out.println(count);
		
	}
}
