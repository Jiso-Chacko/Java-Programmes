package weighted_Average;

import java.util.Scanner;

public class weightedAverage {
	
	public static void main(String[] args) {
		
		Scanner mark=new Scanner(System.in);
		System.out.println("Enter the mark of written test:\n");
        float writtenTest=mark.nextInt();
        
        System.out.println("Enter the marks of lab exam:\n");
        float labExam=mark.nextInt();
        
        System.out.println("Enter the marks of Assignments:\n");
        float assignments=mark.nextInt();
        
        float weigAverage=(writtenTest*70)/100+(labExam*20)/100+(assignments*10)/100;
        
        System.out.printf("The grade of the student is :"+weigAverage);
		
		
	}

}
