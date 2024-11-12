package CoreJava;
//Write a Java Program  to pass  this keyword as argument in the constructor call.

class Employee1 //class Employee1
{
	//creating instance variable id and name
	int id;
	String name;
	//creating constructor for Employee1
	Employee1(int id,String name)  
	{
		this.id=id;
		this.name=name;

		// Pass this instance to Student1
		Student1 s=new Student1(this);
		s.displayDetails();
	}
}
class Student1{
	private Employee1 e;

	// Constructor that accepts a Employee1 e instance
	public Student1(Employee1 e) {
		this.e=e;
	}
	// Method to show Employee1 details
	public void displayDetails() {
		System.out.println("Id:"+e.id+"\nName:"+e.name);
	}
}

public class ThisKeywordExample {

	public static void main(String[] args) {
		//creating an Employee1 e instance
		Employee1 e=new Employee1(101,"Aachal Akre");

	}
}
/*output:Id:101
Name:Aachal Akre
 */