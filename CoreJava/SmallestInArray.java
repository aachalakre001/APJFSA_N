package CoreJava;
//2. Create Java Program to print the smallest element in an array
import java.util.Scanner;

public class SmallestInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//user to enter the size of the array
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		// Declare the array and input its elements
		int[] array = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt(); // Input each element
		}

		// Initialize the smallest element with the first element in the array
		int smallest = array[0];

		// Traverse the array to find the smallest element
		for (int i = 1; i < size; i++) {
			if (array[i] < smallest) { // Update smallest if current element is smaller
				smallest = array[i];
			}
		}

		// Display the smallest element
		System.out.println("The smallest element in the array is: " + smallest);

	}
}
/*output:Enter the size of the array: 5
Enter the elements of the array:
34
78
65
23
12
The smallest element in the array is: 12
 */
