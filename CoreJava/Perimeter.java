package CoreJava;

import java.util.Scanner;

class Perimeter {
	// Method to calculate the perimeter of a square
	public double calculatePerimeter(double side) {
		return 4 * side;
	}

	// Method to calculate the perimeter of a rectangle
	public double calculatePerimeter(double length, double breadth) {
		return 2 * (length + breadth);
	}

	// Method to calculate the perimeter of a circle
	public double calculatePerimeter(double radius) {
		return 2 * (22.0 / 7.0) * radius;
	}

	// Main method to test the overloaded methods
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Perimeter perimeterCalculator = new Perimeter();

		// Calculate the perimeter of a square
		System.out.print("Enter the side length of the square: ");
		double squareSide = scanner.nextDouble();
		System.out.println("Perimeter of square with side " + squareSide + " = " + perimeterCalculator.calculatePerimeter(squareSide));

		// Calculate the perimeter of a rectangle
		System.out.print("Enter the length of the rectangle: ");
		double rectangleLength = scanner.nextDouble();
		System.out.print("Enter the breadth of the rectangle: ");
		double rectangleBreadth = scanner.nextDouble();
		System.out.println("Perimeter of rectangle with length " + rectangleLength + " and breadth " + rectangleBreadth + " = " + perimeterCalculator.calculatePerimeter(rectangleLength, rectangleBreadth));

		// Calculate the perimeter of a circle
		System.out.print("Enter the radius of the circle: ");
		double circleRadius = scanner.nextDouble();
		System.out.println("Perimeter of circle with radius " + circleRadius + " = " + perimeterCalculator.calculatePerimeter(circleRadius));


	}
}
/*output:Enter the side length of the square: 23
Perimeter of square with side 23.0 = 92.0
Enter the length of the rectangle: 33
Enter the breadth of the rectangle: 43
Perimeter of rectangle with length 33.0 and breadth 43.0 = 152.0
Enter the radius of the circle: 67
Perimeter of circle with radius 67.0 = 268.0
 */
