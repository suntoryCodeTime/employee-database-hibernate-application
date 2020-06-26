package com.suntorycodetime.services.employee.data.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suntorycodetime.services.employee.data.DAO;
import com.suntorycodetime.services.employee.data.entity.Employee;

public class HibernateDAO implements DAO {
	
	private SessionFactory factory;
	private Session session;
	
	private List<Employee> employees;
	private Employee employee;
	
	
	@PostConstruct
	private void doStartUp() {
		// create session factory
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
	}
	
	@PreDestroy
	private void doCleanUp() {
		factory.close();
	}
	
	public HibernateDAO() {
		super();
		System.out.println(">> In HibernateDAO Default Constructor");
	}

	@Override
	public Employee getEmployee(int id) {	
		//Get a new session, start a transaction
		session = factory.getCurrentSession();
		session.beginTransaction();
		
		System.out.println("Getting employee....");
		employee = session.get(Employee.class, id);
		System.out.println("Retrieved Employee: " + employee);
		
		//Commit transaction
		session.getTransaction().commit();
		
		//Throw Custom Exception if emp is null
		
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		//Get a new session, start a transaction
		session = factory.getCurrentSession();
		session.beginTransaction();
		
		//Save Employee
		System.out.println("Saving the employee...");
		System.out.println(employee);
		session.save(employee);
		
		//Commit session
		session.getTransaction().commit();	
	}

	@Override
	public void deleteEmployee(int id) {
		//Get a new session, start a transaction
		session = factory.getCurrentSession();
		session.beginTransaction();
		
		//Delete Employee
		System.out.println("Deleting employee...");
		
		//Get Employee
		employee = session.get(Employee.class, id);
		
		//if null throw exception
		session.delete(employee);
		
		System.out.println("Deleted: " + employee);
		
		//commit transaction
		session.getTransaction().commit();
	}
	
	@Override
	public List<Employee> getEmployees(String company) {
		//Get a new session, start a transaction
		session = factory.getCurrentSession();
		session.beginTransaction();	
		
		employees = session.createQuery("from Employee e where e.company='"+company+"'").getResultList();
		
		System.out.println("Employees who work for " + company);
		displayEmployees(employees);
		
		//commit transaction
		session.getTransaction().commit();
		
		return employees;
	}
	
	private void displayEmployees(List<Employee> employees) {
		for(Employee emp : employees) {
			System.out.println(emp);
		}
	}

}
