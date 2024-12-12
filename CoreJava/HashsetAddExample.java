package CoreJava;

//Write a Java program to append the specified element to the end of a HashSet.

import java.util.HashSet;

public class HashsetAddExample { 

	public static void main(String[] args) {
		// Creating a HashSet of String type
		HashSet<String> set = new HashSet<String>();

		// Adding elements to the HashSet
		set.add("Aachal"); 
		set.add("Shubhangi"); 
		set.add("Priya"); 

		// Printing the HashSet
		// Note: HashSet does not maintain any insertion order
		System.out.println(set);

		// Adding another element to the HashSet
		set.add("Prabhat"); 

		// Printing the HashSet after adding the new element
		System.out.println("After appending new set to the end of existing set: " + set);
	}
}
/*output:[Aachal, Shubhangi, Priya]
		After appending new set to the end of existing set: [Aachal, Shubhangi, Priya, Prabhat]
 */