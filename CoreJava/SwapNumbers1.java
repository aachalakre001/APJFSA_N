package CoreJava;
//WAP for swapping using 3rd variable
import java.util.Scanner;

public class SwapNumbers1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int a=sc.nextInt(),b;//input from user for num1 and third variable is b
		System.out.println("Enter num2: ");//input for num2
		int c=sc.nextInt();
		b=a;//assign b=24
		a=c;//assign a=98
		c=b;//assign c=24
		System.out.println("after swapping num1: "+a);//print 98 as num1 after swapping
		System.out.println("after swapping num2: "+c);//pring 24 as num2 after swapping
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
