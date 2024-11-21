package CoreJava;
//1.Write Java Exception Handling program  using finally block.

public class ExceptionHandlingFinallyBlock {

	public static void main(String[] args) {
		try {
			// The code inside this block will attempt to execute
			int a = 10 / 0; // This will throw an ArithmeticException (division by zero)
			System.out.println("Try Block"); // This line will not execute because of the exception
		} 
		catch (Exception e) {
			// This block handles the exception thrown in the try block
			System.out.println(e); // Print the exception message: java.lang.ArithmeticException: / by zero
			System.out.println("Catch block executed"); // Indicate that the catch block has been executed
		} 
		finally {
			// This block will always execute regardless of whether an exception is thrown or not
			System.out.println("Finally block executed"); // Indicate that the finally block has been executed
		}
	}
}
/*output:java.lang.ArithmeticException: / by zero
Catch block executed
Finally block executed
 */