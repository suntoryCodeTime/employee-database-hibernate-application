package com.suntorycodetime.services.employee.resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suntorycodetime.services.business.BusinessService;
import com.suntorycodetime.services.employee.config.EmployeeServiceConfig;

public class EmployeeDatabaseApplicationResource {

	public static void main(String[] args) {
		//Read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeServiceConfig.class);
		
		//Get the bean from spring container
		BusinessService br = context.getBean("businessService", BusinessService.class);
		BusinessService br2 = context.getBean("businessService", BusinessService.class);
		
		//Call method on the bean
		System.out.println("Does br equal br2: " + (br == br2));
		
		//Close context
		context.close();
	}

}
