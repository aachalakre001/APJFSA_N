package CoreJava;

// Create a bean class using Employee details (EmpId, EmpName, EmpAge, Empsalary)
class Employee {
	// Private fields for employee details
	private int EmpId;         // Employee ID
	private String EmpName;    // Employee Name
	private int EmpAge;        // Employee Age
	private double Empsalary;   // Employee Salary

	// Default constructor
	public Employee() {

	}

	// Getter and setter methods for EmpId
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}

	// Getter and setter methods for EmpName
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}

	// Getter and setter methods for EmpAge
	public int getEmpAge() {
		return EmpAge;
	}
	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}

	// Getter and setter methods for Empsalary
	public double getEmpsalary() {
		return Empsalary;
	}
	public void setEmpsalary(double empsalary) {
		Empsalary = empsalary;
	}
}

// Main class to demonstrate the Employee bean
public class JavaBeansClass {

	public static void main(String[] args) {
		// Create an instance of Employee
		Employee e = new Employee();

		// Set employee details using setter methods
		e.setEmpId(101);
		e.setEmpName("Aachal Akre");
		e.setEmpAge(23);
		e.setEmpsalary(25980.89);

		// Display employee details using getter methods
		System.out.println("The Employee id is " + e.getEmpId());
		System.out.println("The Employee name is " + e.getEmpName());
		System.out.println("The Employee age is " + e.getEmpAge());
		System.out.println("The Employee salary is " + e.getEmpsalary());
	}
}

/* Output:
The Employee id is 101
The Employee name is Aachal Akre
The Employee age is 23
The Employee salary is 25980.89
 */
