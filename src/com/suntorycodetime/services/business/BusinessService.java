package com.suntorycodetime.services.business;

import java.util.List;

import com.suntorycodetime.services.employee.data.entity.Employee;

public interface BusinessService {
	public Employee getEmployee(int id);
	public void addEmployee(Employee employee);
	public void deleteEmployee(int id);
	public List<Employee> getEmployees(String company);
}
