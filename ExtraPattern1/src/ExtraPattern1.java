import java.util.Scanner;

public class ExtraPattern1 {
	public static void main(String[] args) {
		char alphabet='A';
		System.out.println("Enter the limit");
		Scanner patternLimit=new Scanner(System.in);
		int limit=patternLimit.nextInt();
		for(int i=1;i<=limit;i++) {
			for(int j=0;j<i;j++) {
				
				System.out.print(alphabet);
			}
			alphabet=++alphabet;
			System.out.println();
		}
	}

}
