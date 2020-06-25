package com.suntorycodetime.services.business;

import com.suntorycodetime.services.employee.data.entity.Employee;

public interface BusinessService {
	public Employee getEmployee(int id);
	public void addEmployee(Employee employee);
	public void deleteEmployee(int id);
}
