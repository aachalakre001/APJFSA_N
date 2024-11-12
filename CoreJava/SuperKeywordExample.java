package CoreJava;
//Write a Java program  to invoke parent class constructor using super keyword.

class Parent // Parent class
{
	// Constructor of Parent class
	Parent() {
		System.out.println("Parent class constructor called");
	}
}

class Child extends Parent // Child class
{
	// Constructor of Child class
	Child() {
		//using super keyword to call the parent class constructor
		super();
		System.out.println("Child class constructor called");
	}
}

public class SuperKeywordExample {
	public static void main(String[] args) {
		// Creating an object of Child class
		Child c = new Child();
	}
}
/*output:Parent class constructor called
Child class constructor called
 */
