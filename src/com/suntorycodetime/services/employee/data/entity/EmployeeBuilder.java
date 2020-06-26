package com.suntorycodetime.services.employee.data.entity;

public class EmployeeBuilder {
	private String firstName;
	private String lastName;
	private String company;
	
	public EmployeeBuilder() {
		super();
	}
		
	/**
	 * @param firstName the firstName to set
	 */
	public EmployeeBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public EmployeeBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * @param company the company to set
	 */
	public EmployeeBuilder setCompany(String company) {
		this.company = company;
		return this;
	}

	public Employee build() {
		return new Employee(firstName, lastName, company);
	}
}
