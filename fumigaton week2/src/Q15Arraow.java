
public class Q15Arraow {
	
	public static void main(String[] args) {
		
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				
				if(j==i || i==4) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			for(int j=6;j<=9;j++) {
				if(i+j==10 || i==4) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i=5;i<=7;i++) {
			for(int j=1;j<=3;j++) {
				if(j+i==8) {
					System.out.print("*  ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("       ");
			for(int j=7;j<=9;j++) {
				if(j-i==2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
