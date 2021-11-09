import java.util.Scanner;

public class HalfPyramid {
	
	public static void main(String args[]) {
		
		System.out.println("Enter the limit: ");
		Scanner limitofpyramid=new Scanner(System.in);
		int limit=limitofpyramid.nextInt();
		for(int i=0;i<=limit;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}

}
