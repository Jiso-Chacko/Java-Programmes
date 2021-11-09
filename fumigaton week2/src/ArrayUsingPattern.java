import java.util.Scanner;

public class ArrayUsingPattern {

	public static void main(String[] args) {
		
		
		
		int i=0;
		System.out.println("Enter the limit:\n");

		Scanner input=new Scanner(System.in);
		
		///System.out.println("Enter the number of elements to be inserted:\n");
		///nt n=input.nextInt();

		int limit=input.nextInt();
		int[] arr=new int[limit+1];
		System.out.println("Enter the array values:\n");
		for(i=0;i<limit;i++) {
			arr[i]=input.nextInt();
		}
		
		System.out.println("Enter the position of x:\n");
		int pos=input.nextInt();
		
		System.out.println("Enter the x :\n");
		int x= input.nextInt();
		
		for(i=0;i<pos;i++){
			if(i==pos-1) {
				
				//System.out.println(limit);
				for(int j=limit;j>i;j--) {
					arr[j]=arr[j-1];
				}
				arr[i]=x;
			}
		}
		
		System.out.println("The new array:\n");
		for(i=0;i<=limit;i++) {
			System.out.println(arr[i]);
		}
		
		
		int n=6,p=1,l=0;
		for(int k=1;k<=4;k++) {
			int x1=2;
			for(i=1;i<=2;i++) {
				for(int z=1;z<=x1;z++) {
					if(l<limit) {
					System.out.print("_   ");
					}
					else {
						break;
					}
				}
				for(int j=1;j<=n;j++) {
					if(l<limit) {
					System.out.print(arr[l]+" ");
					l++;
				}
				else {
						break;
					}
				}
				n--;
				x1--;
				System.out.println();
			}n++;
			for(int j=1;j<=p;j++) {
				if(l<limit) {
				System.out.println(arr[l]+" ");
				l++;
				}
				else {
					break;
				}
			}
			p++;
			}	
	}
}
