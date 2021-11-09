
public class Operation {

	float result;
	
	void Addition(int num1,int num2) {
		
		result=num1+num2;
		System.out.println("The sum is: "+result);
	}
	
	void Subtraction(int num1,int num2) {
		
		if(num1>=num2) {
			result=num1-num2;
			System.out.println("The difference is : "+result);
		}
		if(num1<num2) {
			result=num2-num1;
			System.out.println("The difference is : "+result);
		}
		
	}
	
	void Multiplication(int num1,int num2) {
		
		result=num1*num2;
		System.out.println("The product is : "+result);
	}
	
	void Division(int num1,int num2) {
		
		if(num1>=num2) {
			result=num1/num2;
			System.out.println("The result is : "+result);
		}
		if(num1<num2) {
			result=num2/num1;
			System.out.println("The result is : "+result);
		}
	}
}
