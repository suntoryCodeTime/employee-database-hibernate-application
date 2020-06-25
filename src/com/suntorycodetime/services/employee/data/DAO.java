package com.suntorycodetime.services.employee.data;

import com.suntorycodetime.services.employee.data.entity.Employee;

public interface DAO {
	public Employee getEmployee(int id);
	public void addEmployee(Employee employee);
	public void deleteEmployee(int id);
}
