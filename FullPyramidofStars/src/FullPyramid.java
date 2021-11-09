import java.util.Scanner;

public class FullPyramid {
	public static void main(String[] args) {
		System.out.println("Enter the limit");
		Scanner patternLimit=new Scanner(System.in);
		int limit=patternLimit.nextInt();
		int p=1;
		for(int i=1;i<=limit;i++) {
			for(int j=i;j<=limit;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(p++ +" ");
			}
			for(int j=2;j<=i;j++) {
				
				System.out.print(p+" ");
				p=p-1;
			}
			System.out.println();
	}

 }
}
