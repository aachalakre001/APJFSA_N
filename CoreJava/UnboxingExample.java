package CoreJava;
// Write a Java program for Unboxing.

public class UnboxingExample {

	public static void main(String[] args) {
		// Autoboxing: Wrapping primitive int into Integer object
		Integer obj = 8; // This is implicitly done in Java (using autoboxing)

		// Implicit Unboxing:The Automatic conversion of Integer to int
		int a = obj; // The Integer object 'obj' is automatically unboxed to primitive int (implicit unboxing)
		System.out.println("After implicit unboxing the value of a: " + a);

		// Explicit Unboxing: Manually collecting the primitive value from Integer using intValue()
		int b = obj.intValue(); // This is explicit unboxing, calling intValue() explicitly to get the primitive int
		System.out.println("After explicit unboxing the value of b: " + b);
	}
}
/*output:After implicit unboxing the value of a: 8
After explicit unboxing the value of b: 8
 */
