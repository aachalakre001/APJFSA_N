package CoreJava;
/*
 Write a Java program to create an interface Shape with the getArea() method.
  Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
   Implement the getArea() method for each of the three classes.
 */

interface Shape //creating Shape interface
{
	void getArea(); //creating a getArea() method in the Shape interface
}
class Rectangle implements Shape //creating Rectangle class and implements Shape interface
{
	@Override
	public void getArea() //override the getArea method in Rectangle class
	{
		System.out.println("Rectangle class getArea method");
	}
}
class Circle implements Shape //creating Circle class and implements Shape interface
{
	@Override
	public void getArea() //override the getArea method in Circle class
	{
		System.out.println("Circle class getArea method");
	}
}
class Triangle implements Shape //creating Triangle class and implements Shape interface
{
	@Override
	public void getArea() //override the getArea method in Triangle class
	{
		System.out.println("Triangle class getArea method");
	}
}
public class ShapeInterfaceExample 
{

	public static void main(String[] args)
	{
		Rectangle r=new Rectangle(); //creating Rectangle class object 
		r.getArea(); //calling rectangle class getArea method
		Circle c=new Circle(); //creating Circle class object
		c.getArea(); //calling Circle class getArea method
		Triangle t=new Triangle(); //creating Triangle class object
		t.getArea(); //calling Triangle class getArea method
	}

}

/*Output:Rectangle class getArea method
Circle class getArea method
Triangle class getArea method
 */


