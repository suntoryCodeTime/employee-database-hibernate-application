package com.suntorycodetime.services.business.impl;

import java.util.List;

import com.suntorycodetime.services.business.BusinessService;
import com.suntorycodetime.services.employee.data.DAO;
import com.suntorycodetime.services.employee.data.entity.Employee;

public class BusinessServiceImpl implements BusinessService {
	
	private DAO dao;
	
	public BusinessServiceImpl(DAO dao) {
		this.dao = dao;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployee(id);
	}

	@Override
	public void addEmployee(Employee employee) {
		dao.addEmployee(employee);
		
	}

	@Override
	public void deleteEmployee(int id) {
		dao.deleteEmployee(id);
	}

	@Override
	public List<Employee> getEmployees(String company) {
		return dao.getEmployees(company);
	}

}
