//3.Write a Java program to remove all elements from a hash set.
package CoreJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetElementRemoveExample {

	public static void main(String[] args) {

		// Create a HashSet and add some elements
		HashSet<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Dragonfruit");
		set.add("cherry");

		// Display the HashSet before removal
		System.out.println("HashSet before removal: " + set);

		// Remove elements one by one using an iterator
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			iterator.next(); // Move to the next element
			iterator.remove(); // Remove the current element
		}

		// Display the HashSet after removal
		System.out.println("HashSet after removal: " + set);
	}
}
/*output:
HashSet before removal: [cherry, Apple, Dragonfruit]
HashSet after removal: []
 */

