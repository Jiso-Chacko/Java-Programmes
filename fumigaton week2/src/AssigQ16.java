import java.util.Scanner;

public class AssigQ16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int chrAt = 0;
		int swtch = 0;
		int x = 10, y=0;
		int row=6,col=11;
		int i,j;
		int c = 0;
		for(i=0;i<row;i++) {
			chrAt = i;
			swtch = 0;
			c = 0;
			for(j=0;j<col;j++) {
				if(j==0 || j==row-1 || i+j==row-1 || i+j==col-1 || j==col-1) {
					System.out.print(str.charAt(chrAt)+ "  ");
					if (y > 0 && x > 0) {	
						if (swtch == 0) {
							chrAt += x;
							swtch = 1;
							c++;
						}else {
							chrAt += y;
							swtch = 0;
							c++;
						}
						if (c == 4) {
							x =- 2;
							y =+ 2;
							c = 0;
						}
					}else if (y == 0) {
						if (swtch == 0) {
							chrAt += x;
							swtch = 1;
						}else {
							chrAt += x;
							swtch = 0;
							y += 2;
							x -= 2;
						}
					}else if (x == 0) {
						if (swtch == 0) {
							chrAt += y;
							swtch = 1;
						}else {
							chrAt += y;
						}
					}
				}
				else {
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}
	}
}
