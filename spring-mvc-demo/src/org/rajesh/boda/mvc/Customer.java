package org.rajesh.boda.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.rajesh.boda.validations.CourseCode;

public class Customer {

	@NotNull(message = "is required")
	@Size(min = 4, message = "min size criteria (4 chars) doesn't met")
	private String firstName;

	@NotNull(message = "is required")
	@Size(min = 4, message = "min size criteria (4 chars) doesn't met")
	private String lastName;

	@NotNull(message = "is required")
	@Min(value = 0, message = "Min value is 0")
	@Max(value = 10, message = "Max value is 10")
	private Integer freePasses;

	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits allowed")
	private String postalCode;

	@CourseCode(message="This should start with Raja/Sandy, Did you get it??!!")
	private String courseCode;
	
	public String getFirstName() {
		return firstName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
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


	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}

