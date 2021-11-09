package pattern;

public class StarPattern1 {

	public static void main(String[] args) {
		int b=0;
		int k=1;
		for(int i=1;i<=3;i++) {
			
			
			if(b==0) {
				System.out.print("* ");
			}
			
			
			b=b+1;
			System.out.println();
			
			for(int j=1;j<=k;j++) {
				for(int p=1;p<=k;p++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			k=k+1;
			//System.out.println();
			if(b>0){
				for(int j=1;j<=3*b;j++) {
					System.out.print("* ");
				}
		}
		//System.out.println();
	}
}
}
