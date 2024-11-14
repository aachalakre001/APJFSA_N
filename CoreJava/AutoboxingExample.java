package CoreJava;

// Write a Java program for Autoboxing.
//Autoboxing: primitive int is automatically converted to Integer object
public class AutoboxingExample {

	public static void main(String[] args) {
		// Implicit Autoboxing
		int i = 10;

		Integer I = i; // Here, int is automatically converted to Integer by Java (implicit autoboxing)

		// Print the value of the primitive and the Integer object
		System.out.println("i:"+i + "\nAfter Implicit autoboxing value of I: " + I);

		// Explicit Autoboxing
		Integer e = Integer.valueOf(i); // This is explicit autoboxing (manually converting the int to Integer)

		// Print the explicitly boxed Integer value
		System.out.println("After Explicit autoboxing value of e: " + e);

	}
}
/*output:-i:10
After Implicit autoboxing value of I: 10
After Explicit autoboxing value of e: 10
 */
