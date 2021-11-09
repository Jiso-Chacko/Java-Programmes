package area;

import java.util.Scanner;

public class myClass extends area{

	public static void main(String[] args) {
		
		myClass ob=new myClass();
		System.out.println("Enter your choice:\n1.Circle\n2.Square\n3.Rectangle\n4.Triangle.");
		
		Scanner input=new Scanner(System.in);
		int value=input.nextInt();
		if(value==1) {
			  double radius=circle();
			  ob.circle(radius);
		}
		if(value==2) {
		    double side=square();
		    ob.square(side);
		}
		if(value==3) {
			
			double array[]=rectangle();
			double length=array[0];
			double breadth=array[1];
			ob.rectangle(length,breadth);
			}
		if(value==4) {
			double array[]=triangle();
			double base=array[0];
			double height=array[1];
			ob.triangle(base, height);
		}
		}
		
	static double circle() {
		System.out.println("Enter the radius:\n");
		Scanner value= new Scanner(System.in);
		double radius=value.nextDouble();
		return(radius);
		
	}
	static double square() {
		System.out.println("Enter the length of side:\n");
		Scanner value=new Scanner(System.in);
		double side=value.nextDouble();
		return(side);
	}
	static double[] rectangle() {
		System.out.println("Enter length:\n");
		Scanner value=new Scanner(System.in);
		double length=value.nextInt();
		System.out.println("Enter the breadth:\n");
		double breadth=value.nextDouble();
		double[] array= {length,breadth};
		return(array);
	}
	static double[] triangle() {
		
		System.out.println("Enter the length of base:\n");
		Scanner value= new Scanner(System.in);
		double base=value.nextDouble();
		System.out.println("Enter the length of height:\n");
		double height = value.nextDouble();
		double[] array= {base,height};
		return(array);
	}
		
	}


