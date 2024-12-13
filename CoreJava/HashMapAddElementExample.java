//2.Write a program to add elements to the HashMap given the key as integer and value data type is String.

package CoreJava;

import java.util.HashMap;

public class HashMapAddElementExample {

	public static void main(String[] args) {

		// Create a HashMap with Integer keys and String values
		HashMap<Integer, String> map = new HashMap<>();

		// Add elements to the map
		map.put(1, "Aachal");
		map.put(2, "Shubhangi");
		map.put(3, "Prabhat");

		// Print the map
		System.out.println(map);
	}
}

//output:{1=Aachal, 2=Shubhangi, 3=Prabhat}
