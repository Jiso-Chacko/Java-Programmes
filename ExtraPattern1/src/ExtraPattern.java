import java.util.Scanner;

public class ExtraPattern {
	public static void main(String[] args) {
		
		System.out.println("Enter the limit:\n");
		Scanner input=new Scanner(System.in);
		int i,j,flag=0;
		int limit=input.nextInt();
		for(i=0;i<limit;i++) {
			for(j=i;j<limit;j++) {
				System.out.print("  ");
			}
			for(j=0;j<=i;j++) {
				if(j==0 || j==i) {
				System.out.print("1   ");
				}
				else {
					flag+=1;
					System.out.print(flag+"   ");
				}
			}
			flag=1;
			System.out.println();
		 }
		}
	}


