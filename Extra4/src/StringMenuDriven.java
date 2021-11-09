import java.util.Scanner;

public class StringMenuDriven {
	
	int flag=0;
	public static void main(String[] args) {
		StringMenuDriven ob=new StringMenuDriven();
		while(1>ob.flag) {
		System.out.println("\nEnter your Choice :\n1.String Length\n2.String Concatenation\n3.String Reverse\n4.If you want to exit.");
	     Scanner input =new Scanner(System.in);
		
		int choice=input.nextInt();
		
			if(choice==1) {
				ob.stringLength();
			}
			if(choice==2) {
				ob.stringConcat();
			}
			if(choice==3) {
				ob.stringReverse();
			}
			if(choice==4) {
				ob.Exit();
			}
			
		}	
		System.out.println("You have exited the programme.");
	}
	void stringLength() {
		
		System.out.println("Enter the string :\n");
		Scanner input=new Scanner(System.in);
		
		//String[] str=new String[input.nextInt()];
		String str=input.nextLine();
		//input.nextLine();
		
		
       int value=str.length();
		/*for(int i=0;i<str.length;i++) {
			flag=flag+i;
		}*/
       
		System.out.println("The string lenght is : "+value);
		
		
	}
	void stringConcat() {
		
		System.out.println("Enter the first string:\n");
		Scanner input=new Scanner(System.in);
		
		String str1=input.nextLine();
		
		System.out.println("Enter the second string:\n");
		
		String str2=input.nextLine();
		
		String str=str1+str2;
		
		System.out.println("The concated string is :\n"+str);
		
	}
	void stringReverse() {
		
		System.out.println("Enter the string:\n");
		
		Scanner input=new Scanner(System.in);
		
		String str=input.nextLine();
		
		byte[] strArray=str.getBytes();
		byte[] result=new byte[strArray.length];
		
		for(int i=0;i<strArray.length;i++) {
			result[i]=strArray[strArray.length-i-1];
		}
		System.out.println("The reversed string is: " +new String(result));
		
	}
	void Exit(){
		flag++;
	}
}

