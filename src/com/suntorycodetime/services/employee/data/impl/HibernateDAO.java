package com.suntorycodetime.services.employee.data.impl;

import com.suntorycodetime.services.employee.data.DAO;
import com.suntorycodetime.services.employee.data.entity.Employee;

public class HibernateDAO implements DAO {

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return new Employee("Hello World", "Hola Mundo", "HELLO");
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub

	}

}
