package CoreJava;

//Base class
class Doctor {
	public void diagnose() {
		System.out.println("Diagnosing the patient...");
	}

	public void prescribeMedication() {
		System.out.println("Prescribing medication...");
	}
}

//Derived class Surgeon (Multilevel inheritance: Doctor -> Surgeon)
class Surgeon extends Doctor {
	public void performSurgery() {
		System.out.println("Performing surgery...");
	}

	// Overriding diagnose method
	@Override
	public void diagnose() {
		System.out.println("Diagnosing and preparing for surgery...");
	}
}

//Derived class Nurse (Multilevel inheritance: Doctor -> Nurse)
class Nurse extends Doctor {
	public void administerMedicine() {
		System.out.println("Administering medicine...");
	}

	// Overriding diagnose method
	@Override
	public void diagnose() {
		System.out.println("Assisting doctor in diagnosis...");
	}
}

//Test the Multilevel Inheritance and method overriding
public class TestMultilevelInheritance {
	public static void main(String[] args) {
		Surgeon surgeon = new Surgeon();
		Nurse nurse = new Nurse();

		// Method overriding in Surgeon and Nurse classes
		surgeon.diagnose();   // Overridden method in Surgeon
		surgeon.performSurgery();

		nurse.diagnose();     // Overridden method in Nurse
		nurse.administerMedicine();
	}
}
/*output:Diagnosing and preparing for surgery...
Performing surgery...
Assisting doctor in diagnosis...
Administering medicine...
 */