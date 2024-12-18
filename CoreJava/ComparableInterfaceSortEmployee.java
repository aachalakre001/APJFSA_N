package CoreJava;
// Write a java program to implement comparable interface that sorts the Age of Employee Id,Name,Age.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Employee class implementing Comparable interface
class Employee10 implements Comparable<Employee10> {
	private int id;
	private String name;
	private int age;

	// Constructor
	public Employee10(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// Implement compareTo to sort by Age
	public int compareTo(Employee10 other) {
		return Integer.compare(this.age, other.age);
	}

	// toString method to display Employee details
	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Age: " + age;
	}

	public int compareTo1(Employee10 o) {
		return 0;
	}
}

public class ComparableInterfaceSortEmployee {
	public static void main(String[] args) {
		// Create a list of Employees
		List<Employee10> employees = new ArrayList<>();
		employees.add(new Employee10(101, "Aachal", 25));
		employees.add(new Employee10(102, "Ankita", 30));
		employees.add(new Employee10(103, "Bablu", 22));
		employees.add(new Employee10(104, "Rohit", 28));
		employees.add(new Employee10(105, "Vinit", 35));

		// Display Employees before sorting
		System.out.println("Before Sorting:");
		for (Employee10 emp : employees) {
			System.out.println(emp);
		}

		// Sort the list of Employees
		Collections.sort(employees);

		// Display Employees after sorting by Age
		System.out.println("After Sorting by Age:");
		for (Employee10 emp : employees) {
			System.out.println(emp);
		}
	}
}
/*output:Before Sorting:
ID: 101, Name: Aachal, Age: 25
ID: 102, Name: Ankita, Age: 30
ID: 103, Name: Bablu, Age: 22
ID: 104, Name: Rohit, Age: 28
ID: 105, Name: Vinit, Age: 35
After Sorting by Age:
ID: 103, Name: Bablu, Age: 22
ID: 101, Name: Aachal, Age: 25
ID: 104, Name: Rohit, Age: 28
ID: 102, Name: Ankita, Age: 30
ID: 105, Name: Vinit, Age: 35
*/