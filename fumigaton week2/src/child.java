
public class child extends parent {
	
	int speedlimit;
	child(){
		System.out.println("In child");
		this.speedlimit = 100;
	}
   void method(double d) {
	   
	   System.out.println("Child class method called with double d ="+d);
   }
	
public static void main(String[] args) {
	
	parent ob=new child();
	
	System.out.println("The speed limit is :"+ob.speedlimit);
	System.out.println(ob.speedlimit);
}	

}
