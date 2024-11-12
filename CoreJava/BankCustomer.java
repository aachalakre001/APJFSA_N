package CoreJava;

class BankCustomer {
	// Fields
	private String acno;   // Account number
	private String atype;  // Account type
	private double amt;    // Amount

	// Parameterized constructor
	public BankCustomer(String acno, String atype, double amt) {
		this.acno = acno;
		this.atype = atype;
		this.amt = amt;
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
		// Create a BankCustomer object using the parameterized constructor
		BankCustomer customer1 = new BankCustomer("123456", "Savings", 1500.75);

		// Display customer information
		customer1.displayCustomerInfo();
	}
}
/*output:-Account Number: 123456
Account Type: Savings
Amount: 1500.75*/