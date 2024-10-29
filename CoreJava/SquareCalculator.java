package CoreJava;
//WAP for calculating Square and perimeter of a Square
public class SquareCalculator {
	public static void main(String[] args) {
    {	//to calculate area and perimeter 
	int sideLength = 12; // side length
	int area = sideLength * sideLength; // Area = side^2
       	int perimeter = 4 * sideLength;      // Perimeter = 4 * side
        System.out.println("side length of a square:"+sideLength);
	System.out.println("Area of a square is: "+area);
	System.out.println("Perimeter of a square is: "+perimeter);
    }
}
/*output:
side length of a square:12
Area of a square is: 144
Perimeter of a square is: 48
 */
