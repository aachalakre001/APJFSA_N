package CoreJava;
//WAP for checking numer is Even or odd 
import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the number you want to check: ");//enter the user input
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		if(num1%2==0) //logic for cheking the number is even or not
		{
			System.out.println("The given number is even number "+num1);
		}
		else {
			System.out.println("The given number is Odd "+num1);
		}

	}

}
/*output:
 Enter the number you want to check: 
5498
The given number is even number 5498
 */
