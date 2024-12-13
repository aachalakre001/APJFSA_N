/*1.Create a Student class and create an array list to add 10 student 
	objects and print them using a for each loop.
 */

package CoreJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudentExample {

	public static void main(String[] args) {
		// Create an ArrayList to store Student objects
		ArrayList<Student10> students = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Ask user for 10 student names
		for (int i = 1; i <= 10; i++) {
			System.out.print("Enter name for Student " + i + ": ");
			String name = scanner.nextLine(); // Read input from user
			students.add(new Student10(name)); // Add student to list
		}

		// Use a for-each loop to print the student names
		System.out.println("\nList of Students:");
		for (Student10 student : students) {
			System.out.println(student);
		}

	}
}
class Student10{
	String name;
	// Constructor to initialize student name
	Student10(String name) {
		this.name = name;
	}

	// Overriding toString method to print student details
	@Override
	public String toString() {
		return name;
	}
}
/*output:Enter name for Student 1: aachal 
Enter name for Student 2: shubhangi
Enter name for Student 3: prabhat
Enter name for Student 4: vivek
Enter name for Student 5: anuj
Enter name for Student 6: shravi
Enter name for Student 7: vikas
Enter name for Student 8: aniker
Enter name for Student 9: aman
Enter name for Student 10: pooja

List of Students:
aachal 
shubhangi
prabhat
vivek
anuj
shravi
vikas
aniker
aman
pooja
 */