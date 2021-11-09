package incomeTax;

import java.util.Scanner;

public class incomeTax {
	
	public static void main(String[] args) {
		
		Scanner incomeTax=new Scanner(System.in);
		System.out.println("Enter the amount:\t");
		
		float income=incomeTax.nextInt();
		
		if(income<=250000) {
			System.out.println("No Incometax");
		}
		if(income>250000 && income<=500000) {
			float tax=(income*5)/100;
			System.out.println("The incometax is:"+tax);
		}
		if(income>500000 && income<=1000000) {
			float tax=(income*20)/100;
			System.out.println("The incometax is:"+tax);
		}
		if(income>1000000 && income<=5000000) {
			float tax=(income*30)/100;
			System.out.println("The incometax is:"+tax);
		}
		
	}

}
