package Recursion;

public class Power {
	
	public static void main(String[] args) {
		
		System.out.println(power(3, 2));
		
	}
	
	static double power(int a,int b) {
		
		if(b==0) {
			return 1;
		}
		
		return a*Math.pow(a, b-1);
	}

}
