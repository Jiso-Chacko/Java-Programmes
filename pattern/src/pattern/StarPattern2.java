package pattern;

public class StarPattern2 {

	public static void main(String[] args) {
		
		int k=1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=2;j++) {
				for(int p=1;p<=2;p++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int j=1;j<=3*k;j++) {
				System.out.print("* ");
			}
			k++;
			System.out.println();
		}
	}
}
