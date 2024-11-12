package CoreJava;
/*WAP for printing pattern1
1
1 2
1 2 3
1 2 3 4
 */
public class NumberPattern {

	public static void main(String[] args) {
		// Number of rows in the pattern
		int rows = 4;

		// Loop through each row
		for (int i = 1; i <= rows; i++) {
			// Loop to print numbers from 1 to i
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			// Move to the next line after each row
			System.out.println();
		}
	}
}
/*output :
1 
1 2 
1 2 3 
1 2 3 4 
 */
