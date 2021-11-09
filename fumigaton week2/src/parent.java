
public class parent{
	
	int speedlimit;
	parent(){
		System.out.println("In parent");
		this.speedlimit = 90;
	}
     void method() {
		//System.out.println("Base class method called with integer a = "+a);
	}
	
     void method(double b) {
		this.method(10);
		System.out.println("Base class method called with double b = "+b);
	}

	public static void main(String[] args) {
		
		
		int a;
		
		//this.method();
		//parent.method(10);
	}
}
