import java.util.Scanner;

public class Half_Number_Pattern {
	public static void main(String[] args) {
		System.out.println("Enter the limit:\n");
		Scanner limitofthepattern= new Scanner(System.in);
		
		int limit = limitofthepattern.nextInt();
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
	}

}
