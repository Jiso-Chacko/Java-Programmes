
public class StaticMethodSample {
	
	static int cube(int x) {
		int cube=x*x*x;
		return cube;
	}
	
	
	public static void main(String[] args) {
		
		int result=StaticMethodSample.cube(3);
		
		System.out.println(result);
	}

}
