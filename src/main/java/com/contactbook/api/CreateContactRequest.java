package com.contactbook.api;

import java.time.*;

public class CreateContactRequest {
	
	String firstName;
	String lastName;
	String emailAddress; // optional; may be null
	Integer phoneNumber; // optional;  may be null
	LocalDate birthday; // optional; may be null
	String notes; // optional; may be null

}
