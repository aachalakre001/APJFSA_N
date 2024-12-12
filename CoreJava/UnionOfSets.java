package CoreJava;
//write a java program to union of two sets

import java.util.HashSet;

public class UnionOfSets {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();

		// Adding elements to set1
		set1.add(1); 
		set1.add(2); 
		set1.add(3);
		System.out.println("Set1: "+set1);

		// Adding elements to set2
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("Set2: "+set2);

		// Union of set1 and set2
		set1.addAll(set2);

		// Print the union of two sets
		System.out.println("Union of sets: " + set1);
	}
}
/*output:Set1: [1, 2, 3]
Set2: [3, 4, 5]
Union of sets: [1, 2, 3, 4, 5]
 */
