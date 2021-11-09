
public class AssigQ12 {
	
	public static void main(String[] args) {
		
		
//		for(int i=1;i<=5;i++) {
//			for(int j=i;j<=5;j++) {
//				if(i==1 || j==i || j==5) {
//					System.out.print(j+" ");
//						
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		int limit=5;
//		for(int i=1;i<=limit;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				
//			if(j==1 || j==i || i==limit) {
//					System.out.print(j+"  ");
//				}
//				else {
//					System.out.print("   ");
//				}
//			}
//			System.out.println();
//		}
//		int i,j,p,n;
//		for(i=1;i<=5;i++) {
//			p=i;
//			
//			for(j=1;j<=5;j++) {
//				
//				if(i+j>=6) {
//					
//					System.out.print(p+" ");
//					p++;
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			for(j=i;j>=2;j--) {
//				n=j;
//				System.out.print(n+" ");
//			    n=n+2;
//			}
//			System.out.println();
//		}
		
//		int limit=5;
//		for(int i=1;i<=limit;i++) {
//			int num=i;
//			for(int j=limit-i;j>0;j--) {
//				System.out.print("\t");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(num+"\t");
//				num++;
//			}
//		    num=num-2;
//			for(int j=1;j<=i-1;j++) {
//				System.out.print(num+"\t");
//				num--;
//			}
//			System.out.println();
//			
//			
//		}
//		int p=3;
//	    int	k=3,z=4,r=1;
//		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(p+" ");	
//			}
//			p++;
//			System.out.println();
//		}
//		
//		for(int i=3;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//					System.out.print(i+2+" ");
//			}
//			System.out.println();
//		}
			
//		int p=1;
//		
//		for(int z=1;z<=4;z++) {
//			if(z==1 || z==4) {
//				System.out.print("* ");
//			}
//			else {
//	
//		for(int i=1;i<=3;i++) {
//			int n=1;
//			for(int j=1;j<=p;j++) {
//				
//				if(j<=i) {
//					System.out.print(n+" ");
//					n++;
//				}
//				else {
//					n=n-2;
//					System.out.print(n+" ");
//					n++;
//				}
//			}
//			p=p+2;
//			System.out.println();
//		}
//		}
//		}
////			
//		int k=1,n=1;
//		for(int i=1;i<=2;i++) {
//			for(int j=k;j<=3;j++) {
//				
//				if(j<=i+1) {
//					System.out.print(n+" ");
//					n++;
//				}
//				else {
//					n=n-2;
//					System.out.print(n+" ");
//					//n++;
//				}
//			}
//			k=k+2;
//			System.out.println();
//		}
		
		
//		
//		int j,i;
//		
//		for(i=5;i>=1;i--) {
//			for(j=10;j>=1;j--) {
//				
//				if(j<=i || j>10-i ) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}	
//			}
//			System.out.println();
//		}
//		
//		
//		
//		
//		for(i=1;i<=5;i++) {
//			for(j=1;j<=10;j++) {
//				
//				if(j<=i || j>10-i ) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}	
//			}
//			System.out.println();
//		}
//	System.out.println("********************************************");
		int i,j;
		for( i=1;i<=9;i++) {
			for( j=1;j<=9;j++) {
				
				if(j==1 || i==1 || j==i || i+j==10 ||j==9 || i==9) {
					
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			System.out.println();
		}
		
		
	}
}
