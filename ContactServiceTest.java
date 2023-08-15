package CS_320.contact_service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

class ContactServiceTest {
	//Testing the creation of a HashMap of Contacts and a ContactService object with the HashMap of Contacts as the parameter
	@Test
	void testContactService() {
		HashMap<String, Contact> contactSet = new HashMap<>();
		
		ContactService theContactService = new ContactService(contactSet);
		
		assertTrue(theContactService.getContactSet().equals(contactSet));
	}
	
	//addContact and unique contactId test
	@Test
	void testContactIdDouble() {
		HashMap<String, Contact> contactSet = new HashMap<>();
		
		ContactService theContactService = new ContactService(contactSet);
		
		Contact theContact1 = new Contact("00000001", "John", "Lennon", "2145551234", "123 Abbey Road");
		Contact theContact2 = new Contact("00000001", "Yoko", "Ono", "2145550000", "123 Chuo-dori Avenue");
		
		theContactService.addContact(theContact1);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			theContactService.addContact(theContact2);
		});
	}
	
	//deleteContact test
	@Test
	void testDeleteContact() {
		HashMap<String, Contact> contactSet = new HashMap<>();
		
		ContactService theContactService = new ContactService(contactSet);
		
		Contact theContact1 = new Contact("00000001", "John", "Lennon", "2145551234", "123 Abbey Road");
		Contact theContact2 = new Contact("00000002", "Yoko", "Ono", "2145550000", "123 Chuo-dori Avenue");
		Contact theContact3 = new Contact("00000003", "Paul", "McCartney", "2145551111", "123 Walton Road");
		
		theContactService.addContact(theContact1);
		theContactService.addContact(theContact2);
		theContactService.addContact(theContact3);
		
		theContactService.deleteContact("00000002");
		
		Assertions.assertFalse(theContactService.getContactSet().containsKey("00000002"));
	}
	
	//Update firstName through ContactService test
	@Test
	void testUpdateFirstName() {
		HashMap<String, Contact> contactSet = new HashMap<>();
		
		ContactService theContactService = new ContactService(contactSet);
		
		Contact theContact = new Contact("00000001", "John", "Lennon", "2145551234", "123 Abbey Road");
		
		theContactService.addContact(theContact);
		
		theContactService.updateFirstName("00000001", "Paul");
		
		Contact tempContact = contactSet.get("00000001");
		
		assertTrue(tempContact.getFirstName().equals("Paul"));
	}
	
	//Update lastName through ContactService test
	@Test
	void testUpdateLastName() {
		HashMap<String, Contact> contactSet = new HashMap<>();
		
		ContactService theContactService = new ContactService(contactSet);
		
		Contact theContact = new Contact("00000001", "John", "Lennon", "2145551234", "123 Abbey Road");
			
		theContactService.addContact(theContact);
		
		theContactService.updateLastName("00000001", "McCartney");
		
		Contact tempContact = contactSet.get("00000001");
		
		assertTrue(tempContact.getLastName().equals("McCartney"));
	}
	
	//Update phone through ContactService test
	@Test
	void testUpdatePhone() {
		HashMap<String, Contact> contactSet = new HashMap<>();
		
		ContactService theContactService = new ContactService(contactSet);
		
		Contact theContact = new Contact("00000001", "John", "Lennon", "2145551234", "123 Abbey Road");
			
		theContactService.addContact(theContact);
		
		theContactService.updatePhone("00000001", "2145551111");
		
		Contact tempContact = contactSet.get("00000001");
		
		assertTrue(tempContact.getPhone().equals("2145551111"));
	}
	
	//Update address through ContactService test
	@Test
	void testUpdateAddress() {
		HashMap<String, Contact> contactSet = new HashMap<>();
		
		ContactService theContactService = new ContactService(contactSet);
		
		Contact theContact = new Contact("00000001", "John", "Lennon", "2145551234", "123 Abbey Road");
			
		theContactService.addContact(theContact);
		
		theContactService.updateAddress("00000001", "123 Walton Road");
		
		Contact tempContact = contactSet.get("00000001");
		
		assertTrue(tempContact.getAddress().equals("123 Walton Road"));
	}
}