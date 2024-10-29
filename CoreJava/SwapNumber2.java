package CoreJava;

import java.util.Scanner;

public class SwapNumber2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int a=sc.nextInt();
		System.out.println("Enter num2: ");
		int c=sc.nextInt();
		a=a+c;
		c=a-c;
		a=a-c;
		System.out.println("after swapping num1: "+a);
		System.out.println("after swapping num2: "+c);


	}
}
/*output: 
Enter num1: 
23
Enter num2: 
43
after swapping num1: 43
after swapping num2: 23
 */
