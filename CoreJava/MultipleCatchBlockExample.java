package CoreJava;
//Write Java Exception Handling program  using  multiple catch block.
public class MultipleCatchBlockExample {

	public static void main(String[] args) {
		try {
			// Attempting to access an invalid index of the array
			int[] a = new int[8]; // Array of size 8
			System.out.println(a[10]); // This will throw an ArrayIndexOutOfBoundsException
		} 
		catch (ArithmeticException e) {
			// This block handles ArithmeticException, such as division by zero
			System.out.println("Arithmetic Exception");
		} 
		catch (NullPointerException e1) {
			// This block handles NullPointerException, such as accessing methods on a null object
			System.out.println("NullPointerException");
		} 
		catch (NumberFormatException e2) {
			// This block handles NumberFormatException, such as invalid string-to-number conversion
			System.out.println("NumberFormatException");
		} 
		catch (ArrayIndexOutOfBoundsException e3) {
			// This block handles ArrayIndexOutOfBoundsException, such as accessing an invalid array index
			System.out.println("ArrayIndexOutOfBoundsException");
		} 
		finally {
			// The finally block executes regardless of an exception being thrown or not
			System.out.println("Finally Block Executed");
		}
	}
}
/*output:ArrayIndexOutOfBoundsException
Finally Block Executed
 */
