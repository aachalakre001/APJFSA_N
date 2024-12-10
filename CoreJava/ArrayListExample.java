package CoreJava;
//Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// Create a List of integers using ArrayList
		List<Integer> list = new ArrayList<>();

		// Add elements to the ArrayList
		list.add(12); 
		list.add(23); 
		list.add(4); 
		list.add(9); 
		list.add(28); 

		// Initialize a variable to store the sum of even numbers
		int sum = 0;

		// Loop through each element in the list
		for (int num : list) {
			// Check if the current number is even
			if (num % 2 == 0) {
				// If even, add it to the sum
				sum += num;
			}
		}

		// Print the sum of all even numbers in the ArrayList
		System.out.println("Sum of the even numbers in the ArrayList is: " + sum);
	}
}

//output:sum of the even number in the arraylist is : 44

