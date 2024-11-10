package CoreJava;

//Class representing an Address
class Address {
	private String street;
	private String city;
	private String state;
	private String zipCode;

	// Constructor to initialize Address
	public Address(String street, String city, String state, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	// Getter methods for Address attributes
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipCode() {
		return zipCode;
	}

	// Method to display address information
	public void displayAddress() {
		System.out.println("Street: " + street);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("Zip Code: " + zipCode);
	}
}

//Test the Address class
public class TestAddress {
	public static void main(String[] args) {
		Address address = new Address("23, manewada road", "Nagpur", "Maharashtra", "440034");
		address.displayAddress();
	}
}
/*Output:Street: 23, manewada road
City: Nagpur
State: Maharashtra
Zip Code: 440034
 */