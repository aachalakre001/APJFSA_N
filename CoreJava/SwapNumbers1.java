package CoreJava;

import java.util.Scanner;

public class SwapNumbers1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int a=sc.nextInt(),b;
		System.out.println("Enter num2: ");
		int c=sc.nextInt();
		b=a;
		a=c;
		c=b;
		System.out.println("after swapping num1: "+a);
		System.out.println("after swapping num2: "+b);
	}

}
/*output:
Enter num1: 
24
Enter num2: 
98
after swapping num1: 98
after swapping num2: 24
 */