package pattern;

public class StarPatternodd {
	
	public static void main(String[] args) {
		
		int p=3;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=2*p-1;j++) {
				System.out.print("* ");
			}
			p--;
			System.out.println();
		}
	}
}
