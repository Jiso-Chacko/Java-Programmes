package area;

public class area {

	void circle(double radius){
		double pi=3.14;
		double area=pi*radius*radius;
		System.out.println("The area is :\n"+area);
	}
	
    void square(double side){
    	double area=side*side;
    	System.out.println("The area is :\n"+area);
		
	}
    void rectangle(double length, double breadth){
    	double area=length*breadth;
    	System.out.println("The area is :\n"+area);
		
	}
    void triangle(double base, double height){
		double area=0.5*base*height;
		System.out.println("The area is :\n"+area);
	}
	
}
