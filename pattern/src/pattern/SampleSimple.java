package pattern;

public class SampleSimple {
	public static void main(String[] args) {
		
		int row=2;
		int count=1;
		int z=0;
		int[] arr= {1,2,3,4,5,6,7,8,9,20,11};
		int p=arr.length;
		
		
		for(int i=1;i<p;i++) {

			if(count%2==0) {
				System.out.print(arr[z]+"\n");
				z++;
				p--;
			}
			System.out.print(arr[z]+"\n");
				z++;
				p--;
				
			
			for(int j=1;j<=row;j++) {
				System.out.print(arr[z]+" ");
				z++;
				p--;
			}
			System.out.println();
			count++;
			row=row+2;
			//z++;
			}
		
		
		
		
		
	}
	}


