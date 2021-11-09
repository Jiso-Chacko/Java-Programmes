import java.util.Scanner;
public class Ternary {
public static void main(String[] args) {
System.out.println("Enter 3 numbers");
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
int num3 = sc.nextInt();
int smallest;
smallest = num1<num2 ? ( num1< num3 ? num1 : num3 ) : (num2<num3 ? num2
: num3);
System.out.println("Smallest is "+ smallest);
}
}
