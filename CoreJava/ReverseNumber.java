package CoreJava;
//WAP for Reverse number
import java.util.Scanner; 

public class ReverseNumber {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to reverse: ");
		int number = scanner.nextInt(); 
		int reversedNumber = 0; 

		// Use a while loop to reverse the number
		while (number != 0) {
			int digit = number % 10; // Get the last digit of the number
			reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
			number = number / 10; // Remove the last digit from the number
		}

		// Display the reversed number
		System.out.println("Reversed Number: " + reversedNumber);


	}
}
/*output:Enter a number to reverse: 543
Reversed Number: 345*/


