package pattern;

public class StarPatternex {

	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++) {
			
			if(i%2!=0) {
				for(int j=1;j<=i;j++) {
				  
					System.out.print("*\n");
					//System.out.println();
				}
				//System.out.println();
			}
			if(i%2==0) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
	}
	
	}
}
