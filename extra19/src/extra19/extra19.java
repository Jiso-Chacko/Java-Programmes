package extra19;

import java.util.Scanner;

public class extra19 {
	public static void main(String[] args) {
		
		System.out.println("Enter the weight of the parcel:\n");
		
		Scanner input=new Scanner(System.in);
		int parcel=input.nextInt();
		
		if(parcel<=500) {
			System.out.println("The charge is : 200");
		}
		else if(parcel%500==0) {
			int times=parcel/500;
			
			int charge=200+170*(times-1);
			System.out.println("The charge is : "+charge);
		}
	}
}
