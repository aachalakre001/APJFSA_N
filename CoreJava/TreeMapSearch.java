package CoreJava;

/*Write a Java program to search a key in a Tree Map. 
 [Hint:create a TreeMap and add some name-age pairs to it. 
 Then, the user is prompted to enter a name to search for. 
 If the name exists in the TreeMap, the corresponding age
 is displayed; otherwise, a message indicating that the name was not found is shown.]*/
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapSearch {
	public static void main(String[] args) {
		// Create a TreeMap and add some name-age pairs
		TreeMap<String, Integer> nameAgeMap = new TreeMap<>();
		nameAgeMap.put("Aachal", 22);
		nameAgeMap.put("Rahul", 25);
		nameAgeMap.put("Priya", 21);
		nameAgeMap.put("Vikas", 24);

		// Create a Scanner object for user input
		Scanner scanner = new Scanner(System.in);

		//user input enter a name to search for
		System.out.print("Enter a name to search: ");
		String name = scanner.nextLine();

		// Check if the name exists in the TreeMap
		if (nameAgeMap.containsKey(name)) {
			// Display the corresponding age
			System.out.println("The age of " + name + " is " + nameAgeMap.get(name) + ".");
		} else {
			// Display a message if the name was not found
			System.out.println("The name '" + name + "' was not found in the TreeMap.");
		}

	}
}
/*Output:Enter a name to search: Priya
The age of Priya is 21.*/