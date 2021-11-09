package extra20;

import java.util.Scanner;

public class Extra20 {
	
	public static void main(String[] args) {
		
		
		Extra20 ob=new Extra20();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your choice:\n1.Matrix Addition\n2.Matrix Multiplication\n3.Matrix Subtraction\n4.Matrix Transpose.\n");
		int choice=input.nextInt();
		
		System.out.println("Enter the limit of matrices:\n");
		
		
		int limit=input.nextInt();
		int[][] mx1=new int[limit][limit];
		int[][] mx2=new int[limit][limit];
		int[][] add=new int[limit][limit];
		
		if(choice==1) {
		System.out.println("Enter the values of matrix1:\n");
		for(int i=0;i<mx1.length;i++) {
			for(int j=0;j<mx1.length;j++) {
				mx1[i][j]=input.nextInt();
			}
		}
		System.out.println("Enter the values of matrix2:\n");
		for(int i=0;i<mx2.length;i++) {
			for(int j=0;j<mx2.length;j++) {
				mx2[i][j]=input.nextInt();
			}
		}
		/*for(int i=0;i<add.length;i++) {
			for(int j=0;j<add.length;j++) {
			  add[j][j] = ob.mx3;
			}*/
		int[][] add1=matrixAddition(mx1,mx2,limit);
		for(int i=0;i<add1.length;i++) {
			for(int j=0;j<add1.length;j++) {
		System.out.print(add1[i][j]+" ");
			}
			System.out.println();
		}	
		//int[][] mx3=ob.matrixAddition(mx1, mx2, limit);
		//System.out.println("The result is : "+mx3);
	}
	}	
	
	static int[][] matrixAddition(int[][] mx1,int[][] mx2,int limit) {
		
		int[][] mx3=new int[limit][limit];
		
		System.out.println("The resulting matrix after addition is :\n");
		for(int i=0;i<mx3.length;i++) {
			for(int j=0;j<mx3.length;j++) {
				mx3[i][j]=mx1[i][j]+mx2[i][j];
			}
		}
		return mx3;
	}

}
