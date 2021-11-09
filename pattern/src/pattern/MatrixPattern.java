package pattern;

public class MatrixPattern {
	
	public static void main(String[] args) {
		int i,j,temp=0,limit=33,n = 0;
		
		int[] a=new int[33];
		System.out.println("Enter the array elements:\n");
		for(i=0;i<33;i++) {
			a[i]=i+1;
		}
		System.out.println("Enter the array elements are:\n");
		for(i=0;i<33;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		for(i=0;i<limit;i++) {
			if(a[i]%2!=0) {
				a[i]=a[i+1];
				limit=limit-1;
				
			}else {
				a[i]=a[i+1];
			}
			
		}i=i-1;
		System.out.println();
		System.out.println(limit);
		for(i=0;i<limit;i++) {
			System.out.print(a[i]+" ");
		}
		
		
		/*for(i=0;i<limit;i++) {
			temp=a[i];
			a[i]=a[limit-1];
			a[limit-1]=temp;
			limit--;
		}
		int n=0;
		for(i=0;i<33;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		
		for(i=0;i<7;i++) {
			for(j=0;j<7;j++) {
				if(j==0 || i==0|| j==6 || i==6 || i==j || i+j==6) {
					System.out.print(a[n]+"\t");
					n++;
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
			System.out.println();
		}*/
	}

}
