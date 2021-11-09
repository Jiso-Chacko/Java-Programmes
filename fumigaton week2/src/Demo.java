
public class Demo {
//	ABCDEFGHIJKLMNOPQRSTUVWXYZ
	
	public static void main(String[] args) {
		
		int p=1,k=7,z=4,r=1;
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=p;j++) {
				if(j%2==0) {
					System.out.print("*");
				}
				else {
				System.out.print(r);
				r++;
				}
			}
			p=p+2;
			System.out.println();
		}
		r=r-4;
		for(int i=1;i<=4;i++) {
			for(int j=k;j>=1;j--) {
				if(j%2==0) {
					System.out.print("*");
				}
				else {
					System.out.print(r);
					r++;
				}
			}
			//z--;
			r=r-k;
			k=k-2;
			System.out.println();
		}
		
	}
}
