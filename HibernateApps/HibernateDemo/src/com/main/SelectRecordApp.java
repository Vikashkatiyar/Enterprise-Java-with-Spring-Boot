package com.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.model.Employee;
import com.util.HibernateUtil;

public class SelectRecordApp {

	public static void main(String[] args) {
		
        Session session=HibernateUtil.getSession();
        Employee employee=null;
        int id=7;
        
        try {
			if(session!=null) {
				employee=session .load(Employee.class, id);
			}
			
			System.out.println(employee);
		} catch (HibernateException e) {
			System.out.println("Employee record not found for the given id :: "+ id);
		}
	}

}
