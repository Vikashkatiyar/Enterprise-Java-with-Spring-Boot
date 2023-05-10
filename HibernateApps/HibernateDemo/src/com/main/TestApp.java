package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class TestApp {

	public static void main(String[] args) {
		
       
		//step1. Creating a configure object
	    Configuration cfg=new Configuration();
		
		//step 2.configure hibernate.cfg.xml file to configuration object
		cfg.configure();
		
		//step3 Create SessionFactory Object
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		
		
		//ste4  Get the session Object from sessionFactory
		Session session=sessionFactory.openSession();
		
		//Step5 Begin transaction within a session
		Transaction transaction=session.beginTransaction();
		
		Employee employee=new Employee();
		employee.setEmpId(7);
		employee.setEnpName("Dhoni");
		employee.setEmpSal(256.7);
		
		
		//step6 perform operations
		session.save(employee);
		
		//step 7.perform transaction
		
		transaction.commit();
		
		// step 8close the session
		
		session.close();
		
		
		
		
	}

}
