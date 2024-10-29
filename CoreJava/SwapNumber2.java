package CoreJava;
//WAP for swapping number without using 3rd variable
import java.util.Scanner;

public class SwapNumber2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");//user input for num1
		int a=sc.nextInt();
		System.out.println("Enter num2: ");//user input for num2
		int c=sc.nextInt();
		a=a+c;// a=a+c=23+43=66
		c=a-c;// c=a-c=66-43=23
		a=a-c;// a=a-c=66-23=43
		System.out.println("after swapping num1: "+a);//printing 43 as num1 after swapping
		System.out.println("after swapping num2: "+c);//printing 23 as num2 after swapping


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
