package pattern;

public class StarPatternSample {
	public static void main(String[] args) {
		
		int i=0,p=1,q=0;
		
		
		for(i=0;i<4;i++) {
			
			for(int j=1;j<=p;j++) {
				System.out.print("* ");
			}
			p=3*(i+1);
			System.out.println();
			if(i<3) {
			for(int j=1;j<=(i+1);j++) {
				for(int k=1;k<=(i+1);k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			}else {
				System.out.println();
			}
		
			
			//System.out.println();
			/*for(int j=1;j<=p;j++) {
				System.out.print("* ");
			}
			p=3*(i+1);
			System.out.println();*/
		}
	
	}

}
