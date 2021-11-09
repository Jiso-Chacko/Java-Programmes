package extra16;

import java.util.Scanner;

public class HandShakes {
	
	public static void main(String[] args) {
		
		int handShakes = 0;
		System.out.println("Enter the number of students:\n");
		
		Scanner input=new Scanner(System.in);
		int students=input.nextInt();
		
		int flag1=0;
		int flag2=0;
		
		for(int i=2;i<=students;i++) {
			if(i%2!=0) {
				flag1++;
			}
			if(i%2==0) {
				flag2++;
			}
		}
		if(students%2!=0) {
			handShakes=students*flag1;
		}
		if(students%2==0) {
			handShakes=(students*flag2)-flag2;
		}
		System.out.println("The number of handshakes equals: "+handShakes);	
	}
}
