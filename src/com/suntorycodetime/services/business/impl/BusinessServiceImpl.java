package com.suntorycodetime.services.business.impl;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

}
