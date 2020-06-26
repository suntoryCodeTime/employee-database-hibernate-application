package com.suntorycodetime.services.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.suntorycodetime.services.employee.business.BusinessService;
import com.suntorycodetime.services.employee.business.impl.BusinessServiceImpl;
import com.suntorycodetime.services.employee.data.DAO;
import com.suntorycodetime.services.employee.data.impl.HibernateDAO;


@Configuration
public class EmployeeServiceConfig {

	// define bean for our dao service
	@Bean
	public DAO hibernateDaoService() {
		return new HibernateDAO();
	}
	
	// define bean for our business service and inject dependency
	@Bean
	public BusinessService businessService() {
		return new BusinessServiceImpl(hibernateDaoService()); //Calling bean method up top that will give is a reference to a bean
	}
}
