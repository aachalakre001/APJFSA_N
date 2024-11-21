package CoreJava;
//1.create Java Program to print the largest element in an array
import java.util.Scanner;

public class LargestInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//user to enter the size of the array
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		//Declare the array and input its elements
		int[] array = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt(); // Input each element
		}

		// Initialize the largest element with the first element in the array
		int largest = array[0];

		// Traverse the array to find the largest element
		for (int i = 1; i < size; i++) {
			if (array[i] > largest) { // Update largest if current element is greater
				largest = array[i];
			}
		}

		// Display the largest element
		System.out.println("The largest element in the array is: " + largest);

	}
}
/*Output:Enter the size of the array: 5
Enter the elements of the array:
34 
45
65 
23 
87
The largest element in the array is: 87
 */
