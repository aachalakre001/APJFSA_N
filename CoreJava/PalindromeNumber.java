package CoreJava;
//check the number is palindrome or not

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// user input
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		// Check if the number is a palindrome
		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}

	}

	// Function to check if a number is a palindrome
	public static boolean isPalindrome(int number) {
		int originalNumber = number;
		int reversedNumber = 0;

		while (number != 0) {
			int digit = number % 10; // Get the last digit
			reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
			number /= 10; // Remove the last digit
		}

		// Check if the original number is equal to the reversed number
		return originalNumber == reversedNumber;
	}
}
/*output:Enter a number: 121
121 is a palindrome.*/
