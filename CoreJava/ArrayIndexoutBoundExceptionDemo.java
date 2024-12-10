package CoreJava;
//Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.[
//Hint: Use array and loop and try to access the element beyond the last index]
public class ArrayIndexoutBoundExceptionDemo {

	public static void main(String[] args) {

		// Initialize an array with 5 elements
		int[] numbers = {10, 20, 30, 40, 50};

		try {
			// Attempt to access elements beyond the array's bounds
			for (int i = 0; i <= numbers.length; i++) {
				System.out.println("Accessing element at index " + i + ": " + numbers[i]);
			}
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			// Catch and handle the exception
			System.out.println("Exception caught: " + e);
		}
	}
}
/*output:Accessing element at index 0: 10
Accessing element at index 1: 20
Accessing element at index 2: 30
Accessing element at index 3: 40
Accessing element at index 4: 50
Exception caught: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
 */


