package com.appsdeveloperblog.app.ws.ui.model.response;

import org.springframework.lang.NonNull;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class UserDetailsRequestModel {
	
	@NotNull(message="first names cannot be null")
	@Size(min=2, message="First names must not be less than 2 characters")
	private String firstName;
	
	@NotNull(message="Last name cannot be null")
	@Size(min=2, message="Last Name must not be less than 2 characters")
	private String lastName;
	
	private String email;
	private String password;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
