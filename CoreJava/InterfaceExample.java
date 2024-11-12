package CoreJava;

/*Create an interface called "Person" with a method called "speak". 
  Create two classes  called "Student" and "Teacher" that implement  
  the Person interface and implement the "speak" method. 
  Create objects of both the Student and  Teacher classes and 
  call their respective "speak"  methods.
 */
interface Person //creating person interface
{
	void speak();// abstract method of a Person interface
}
class Student implements Person //creating Student class and implement Person interface
{
	@Override
	public void speak() //Student class speak method
	{
		System.out.println("Student class speak method");
	}
}
class Teacher implements Person //creating Teacher class and implement Person interface
{

	@Override
	public void speak() //Teacher class speak method
	{
		System.out.println("Teacher class speak method");
	}

}

public class InterfaceExample {

	public static void main(String[] args) {
		Student s=new Student(); //creating Student class object
		s.speak(); //calling Student class speak method 
		Teacher t=new Teacher(); //creating Teacher class object
		t.speak(); //calling Teacher class speak method 

	}

}
/*Output:Student class speak method
Teacher class speak method
 */