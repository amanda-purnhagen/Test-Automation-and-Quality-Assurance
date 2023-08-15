package CS_320.contact_service;

import java.util.HashMap;

public class ContactService {
	private HashMap<String, Contact> contactSet;
	
	//ContactService constructor
	public ContactService(HashMap<String, Contact> contactSet) {
		this.contactSet = contactSet;
	}
	
	//Getters
	public HashMap<String, Contact> getContactSet() {
		return contactSet;
	}
	
	//Add a new Contact object, checks for contactId uniqueness
	public void addContact(Contact contact) {
		if (contactSet.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("Contact ID unavailable");
		}
		
		//If contact's contactId does not throw an exception, put contact in contactSet
		contactSet.put(contact.getContactId(), contact);
	}
	
	//Delete an existing contact per contactId
	public void deleteContact(String contactId) {
		if (contactSet.containsKey(contactId)) {
			contactSet.remove(contactId);
		}
		else {
			throw new IllegalArgumentException("Contact with that contact ID does not exist");
		}
	}
	
	//Updater methods per contactId
	public void updateFirstName(String contactId, String newFirstName) {
		Contact tempContact = contactSet.get(contactId);
		
		//Check whether the existing Contact object paired with the contactId is null
		//If not null, set firstName to newFirstName
		if (tempContact != null) {
			tempContact.setFirstName(newFirstName);
		}
	}
	
	public void updateLastName(String contactId, String newLastName) {
		Contact tempContact = contactSet.get(contactId);
		
		//Check whether the existing Contact object paired with the contactId is null
		//If not null, set lastName to newLastName
		if (tempContact != null) {
			tempContact.setLastName(newLastName);
		}
	}
	
	public void updatePhone(String contactId, String newPhone) {
		Contact tempContact = contactSet.get(contactId);
		
		//Check whether the existing Contact object paired with the contactId is null
		//If not null, set phone to newPhone
		if (tempContact != null) {
			tempContact.setPhone(newPhone);
		}
	}
	
	public void updateAddress(String contactId, String newAddress) {
		Contact tempContact = contactSet.get(contactId);
		
		//Check whether the existing Contact object paired with the contactId is null
		//If not null, set address to newAddress
		if (tempContact != null) {
			tempContact.setAddress(newAddress);
		}
	}
}