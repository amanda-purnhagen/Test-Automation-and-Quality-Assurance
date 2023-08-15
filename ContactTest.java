package CS_320.contact_service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ContactTest {
	//Contact object creation test
	@Test
	void testContact() {
		Contact theContact = new Contact("00000001", "John", "Lennon", "2145551234", "123 Abbey Road");
		
		assertTrue(theContact.getContactId().equals("00000001"));
		assertTrue(theContact.getFirstName().equals("John"));
		assertTrue(theContact.getLastName().equals("Lennon"));
		assertTrue(theContact.getPhone().equals("2145551234"));
		assertTrue(theContact.getAddress().equals("123 Abbey Road"));
	}
	
	//contactId tests
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "John", "Lennon", "2145551234", "123 Abbey Road");
		});
	}
	
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "John", "Lennon", "2145551234", "123 Abbey Road");
		});
	}
	
	//firstName tests
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000001", "Jonathan901", "Lennon", "2145551234", "123 Abbey Road");
		});
	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000001", null, "Lennon", "2145551234", "123 Abbey Road");
		});
	}
	
	//lastName tests
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000001", "John", "Lennon78901", "2145551234", "123 Abbey Road");
		});
	}
	
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000001", "John", null, "2145551234", "123 Abbey Road");
		});
	}
	
	//phone tests
	@Test
	void testPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000001", "John", "Lennon", "214555123", "123 Abbey Road");
		});
	}
	
	@Test
	void testPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000001", "John", "Lennon", "21455512345", "123 Abbey Road");
		});
	}
	
	@Test
	void testPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000001", "John", "Lennon", null, "123 Abbey Road");
		});
	}
	
	//address tests
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000001", "John", "Lennon", "2145551234", "123 Abbey Road56789012345678901");
		});
	}
	
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000001", "John", "Lennon", "2145551234", null);
		});
	}
	
	//setFirstName() test
	@Test
	void testSetFirstName() {
		Contact theContact = new Contact("00000001", "John", "Lennon", "2145551234", "123 Abbey Road");
		
		theContact.setFirstName("Paul");
		
		assertTrue(theContact.getFirstName().equals("Paul"));
	}
	
	//setLastName() test
	@Test
	void testSetLastName() {
		Contact theContact = new Contact("00000001", "John", "Lennon", "2145551234", "123 Abbey Road");
		
		theContact.setLastName("McCartney");
		
		assertTrue(theContact.getLastName().equals("McCartney"));
	}
	
	//setPhone() test
	@Test
	void testSetPhone() {
		Contact theContact = new Contact("00000001", "John", "Lennon", "2145551234", "123 Abbey Road");
		
		theContact.setPhone("2145551111");
		
		assertTrue(theContact.getPhone().equals("2145551111"));
	}
	
	//setAddress() test
	@Test
	void testSetAddress() {
		Contact theContact = new Contact("00000001", "John", "Lennon", "2145551234", "123 Abbey Road");
		
		theContact.setAddress("123 Walton Road");
		
		assertTrue(theContact.getAddress().equals("123 Walton Road"));
	}
}
