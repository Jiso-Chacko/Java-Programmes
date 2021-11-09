import java.util.Scanner;

public class UniqueElements {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter the limit:\n");
		Scanner input=new Scanner(System.in);
		
		int limit=input.nextInt();
		int[] arr=new int[limit];
		
		System.out.println("Enter the array values:\n");
		
		for(int i=0;i<limit;i++) {
			arr[i]=input.nextInt();
		}
		
		for(int i=0;i<limit;i++) {
			//System.out.print(arr[i]);
			int flag=0;
			for(int j=i+1;j<limit;j++) {
				//System.out.print(arr[j]);
				//System.out.println();
				if(arr[i]==arr[j]) {
					for(int k=j;k<limit-1;k++)
					arr[k]=arr[k+1];
					j--;
					limit--;
					flag=1;
				}
			}
			//System.out.println(arr[i]);
			if(flag==1) {
			for(int k=i;k<limit-1;k++)
				arr[k]=arr[k+1];
				i--;
				limit--;
				flag=1;
			}
		}
		
		System.out.println("The unique elements are:\n");
		
		for(int i=0;i<limit;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println("******************************");
		int n=0;
		int k=1;
		
		for(int i=1;i<=3;i++) {
			
			for(int j=1;j<=2;j++) {
				for(int p=1;p<=2;p++) {
					if(n<limit) {
					System.out.print(arr[n]+"\t");
					n++;
					}else {
						break;
					}
				}
			
				System.out.println();
			}
		
			for(int j=1;j<=3*k;j++) {
				if(n<limit) {
				System.out.print(arr[n]+"\t");
				n++;
				}
				else {
					break;
				}
			}
			k++;
			System.out.println();
		
		}
		
	}
}
