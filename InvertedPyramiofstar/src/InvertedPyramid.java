import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {
		System.out.println("Enter the limit");
		Scanner patternLimit=new Scanner(System.in);
		int limit=patternLimit.nextInt();
		for(int i=1;i<=limit;i++) {
			for(int j=i;j<=limit;j++) {
				
				System.out.print("*"+"   ");
			}
			System.out.println();

	}

}
}
