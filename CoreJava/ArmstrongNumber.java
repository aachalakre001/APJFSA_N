package CoreJava;
//WAP for Armstrong Number
import java.util.Scanner; // Import the Scanner class for user input

public class ArmstrongNumber {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);
		//user input
		System.out.print("Enter a number: ");
		int number = scanner.nextInt(); 

		int originalNumber = number; 
		int sum = 0; 

		// Calculate the number of digits in the number
		int numberOfDigits = String.valueOf(number).length();

		// Loop through each digit of the number
		while (number != 0) {
			int digit = number % 10; // Get the last digit
			sum += Math.pow(digit, numberOfDigits); // Raise the digit to the power of numberOfDigits and add to sum
			number /= 10; // Remove the last digit from the number
		}

		// Check if the sum of the powers equals the original number
		if (sum == originalNumber) {
			System.out.println(originalNumber + " is an Armstrong number.");
		} else {
			System.out.println(originalNumber + " is not an Armstrong number.");
		}

	}
}

/*output: Enter a number: 254
254 is not an Armstrong number.
*/
 
