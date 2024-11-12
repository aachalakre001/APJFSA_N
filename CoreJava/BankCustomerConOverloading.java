package CoreJava;

class BankCustomerConOverloading {
	// Fields
	private String acno;   // Account number
	private String atype;  // Account type
	private double amt;    // Amount

	// Default constructor
	public BankCustomerConOverloading() {
		this.acno = "Unknown";
		this.atype = "Unknown";
		this.amt = 0.0;
	}

	// Parameterized constructor (all fields)
	public BankCustomerConOverloading(String acno, String atype, double amt) {
		this.acno = acno;
		this.atype = atype;
		this.amt = amt;
	}

	// Parameterized constructor (acno and atype only)
	public BankCustomerConOverloading(String acno, String atype) {
		this.acno = acno;
		this.atype = atype;
		this.amt = 0.0; // Default amount
	}

	// Getter methods
	public String getAcno() {
		return acno;
	}

	public String getAtype() {
		return atype;
	}

	public double getAmt() {
		return amt;
	}

	// Method to display customer information
	public void displayCustomerInfo() {
		System.out.println("Account Number: " + acno);
		System.out.println("Account Type: " + atype);
		System.out.println("Amount: " + amt);
	}

	// Main method to test the class
	public static void main(String[] args) {
		// Using default constructor
		BankCustomerConOverloading customer1 = new BankCustomerConOverloading();
		customer1.displayCustomerInfo();

		System.out.println(); // For spacing

		// Using parameterized constructor (all fields)
		BankCustomerConOverloading customer2 = new BankCustomerConOverloading("123456", "Savings", 1500.75);
		customer2.displayCustomerInfo();

		System.out.println(); // For spacing

		// Using parameterized constructor (acno and atype only)
		BankCustomerConOverloading customer3 = new BankCustomerConOverloading("789012", "Checking");
		customer3.displayCustomerInfo();
	}
}
/*output:Account Number: Unknown
Account Type: Unknown
Amount: 0.0

Account Number: 123456
Account Type: Savings
Amount: 1500.75

Account Number: 789012
Account Type: Checking
Amount: 0.0
 */
