/* Name: 			Amanda Purnhagen
   Date: 			6 August 2023
   Project:			Contact service to demonstrate ability to test software using JUnit 5 and Maven.
   Version:			3.0
*/

package CS_320.contact_service;

public class Contact {
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		
		//Determine contactId validity
		//Note: The ContactService class determines if contactId is unique
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		
		//Determine firstName validity
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		//Determine lastName validity
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		//Determine phone validity
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		//Determine address validity
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}

	//Getters and setters
	public String getContactId() {
		return contactId;
	}
	
	//Absence of contactId setter due to contactId being final
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String newFirstName) {
		//Check validity of newFirstName
		if (newFirstName == null || newFirstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		//If newFirstName does not throw an exception, set newFirstName equal to firstName
		this.firstName = newFirstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String newLastName) {
		//Check validity of newLastName
		if (newLastName == null || newLastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		//If newLastName does not throw an exception, set newLastName equal to lastName
		this.lastName = newLastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String newPhone) {
		//Check validity of newPhone
		if (newPhone == null || newPhone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		//If newPhone does not throw an exception, set newPhone equal to phone
		this.phone = newPhone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String newAddress) {
		//Check validity of newAddress
		if (newAddress == null || newAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		//If newAddress does not throw an exception, set newAddress equal to address
		this.address = newAddress;
	}
}